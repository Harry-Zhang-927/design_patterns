package com.example.design.main.builder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("Yonyou");
        ls.add("SenseTime");

        ResumeConfig resumeConfig = new ResumeConfig.Builder()
                .address("singapore")
                .education("NTU")
                .internship("Alibaba")
                .internship("Autodesk")
                .internshipList(ls).build();

        System.out.println(resumeConfig.toString());
    }
}
