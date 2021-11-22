/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactbookfrog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for handling the files related to input contact
 * @author Jolou
 */
public class ContactFile {
    
    // Name of Text File
    String filename = "contact_data.txt";
    File file = new File(filename);
    
    // Constructor
    public ContactFile(){
        try {
            // If file not exist then create one
            if(!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    // Method for appending or adding data inside the file 
    public boolean addData(String fname, String mname, String lname, String mnum, String email) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(String.format("%s, %s, %s, %s, %s\n", fname, mname, lname, mnum, email));
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
