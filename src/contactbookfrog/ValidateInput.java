/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactbookfrog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for Validating the input of user in contact
 * @author Jolou
 */
public class ValidateInput {
    
    // Method that Accepts Text not Numbers
    public void onlyText(java.awt.event.KeyEvent evt){
        if (Character.isDigit(evt.getKeyChar()))
           evt.consume();
    }
    
    // Checks if the user input is empty
    // Returns true when a single text field is empty 
    public boolean checkEmpty(String fname, String mname, String lname, String mnum, String email){
        return fname.equals("First Name") || fname.isBlank()  || mname.equals("Middle Name") || mname.isBlank() || lname.equals("Last Name") || lname.isBlank() || mnum.equals("Mobile Number") || mnum.isBlank() || email.equals("Email Address") || email.isBlank();
    }
   
    /**
     * Check if user mobile number is valid
     * Uses Philippine Number Format
     * Starts with either 09 or +639
     */
    public boolean validateMobileNum(String num){
        // Regex Patter for Ph Mobile Number
        String regex = "^(09|\\+639)\\d{9}$";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(num);
        return matcher.matches();
    }
    
    // Checks if the user input email is correct
    public boolean validateEmail(String email) {
        Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }
}
