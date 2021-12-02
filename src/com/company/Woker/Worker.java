package com.company.Woker;

import java.util.Scanner;

public class Worker {
    private String name;
    private String password;
    private int workHours;
    com.company.Woker.WorkerAction workerAction = new com.company.Woker.WorkerAction();

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public Worker(String name, String password){
        this.name = name;
        this.password = password;
    }

    public void menu(Scanner inpot) throws Exception {
        System.out.print("hours: ");
        int workHoursInput = inpot.nextInt();
        setWorkHours(workHoursInput);
        if (workHours > 8){
            throw new Exception("Sorry but you can't work more than 8 hours per day");
        }else{
            workerAction.workingHours(inpot, getWorkHours(), getName());
        }
    }
}
