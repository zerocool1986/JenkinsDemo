/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coffee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
//@WebServlet(name = "CoffeeSelect", urlPatterns = {"/CoffeeSelect"})
//public class CoffeeSelect extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
public class CoffeeSelect extends HttpServlet {

    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {
        String c = request.getParameter("element_1");
        // System.out.print(c);
        CoffeeExpert ce = new CoffeeExpert();
        List result = ce.getBrands(c);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Coffee selection advice <br>");
        Iterator it = result.iterator();
        while (it.hasNext()) {
            out.print("try : " + it.next());
        }
        //PrintWriter out= response.getWriter();
        //out.println("<br> Got coffee color " +c);
    }
}
