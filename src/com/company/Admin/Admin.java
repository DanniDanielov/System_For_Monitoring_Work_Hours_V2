package com.company.Admin;

import java.util.Scanner;

public class Admin {
    private String password;
    AdminFunctionMenu adminFunctionMenu = new AdminFunctionMenu();

    public String getPassword(Scanner inpot, String passwordInput) throws Exception {
        if (passwordInput.equals(this.password)){
            adminFunctionMenu.menu(inpot);
            return password;
        }else{
            throw new Exception("Invalid password, access denied");
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void check(Scanner inpot, String password) throws Exception {
        setPassword("admin");
        getPassword(inpot, password);
    }
}
