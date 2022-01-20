package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import modelo.ClienteDao;

public class Registro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String usuario = request.getParameter("usuario");
            String mail = request.getParameter("mail");
            String password = request.getParameter("password");

            //Instanciamos la clases ClienteDao y Cliente
            ClienteDao dao = new ClienteDao();
            Cliente cliente = new Cliente();

            //Agregamos datos enviados por el Cliente a la base de datos
            cliente.setUsuario(usuario);
            cliente.setMail(mail);
            cliente.setPassword(password);

            boolean respuesta = dao.registrar(cliente);
            if (respuesta) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("registro.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
