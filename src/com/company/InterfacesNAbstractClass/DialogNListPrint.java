package com.company.InterfacesNAbstractClass;
import com.company.Login;
import java.util.List;
import java.util.Scanner;

public abstract class DialogNListPrint {
    Login login = new Login();

    public void printingClientsList(List clientList){
        System.out.println(clientList.toString());
    }

    public void adminFunctionMenuPrint(){
        System.out.println("1 - add worker");
        System.out.println("2 - remove worker");
        System.out.println("3 - add client");
        System.out.println("4 - worker statistic");
        System.out.println("5 - exit");
    }

    public void loginDialog(Scanner inpot) throws Exception {
        System.out.println("Hello and welcome to our system for monitor the work hours in you company.");
        System.out.println("First you have to log either as 'admin' or 'worker' .");
        System.out.println("For more information about admin privileges - press 1");
        System.out.println("For more information about worker privileges - press 2");
        System.out.println("To continue to login - press 0");

        int ans = inpot.nextInt();
        switch (ans){
            case 0 ->login.login(inpot);
            case 1 ->adminPriv();
            case 2 ->workerPriv();
            default -> throw new Exception("Invalid input");
        }
    }

    public void adminPriv(){
        //TODO
    }

    public void workerPriv(){
        //TODO
    }


}
