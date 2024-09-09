/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management;

/**
 *
 * @author User
 */
public class Book {
    private String id = "";
    private String name = "";
    private String category = "";
    private String author = "";
    private String status = "";
    
    public Book(String i, String n, String c, String a, String s){
        this.id = i;
        this.name = n;
        this.category = c;
        this.author = a;
        this.status = s;
    }
    public Book(String text){
        String[] tableArray = text.split(",");
        this.id = tableArray[0];
        this.name = tableArray[1];
        this.category = tableArray[2];
        this.author = tableArray[3];
        this.status = tableArray[4];
    }
    
    public String[] getTableArray(){
        return new String[] {String.valueOf(this.id), this.name, this.category, this.author, this.status};
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String c){
        this.category = c;
    }
    
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String a){
        this.author = a;
    }
    
    public String getId(){
        return this.id;
    }
    public void setId(String i){
        this.id = i;
    }
    
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String s){
        this.status = s;
    }
    
    public String getTextFile(){
        return String.valueOf(this.id)+","+this.name+","+this.category+","+this.author+","+this.status;
    }
}
