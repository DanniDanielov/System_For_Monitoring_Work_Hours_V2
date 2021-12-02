package com.company.Admin;

import com.company.Client.ClientListClass;
import com.company.InterfacesNAbstractClass.DialogNListPrint;
import com.company.Woker.Worker;

import java.util.Scanner;

public class AdminFunctionMenu extends DialogNListPrint {
    private String projectName;
    AdminFunctionsWorker adminFunctionsWorker = new AdminFunctionsWorker();

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    private void addWorker(Scanner inpot) throws Exception {
        System.out.print("name: ");
        String name = inpot.nextLine();
        System.out.print("password: ");
        String password = inpot.nextLine();

        adminFunctionsWorker.addWorker(name, password);
    }

    private void removeWorker(Scanner inpot) throws Exception {
        System.out.print("name: ");
        String name = inpot.nextLine();

        adminFunctionsWorker.removeWorker(name);
    }

    private void addClient(Scanner inpot) throws Exception {
        System.out.print("name: ");
        String name = inpot.nextLine();
        System.out.print("project name: ");
        String projectName = inpot.nextLine();
        setProjectName(projectName);
        System.out.print("date of expire 'dd,MM,yyyy': ");
        String dateOfExpire = inpot.nextLine();

        ClientListClass clientListClass = new ClientListClass();
        clientListClass.add(name, getProjectName(), dateOfExpire);
    }

    private void workerStatistic(Scanner inpot) throws Exception {
        System.out.print("name: ");
        String name = inpot.nextLine();
        System.out.print("password: ");
        String password = inpot.nextLine();

        if (adminFunctionsWorker.workerList.contains(name)){
            if (adminFunctionsWorker.workerList.contains(password)){
                Worker worker = new Worker(name, password);
                worker.menu(inpot);
            }else{
                throw new Exception("Invalid password for this worker");
            }
        }else{
            throw new Exception("Invalid worker name");
        }
    }

    public void menu(Scanner inpot) throws Exception {
        adminFunctionMenuPrint();
        int choice = inpot.nextInt();

        switch (choice){
            case 1 -> addWorker(inpot);
            case 2 -> removeWorker(inpot);
            case 3 -> addClient(inpot);
            case 4 -> workerStatistic(inpot);
            case 5 ->{
                break;
            }
            default -> throw new Exception("Invalid input");
        }
    }
}
