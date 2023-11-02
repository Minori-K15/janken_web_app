package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JamkenResultControl
 */
@WebServlet("/jamken_result")
public class JamkenResultController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // thanks.jsp にリダイレクト
        String view = "/WEB-INF/views/jamken_result.jsp";
        request.getRequestDispatcher(view).forward(request, response);
        
    }
}
