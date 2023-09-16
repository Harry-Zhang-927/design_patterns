package com.example.design.main.factory;

public class FileConfig {

    public String load(String extension) {
        FileFormatParser parser = FileFormatFactory.createParser(extension);
        return parser.loadParserRule();
    }
}
