package com.company.Woker;

import com.company.Client.ClientListClass;
import com.company.InterfacesNAbstractClass.DialogNListPrint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WorkerAction extends DialogNListPrint {
    private String projectName;

    ClientListClass clientListClass = new ClientListClass();

    HashMap<String, Integer> statisticHashMap = new HashMap<>();
    List<HashMap> hashMapList = new ArrayList<>();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private String projectName(Scanner inpot) throws Exception {
        printingClientsList(clientListClass.getClientList());

        System.out.print("project name: ");
        String projectName = inpot.nextLine();
        if (clientListClass.getClientList().contains(projectName)){
            return projectName;
        }else{
            throw new Exception("This project doesn't exist!");
        }
    }

    public void workingHours(Scanner inpot, int workHours, String workerName) throws Exception {
        setProjectName(projectName(inpot));

        String workerNProjectName = (workerName + " : " + getProjectName());

        statisticHashMap.put(workerNProjectName, workHours);
        hashMapList.add(statisticHashMap);
    }
}
