package com.company.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ClientListClass {
    List<Client> clientList = new ArrayList<>(10);

    public List<Client> getClientList() throws Exception {
        if (clientList.size() >= 1 && clientList.size() <= 10){
            return clientList;
        }else{
            throw new Exception("The list is empty!");
        }
    }

    public void add(String name, String projectName, String dateOfExpire) throws Exception {
        if (clientList.size() >= 10){
            throw new Exception("The list is full!");
        }
        if(clientList.contains(name)){
            throw new Exception("This user already exist");
        }else {
            if (clientList.contains(projectName)){
                throw new Exception("This project already exist1");
            }else{
                try {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate finalDate = LocalDate.parse(dateOfExpire, dtf);
                    Client client = new Client(name, projectName, finalDate);
                    clientList.add(client);
                }catch (Exception e){
                    System.out.println("Invalid date format!");
                }
            }
        }
    }
}
