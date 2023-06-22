package com.sbs.exam.app10.app.FileUpload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class ResultData<T> {
    String resultCode;
    String msg;
    T body;
}