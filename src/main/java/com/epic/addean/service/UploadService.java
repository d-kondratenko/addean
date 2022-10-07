package com.epic.addean.service;

import com.epic.addean.dto.UploadFile;
import com.epic.addean.dto.UploadResult;
import com.epic.addean.repository.DatabaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

@Service
@Slf4j
public class UploadService {




    @Autowired
   DatabaseRepository databaseRepository;

    public ArrayList<UploadResult> startAddEan(MultipartFile file) throws IOException {
        ArrayList<UploadFile> uploadFileList = xlsxToArray(file);
        ArrayList<UploadResult> uploadResultList = new ArrayList<>();
        for (int i=0; i < uploadFileList.size(); i ++){
            UploadFile uploadFile = uploadFileList.get(i);
            String message = databaseRepository.callProcedure(uploadFile.getProductNr(), uploadFile.getLevelNr(), uploadFile.getEanNr());
            if (message.equalsIgnoreCase("ORA-00001: unique constraint (QGUARADM.QCM_PROD_PKG_EAN_UI) violated ORA-06512: at \"QGUARADM.QCMP_BM_PRODUCT_EAN\", line 122 ORA-06512: at \"QGUARADM.LCP_ADD_EAN_TO_PRODUCT\", line 23 ORA-06512: at line 1")){
                message = "ean_nr exists at this product_nr";
            }
                UploadResult uploadResult = new UploadResult(uploadFile.getProductNr(), message);
                uploadResultList.add(uploadResult);
            }
        return uploadResultList;
        }




    public ArrayList<UploadFile> xlsxToArray(MultipartFile file) throws IOException {
        Workbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);
        ArrayList<UploadFile> uploadFileList = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            UploadFile uploadFile = new UploadFile();
            DataFormatter formatter = new DataFormatter();
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                if (!Objects.equals(formatter.formatCellValue(row.getCell(j)), "")) {
                    if (j == 0) {
                        uploadFile.setProductNr(formatter.formatCellValue(row.getCell(j)));
                    } else if (j == 1) {
                        uploadFile.setLevelNr(Integer.valueOf(formatter.formatCellValue(row.getCell(j))));
                    } else if (j == 2) {
                        uploadFile.setEanNr(row.getCell(j).getStringCellValue());
                    }
                }

            }
            uploadFileList.add(uploadFile);
        }
        return uploadFileList;
    }


}

