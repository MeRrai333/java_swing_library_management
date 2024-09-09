/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management;

/**
 *
 * @author User
 */
public class Category {
    private String name = "";
    
    public Category(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
}
