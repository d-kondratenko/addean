package com.epic.addean.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadFile {
    private String productNr;
    private Integer levelNr;
    private String eanNr;
}
