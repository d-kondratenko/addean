package com.epic.addean.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.epic.addean.repository.DatabaseRepository;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.multipart.MultipartFile;

@ContextConfiguration(classes = {UploadService.class})
@ExtendWith(SpringExtension.class)
class UploadServiceTest {
    @MockBean
    private DatabaseRepository databaseRepository;

    @Autowired
    private UploadService uploadService;

    /**
     * Method under test: {@link UploadService#startAddEan(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStartAddEan() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException: No valid entries or contents found, this is not a valid OOXML (Office Open XML) file
        //       at org.apache.poi.openxml4j.opc.ZipPackage.getPartsImpl(ZipPackage.java:296)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.getParts(OPCPackage.java:743)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:315)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //       at com.epic.addean.service.UploadService.startAddEan(UploadService.java:31)
        //   In order to prevent startAddEan(MultipartFile)
        //   from throwing NotOfficeXmlFileException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   startAddEan(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        uploadService.startAddEan(new MockMultipartFile("Name", "AAAAAAAA".getBytes("UTF-8")));
    }

    /**
     * Method under test: {@link UploadService#startAddEan(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStartAddEan2() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.apache.poi.EmptyFileException: The supplied file was empty (zero bytes long)
        //       at org.apache.poi.util.IOUtils.peekFirstNBytes(IOUtils.java:144)
        //       at org.apache.poi.poifs.filesystem.FileMagic.valueOf(FileMagic.java:209)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.verifyZipHeader(ZipHelper.java:143)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.openZipStream(ZipHelper.java:175)
        //       at org.apache.poi.openxml4j.opc.ZipPackage.<init>(ZipPackage.java:130)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:312)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //       at com.epic.addean.service.UploadService.startAddEan(UploadService.java:31)
        //   In order to prevent startAddEan(MultipartFile)
        //   from throwing EmptyFileException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   startAddEan(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        uploadService.startAddEan(new MockMultipartFile("Name", new byte[]{}));
    }

    /**
     * Method under test: {@link UploadService#startAddEan(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testStartAddEan3() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.web.multipart.MultipartFile.getInputStream()" because "file" is null
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //       at com.epic.addean.service.UploadService.startAddEan(UploadService.java:31)
        //   In order to prevent startAddEan(MultipartFile)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   startAddEan(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        uploadService.startAddEan(null);
    }

    /**
     * Method under test: {@link UploadService#xlsxToArray(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testXlsxToArray() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException: No valid entries or contents found, this is not a valid OOXML (Office Open XML) file
        //       at org.apache.poi.openxml4j.opc.ZipPackage.getPartsImpl(ZipPackage.java:296)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.getParts(OPCPackage.java:743)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:315)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //   In order to prevent xlsxToArray(MultipartFile)
        //   from throwing NotOfficeXmlFileException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   xlsxToArray(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        uploadService.xlsxToArray(new MockMultipartFile("Name", "AAAAAAAA".getBytes("UTF-8")));
    }

    /**
     * Method under test: {@link UploadService#xlsxToArray(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testXlsxToArray2() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.apache.poi.EmptyFileException: The supplied file was empty (zero bytes long)
        //       at org.apache.poi.util.IOUtils.peekFirstNBytes(IOUtils.java:144)
        //       at org.apache.poi.poifs.filesystem.FileMagic.valueOf(FileMagic.java:209)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.verifyZipHeader(ZipHelper.java:143)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.openZipStream(ZipHelper.java:175)
        //       at org.apache.poi.openxml4j.opc.ZipPackage.<init>(ZipPackage.java:130)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:312)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //   In order to prevent xlsxToArray(MultipartFile)
        //   from throwing EmptyFileException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   xlsxToArray(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        uploadService.xlsxToArray(new MockMultipartFile("Name", new byte[]{}));
    }

    /**
     * Method under test: {@link UploadService#xlsxToArray(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testXlsxToArray3() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.web.multipart.MultipartFile.getInputStream()" because "file" is null
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //   In order to prevent xlsxToArray(MultipartFile)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   xlsxToArray(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        uploadService.xlsxToArray(null);
    }

    /**
     * Method under test: {@link UploadService#xlsxToArray(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testXlsxToArray4() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException: No valid entries or contents found, this is not a valid OOXML (Office Open XML) file
        //       at org.apache.poi.openxml4j.opc.ZipPackage.getPartsImpl(ZipPackage.java:296)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.getParts(OPCPackage.java:743)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:315)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //   In order to prevent xlsxToArray(MultipartFile)
        //   from throwing NotOfficeXmlFileException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   xlsxToArray(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MockMultipartFile mockMultipartFile = mock(MockMultipartFile.class);
        when(mockMultipartFile.getInputStream()).thenReturn(new ByteArrayInputStream("AAAAAAAA".getBytes("UTF-8")));

        // Act
        uploadService.xlsxToArray(mockMultipartFile);
    }

    /**
     * Method under test: {@link UploadService#xlsxToArray(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testXlsxToArray5() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.io.InputStream.read(byte[], int, int)" because "this.in" is null
        //       at java.io.DataInputStream.read(DataInputStream.java:151)
        //       at org.apache.commons.io.input.BoundedInputStream.read(BoundedInputStream.java:123)
        //       at org.apache.poi.util.IOUtils.copy(IOUtils.java:408)
        //       at org.apache.poi.util.IOUtils.copy(IOUtils.java:387)
        //       at org.apache.poi.util.IOUtils.peekFirstNBytes(IOUtils.java:140)
        //       at org.apache.poi.poifs.filesystem.FileMagic.valueOf(FileMagic.java:209)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.verifyZipHeader(ZipHelper.java:143)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.openZipStream(ZipHelper.java:175)
        //       at org.apache.poi.openxml4j.opc.ZipPackage.<init>(ZipPackage.java:130)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:312)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //   In order to prevent xlsxToArray(MultipartFile)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   xlsxToArray(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MockMultipartFile mockMultipartFile = mock(MockMultipartFile.class);
        when(mockMultipartFile.getInputStream()).thenReturn(mock(DataInputStream.class));

        // Act
        uploadService.xlsxToArray(mockMultipartFile);
    }

    /**
     * Method under test: {@link UploadService#xlsxToArray(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testXlsxToArray6() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException: No valid entries or contents found, this is not a valid OOXML (Office Open XML) file
        //       at org.apache.poi.openxml4j.util.ZipArchiveThresholdInputStream.getNextEntry(ZipArchiveThresholdInputStream.java:156)
        //       at org.apache.poi.openxml4j.util.ZipInputStreamZipEntrySource.<init>(ZipInputStreamZipEntrySource.java:94)
        //       at org.apache.poi.openxml4j.opc.ZipPackage.<init>(ZipPackage.java:132)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:312)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //   In order to prevent xlsxToArray(MultipartFile)
        //   from throwing NotOfficeXmlFileException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   xlsxToArray(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MockMultipartFile mockMultipartFile = mock(MockMultipartFile.class);
        when(mockMultipartFile.getInputStream()).thenReturn(mock(ObjectInputStream.class));

        // Act
        uploadService.xlsxToArray(mockMultipartFile);
    }

    /**
     * Method under test: {@link UploadService#xlsxToArray(MultipartFile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testXlsxToArray7() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.io.IOException: An error occurred
        //       at org.apache.poi.util.IOUtils.peekFirstNBytes(IOUtils.java:155)
        //       at org.apache.poi.poifs.filesystem.FileMagic.valueOf(FileMagic.java:209)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.verifyZipHeader(ZipHelper.java:143)
        //       at org.apache.poi.openxml4j.opc.internal.ZipHelper.openZipStream(ZipHelper.java:175)
        //       at org.apache.poi.openxml4j.opc.ZipPackage.<init>(ZipPackage.java:130)
        //       at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:312)
        //       at org.apache.poi.ooxml.util.PackageHelper.open(PackageHelper.java:59)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:289)
        //       at org.apache.poi.xssf.usermodel.XSSFWorkbook.<init>(XSSFWorkbook.java:285)
        //       at com.epic.addean.service.UploadService.xlsxToArray(UploadService.java:49)
        //   In order to prevent xlsxToArray(MultipartFile)
        //   from throwing IOException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   xlsxToArray(MultipartFile).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MockMultipartFile mockMultipartFile = mock(MockMultipartFile.class);
        when(mockMultipartFile.getInputStream()).thenReturn(mock(ObjectInputStream.class));
        new IOException("An error occurred");
        new IOException("An error occurred");

        // Act
        uploadService.xlsxToArray(mockMultipartFile);
    }
}

