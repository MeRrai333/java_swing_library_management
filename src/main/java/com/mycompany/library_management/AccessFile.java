/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author merrai
 */
public class AccessFile {
    static public void writeFile(String text, String path){
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static public void apeendFile(String text, String path){
        try {
        FileWriter myWriter = new FileWriter(path, true);
            String listString = text+"\n";
            myWriter.write(listString);
            myWriter.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
    
    static public String[] readFileByLine(String path){
        List<String> out = new ArrayList<>();
        
        BufferedReader reader;
	try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();

            while (line != null) {
                out.add(line);
		line = reader.readLine();
            }

            reader.close();
	} catch (IOException e) {
            e.printStackTrace();
	}
        return out.toArray(new String[out.size()]);
    }
    
    static public boolean isFileExist(String text, String path){
        File f = new File(path);
        if(!f.exists()) { 
            AccessFile.writeFile(text, path);
            return false;
        }
        return true;
    }
}
