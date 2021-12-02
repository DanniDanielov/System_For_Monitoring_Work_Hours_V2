package com.company;

import com.company.Admin.Admin;
import com.company.InterfacesNAbstractClass.DialogNListPrint;
import com.company.Woker.Worker;
import com.company.Woker.WorkerAction;

import java.util.Locale;
import java.util.Scanner;

public class Login extends DialogNListPrint {
    private String workerName;

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void login(Scanner inpot) throws Exception {
        loginDialog(inpot);

        System.out.print("Who are you: ");
        String user = inpot.nextLine();
        String userLower = user.toLowerCase(Locale.ROOT);

        if (userLower.equals("admin")){
            loginAdmin(inpot);
        }else if(userLower.equals("worker")){

        }else{
            throw new Exception("Invalid input!");
        }
    }

    public void loginAdmin(Scanner inpot) throws Exception {
        System.out.print("password: ");
        String pass = inpot.nextLine();

        Admin admin = new Admin();
        admin.check(inpot, pass);
    }

    public void loginWorker(Scanner inpot) throws Exception {
        System.out.print("nickname: ");
        String name = inpot.nextLine();
        setWorkerName(name);
        System.out.print("password: ");
        String password = inpot.nextLine();

        Worker worker = new Worker(getWorkerName(), password);
        WorkerAction workerAction = new WorkerAction();

    }
}
