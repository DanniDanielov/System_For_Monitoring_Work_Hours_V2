package com.company.FileAndFileFunctions;

import com.company.Client.Client;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    static Gson gson = new Gson();
    static String json;

    public void writeToFile(String filePath, Object data) {

        json = gson.toJson(data);
        try {

            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);

    }

    public List<Client> readUserFile(String filePath) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filePath));
            List<Client> client = new Gson().fromJson(reader, new TypeToken<ArrayList<Client>>() {
            }.getType());
            reader.close();
            return client;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Client> readClientFile(String filePath) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filePath));
            List<Client> users = new Gson().fromJson(reader, new TypeToken<ArrayList<Client>>() {
            }.getType());
            reader.close();
            return users;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
