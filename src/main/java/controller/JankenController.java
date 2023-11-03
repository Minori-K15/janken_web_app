package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JamkenControl
 */
@WebServlet("/janken")
public class JankenController extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	// janken.jsp にリダイレクト
  	String view = "/WEB-INF/views/janken.jsp";
    request.getRequestDispatcher(view).forward(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
	// 定義    	
	String name = request.getParameter("name");
	String janken = request.getParameter("janken");
	
	// 取得したデータをリクエスト属性として設定
    request.setAttribute("name", name);
    request.setAttribute("janken", janken);
    
    // confirm.jsp にリダイレクト
    String view = "/WEB-INF/views/confirmjankenplayers.jsp";
    request.getRequestDispatcher(view).forward(request, response);
//    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/confirm.jsp");
//    dispatcher.forward(request,response);
    
    // resultへforward
    // getServletContext().getRequestDispatcher("/WEB-INF/views/janken_result.jsp").forward(request, response);
  }
}
