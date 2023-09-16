package com.example.design.main.factory;

public class Test {
    public static void main(String[] args) {
        FileConfig fileConfig = new FileConfig();
        System.out.println(fileConfig.load("Json"));
        System.out.println(fileConfig.load("Xml"));
        System.out.println(fileConfig.load("Yaml"));
    }
}
