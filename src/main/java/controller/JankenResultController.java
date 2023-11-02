package controller;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JamkenResultControl
 */
@WebServlet("/janken_result")
public class JankenResultController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    	int jankenStatus =  Integer.parseInt(request.getParameter("name"));
    	System.out.println(jankenStatus);
    
    }
    
    protected static void Randoms() {
        Random rand = new Random();
        // 0から2までの乱数を生成
        int num = rand.nextInt(2);
        System.out.println(num);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // thanks.jsp にリダイレクト
        String view = "/WEB-INF/views/jamken_result.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }
}
