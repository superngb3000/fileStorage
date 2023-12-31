package com.example.filestorage;

import lombok.Data;

import java.io.InputStream;

@Data
public class File {
    private String id;
    private String title;
    private InputStream stream;
}