/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.services;
import com.mycompany.webproject.dao.ProductDAO;
import com.mycompany.webproject.models.Product;
import java.util.ArrayList;

/**
 *
 * @author javedhorgan
 */
public class ProductService {
    public ArrayList<Product> getHomePageProducts(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getProducts(6);
        
    }
}
