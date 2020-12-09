/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webproject.servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.webproject.dao.ProductDAO;
import com.mycompany.webproject.services.ProductService;
import com.mycompany.webproject.models.Product;
/**
 *
 * @author javedhorgan
 */
public class Homepageservlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        ProductService pServ = new ProductService();
        ArrayList<Product> topProducts = pServ.getHomePageProducts();
        
        request.setAttribute("products", topProducts);
        request.getRequestDispatcher("/homepage.jsp").forward(request, response);
        
        
    }
}
