package main;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class Hello extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().println("SSSSS");
            response.getWriter().println(new Date().toLocaleString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
