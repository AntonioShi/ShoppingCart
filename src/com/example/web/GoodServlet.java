package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoodServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            Integer page = 0 ;

            try {
                page = Integer.parseInt(request.getParameter("page")) ;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
    }
}

