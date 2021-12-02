package com.company.Admin;

import com.company.Woker.Worker;

import java.util.ArrayList;
import java.util.List;

public class AdminFunctionsWorker {
    List<Worker> workerList = new ArrayList<>(10);

    public void addWorker(String name, String password) throws Exception {
        if (workerList.contains(name)){
            throw new Exception("This name already exist");
        }else{
            Worker worker = new Worker(name, password);
            workerList.add(worker);
        }
    }

    public void removeWorker(String name) throws Exception {
        if (workerList.contains(name)){
            workerList.remove(name);
        }else{
            throw new Exception("This worker doesn't exist!");
        }
    }
}
