package com.example.codefestrevival;

import java.util.LinkedList;
import java.util.List;

public class ForCreation {

    LinkedList<String> NameBank = new LinkedList<>();
    LinkedList<String> EmailBank = new LinkedList<>();
    LinkedList<String> PasswordBank = new LinkedList<>();

    String Name;
    String Email;
    String Password;


    public void setName(String name){
        Name=name;
    }
    public void setEmail(String email){
        Email=email;
    }
    public void setPassword(String password){
        Password=password;
    }
    void addNameBank(String name){
        NameBank.add(name);
    }
    void addPasswordBank(String email){
        PasswordBank.add(email);
    }
    void addEmailBank(String pass){
        EmailBank.add(pass);
    }

    LinkedList<String> getNameBank(){
        return NameBank;
    }
    LinkedList<String> getEmailBank(){
        return EmailBank;
    }
    LinkedList<String> getPasswordBank(){
        return PasswordBank;
    }

    Boolean verifyLogin(){
        if(EmailBank.contains(Email)&&PasswordBank.contains(Password)){
            return true;
        }
        else {
            return false;
        }
    }
    String getName(){
        return Name;
    }
    String getEmail(){
        return Email;
    }
    String getPassword(){
        return Password;
    }

}
