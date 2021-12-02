package com.company.Client;

import java.time.LocalDate;

public class Client {
    private String name;
    private String projectName;
    private LocalDate dateOfExpire;

    public String getName() {
        return name;
    }

    public String getProjectName() {
        return projectName;
    }

    public LocalDate getDateOfExpire() {
        return dateOfExpire;
    }

    public Client(String name, String projectName, LocalDate dateOfExpire) {
        this.name = name;
        this.projectName = projectName;
        this.dateOfExpire = dateOfExpire;
    }
}
