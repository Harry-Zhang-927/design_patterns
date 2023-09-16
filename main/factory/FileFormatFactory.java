package com.example.design.main.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FileFormatFactory {
    private static final Map<String, FileFormatParser> cachedParser= new HashMap<>();
    static {
        cachedParser.put("Json", new JsonParser());
        cachedParser.put("Xml", new XmlParser());
        cachedParser.put("Yaml", new YamlParser());
    }

    public static FileFormatParser createParser(String extension) {
        if (Objects.equals("Json", extension)) {
            return cachedParser.get("Json");
        }
        if (Objects.equals("Xml", extension)) {
            return cachedParser.get("Xml");
        }
        if (Objects.equals("Yaml", extension)) {
            return cachedParser.get("Yaml");
        }
        throw new IllegalArgumentException("Invalid format");
    }
}
