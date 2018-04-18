/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entity.CustomerOrder;
import Util.RestaurantUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tom
 */
@WebServlet(name = "MenuServlet",
        loadOnStartup = 1,
        urlPatterns = {"/WingStop",
            "/FirehouseSubs",
            "/PandaExpress",
            "/PoblanoBurritos"})
public class MenuServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MenuServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MenuServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        String userPath = request.getServletPath();
        HttpSession session = request.getSession();

        if (userPath.equals("/WingStop")) { //restID = 1
            String page = "menus/wingstop.jsp";

            // access a class called RestaurantUtil
            List menu = RestaurantUtil.getMenu(1);
            request.setAttribute("menu", menu);

            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            if (dispatcher != null) {
                dispatcher.forward(request, response);
            }
            
        } else if (userPath.equals("/FirehouseSubs")) { //restID = 1
            String page = "menus/firehousesubs.jsp";

            // access a class called RestaurantUtil
            List menu = RestaurantUtil.getMenu(2);
            session.setAttribute("menu", menu);
           

            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            if (dispatcher != null) {
                dispatcher.forward(request, response);
            }
        } else if (userPath.equals("/PoblanoBurritos")) { //restID = 1
            String page = "menus/poblanoburritos.jsp";

            // access a class called RestaurantUtil
            List menu = RestaurantUtil.getMenu(3);
            request.setAttribute("menu", menu);

            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            if (dispatcher != null) {
                dispatcher.forward(request, response);
            }
        } else if (userPath.equals("/PandaExpress")) { //restID = 1
            String page = "menus/pandaexpress.jsp";

            // access a class called RestaurantUtil
            List menu = RestaurantUtil.getMenu(4);
            request.setAttribute("menu", menu);
            
            

            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            if (dispatcher != null) {
                dispatcher.forward(request, response);
            }
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
