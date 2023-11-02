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
@WebServlet("/Janken")
public class JankenController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String view = "/WEB-INF/views/janken.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // フォームから送信されたデータを取得
        String name = request.getParameter("name");
        System.out.println(name);

        // 取得したデータをリクエスト属性として設定
        request.setAttribute("name", name);

        // confirm.jsp にリダイレクト
        String view = "/WEB-INF/views/jamken_result.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }
}
