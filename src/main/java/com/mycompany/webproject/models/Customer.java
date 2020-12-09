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
public class Customer {
    private int custID; 
    private String fName; 
    private String lName; 
    private String address;
    private String townCity; 
    private String county;
    private String eircode;
    private String phNumber;
    
    public int GetID() {
        return custID;
    }
    public String getFName() {
        return fName;
    }
    public String getLName() {
        return lName;
    }
    public String getAddress() {
        return address;
    }
    public String getTownCity() {
        return townCity;
    }
    public String getCounty() {
        return county;
    }
    public String getEircode() {
        return eircode;
    }
    public String getphNumber() {
        return phNumber;
    }
    public void setCustomerID(int custID) {
        this.custID = custID;
    }
    public void setFName(String fName) {
        this.fName = fName;
    }
    public void setLName(String lName) {
        this.lName = lName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }
    public void setCounty(String county) {
        this.county = county;
    }
    public void setEircode(String eircode) {
        this.eircode = eircode;
    }
}
