package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner inpot =new Scanner(System.in);
        Login login = new Login();
        login.login(inpot);
    }
}
