/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.models;

/**
 *
 * @author javedhorgan
 */
public class Product {
    private int id; 
    private String productname; 
    private String productDesc; 
    private double price;
    private String sku;
    
    //public Product(int id, String productname, String productDesc, float price, String sku) {
     //  this.id = id; 
       // this.productname = productname;
       // this.productDesc = productDesc;
       // this.price = price;
       // this.sku = sku; 
    //}
    
    public int getID() {
        return id;
    }
    public String getProductName() {
        return productname;
    }
    public String getProductDesc() {
        return productDesc;
    }
    public double getPrice() {
        return price;
    }
    public String getSKU(){
        return sku;
    }
    public void setID(int id) {
        this.id = id;
    }
    public void setProdName(String productname) {
        this.productname = productname;
    }
    public void setProdDesc(String productDesc) {
        this.productDesc = productDesc;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSKU(String sku) {
        this.sku = sku;
    }
    
    
    
}
