package com.epic.addean.controller;

import com.epic.addean.dto.UploadFile;
import com.epic.addean.dto.UploadResult;
import com.epic.addean.model.UploadForm;
import com.epic.addean.model.UploadResultForm;
import com.epic.addean.repository.DatabaseRepository;
import com.epic.addean.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.ArrayList;

@Controller
@Slf4j
public class AddEanController {

    @Autowired
    private DatabaseRepository databaseRepository;

    @Autowired
    UploadService uploadService;

    @GetMapping("/uploadform")
    public String getUploadForm(Model model){
        model.addAttribute("uploadform", new UploadForm());
        return "uploadform";
    }

    @PostMapping("/uploadform")
    public Object postUploadForm(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        log.info(file.toString());
        ArrayList<UploadResult> results =  uploadService.startAddEan(file);
        log.info(results.toString());
        model.addAttribute("uploadresult", results);
        return "uploadresult";

    }
}
