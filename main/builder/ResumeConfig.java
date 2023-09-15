package com.example.design.main.builder;

import java.util.ArrayList;
import java.util.List;

public class ResumeConfig {
    private String address;

    private String education;
    private List<String> internship;

    @Override
    public String toString() {
        return "ResumeConfig{" +
                "address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", internship=" + internship +
                '}';
    }

    private ResumeConfig (Builder builder) {
        this.address = builder.address;
        this.education = builder.education;
        this.internship = builder.internship;
    }



    public static class Builder {
        private static final String DEFAULT_ADDRESS = "null";
        private static final String DEFAULT_EDUCATION = "null";
        private static final List<String> DEFAULT_INTERNSHIP = new ArrayList<>();
        private String address = DEFAULT_ADDRESS;
        private String education = DEFAULT_EDUCATION;
        private List<String> internship = DEFAULT_INTERNSHIP;
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder education(String education) {
            this.address = education;
            return this;
        }

        public Builder internship (String internship) {
            this.internship.add(internship);
            return this;
        }

        public Builder internshipList (List<String> internship) {
            this.internship.addAll(internship);
            return this;
        }

        public ResumeConfig build() {
            return new ResumeConfig(this);
        }
    }
}
