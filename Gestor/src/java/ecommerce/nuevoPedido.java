/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerce;

import BD.InterfazBD;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import general.EstadoPedido;
import general.Pieza;
import gestor_taller.TallerWS;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pablovm1990
 */
public class nuevoPedido extends HttpServlet {

    InterfazBD bd;

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
            out.println("<title>Servlet nuevoPedido</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet nuevoPedido at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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
        TallerWS tws = new TallerWS();
        Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy hh:mm:ss a").create();
        Cookie cs = request.getCookies()[0];
        
        Date today = new Date();
        String fecha = "" + tfLimiteAnyo.getText() + "/" + tfLimiteMes.getText() + "/" + tfLimiteDia.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaLimite = dateFormat.parse(fecha);
        ArrayList<Pieza> piezasPedido = new ArrayList<>();
        ArrayList<Integer> cantidadPiezas = new ArrayList<>();
        for (Iterator it = data.iterator(); it.hasNext();) {
            TablePieza tp = (TablePieza) it.next();
            piezasPedido.add(new Pieza(tp.getId()));
            cantidadPiezas.add(tp.getCantidad());
        }

        if (bd.anadirPedido(today, EstadoPedido.ACTIVE, fechaLimite, "Automatico".equals(cbModoAutomatico.getValue().toString()), piezasPedido, cantidadPiezas);
        {
        }

        }
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
