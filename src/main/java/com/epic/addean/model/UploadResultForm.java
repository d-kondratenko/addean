package com.epic.addean.model;

import com.epic.addean.dto.UploadResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UploadResultForm {
    ArrayList<UploadResult> results;

}
