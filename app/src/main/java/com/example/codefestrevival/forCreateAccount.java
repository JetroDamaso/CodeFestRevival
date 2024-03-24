package com.example.codefestrevival;

public class forCreateAccount {
    String Name;
    String Email;
    String Password;
    String cPassword;

    void setName(String name){
        Name=name;
    }
    void setEmail(String email){
        Email=email;
    }
    void setPassword(String password){
        Password=password;
    }
    void setCPassword(String cPassword){
        cPassword=cPassword;
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
    String getCPassword(){
        return cPassword;
    }

}
