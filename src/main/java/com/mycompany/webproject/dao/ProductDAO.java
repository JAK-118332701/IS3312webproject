/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.dao;
import com.mycompany.webproject.models.Product;
import java.util.ArrayList;
/**
 *
 * @author javedhorgan
 */
public class ProductDAO {
    public ArrayList<Product> getProducts(int numProducts) {
        ArrayList<Product> products = new ArrayList();
        Product p1 = new Product();
        p1.setID(113);
        p1.setProdName("Silky White socks");
        p1.setProdDesc("This is the best pair of socks that you will wear in your life");
        p1.setPrice(100.99);
        p1.setSKU("Ma121321232");
        products.add(p1);
        
        Product p2 = new Product();
        p2.setID(114);
        p2.setProdName("Silky Black Socks");
        p2.setProdDesc("Our silky collection now comes in black for you to enjoy");
        p2.setPrice(100.99);
        p2.setSKU("Ma3542321");
        products.add(p2);
        
        Product p3 = new Product();
        p3.setID(112);
        p3.setProdName("Silky Brights");
        p3.setProdDesc("Silky brights to brighten up your day");
        p3.setPrice(121);
        p3.setSKU("MA3213433");
        products.add(p3);
        
        
        return products;
        
        
    }
}
