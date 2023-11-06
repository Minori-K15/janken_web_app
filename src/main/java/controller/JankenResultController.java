package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JamkenResultControl
 */
@WebServlet("/confirm")
public class JankenResultController extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // confirm.jsp にリダイレクト
    String view = "/WEB-INF/views/confirm.jsp";
    request.getRequestDispatcher(view).forward(request, response);
  }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    String userName = request.getParameter("name");
    String userHand = request.getParameter("janken");
    String comPlayers = request.getParameter("complayers");

    // COMの人数を定義
    String[] computerHands;
    int numPlayers = Integer.parseInt(comPlayers);
    
    // COMの人数に応じて呼び出しメゾットを切り替える
    if (numPlayers == 1) {
        computerHands = new String[]{getRandomHand()};
        getJankenResult( userHand, computerHands[0]);
    } else if (numPlayers == 2) {
        String choice1 = getRandomHand();
        String choice2 = getRandomHand();
        computerHands = new String[]{choice1, choice2};
        getJankensResult( userHand, computerHands[0], computerHands[1]);
    } else {
        out.print("Unsupported number of players");
        return;
    }
    request.setAttribute("name", userName);
    request.setAttribute("janken", userHand);
    request.setAttribute("complayers", comPlayers);
    
//    String computerHand = null ;
//    for (int i = 0; i < numPlayers; i++) {
//     computerHand = computerHands[i];
//     request.setAttribute("computerHand", computerHand);
//    }
//    String result = getJankenResult(userHand, computerHand);
//    request.setAttribute("result", result);
    
    // 変数の初期化
    String firstComHand = null;
	String secondComHand = null;
	String result;
	
	// プレイヤーの人数をもとにじゃんけんの結果を取得
	if (numPlayers == 1) {
		firstComHand = computerHands[0];
		result = getJankenResult(userHand, firstComHand);
		request.setAttribute("firstComHand", firstComHand);
		request.setAttribute("result", result);
	} else if (numPlayers == 2) {
		firstComHand = computerHands[0];
		secondComHand = computerHands[1];
		result = getJankensResult(userHand, firstComHand, secondComHand);
		request.setAttribute("firstComHand", firstComHand);
		request.setAttribute("secondComHand", secondComHand);
		request.setAttribute("result", result);
	}
	
	// janken_result.jspにリダイレクト
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/janken_result.jsp");
    dispatcher.forward(request, response);
}

private String getRandomHand() {
    String[] choices = {"グー", "チョキ", "パー"};
    return choices[new Random().nextInt(choices.length)];
}
// 二人対戦
private String getJankenResult(String prayer, String choice) {
    if (prayer.equals(choice)) {
        return "引き分け";
    } else if ((prayer.equals("グー") && choice.equals("チョキ"))
            || (prayer.equals("チョキ") && choice.equals("パー"))
            || (prayer.equals("パー") && choice.equals("グー"))) {
        return "勝ち";
    } else {
        return "負け";
    }
}

// 3人対戦
private String getJankensResult(String player, String choice1,  String choice2) {
	if ((player.equals("グー") && choice1.equals("チョキ") && choice2.equals("チョキ"))
			|| (player.equals("グー") && choice1.equals("グー") && choice2.equals("チョキ"))
			|| (player.equals("グー") && choice1.equals("チョキ") && choice2.equals("グー"))
			|| (player.equals("チョキ") && choice1.equals("パー") && choice2.equals("パー"))
			|| (player.equals("チョキ") && choice1.equals("チョキ") && choice2.equals("パー"))
			|| (player.equals("チョキ") && choice1.equals("パー") && choice2.equals("チョキ"))
			|| (player.equals("パー") && choice1.equals("グー") && choice2.equals("グー"))
			|| (player.equals("パー") && choice1.equals("パー") && choice2.equals("グー"))
			|| (player.equals("パー") && choice1.equals("グー") && choice2.equals("パー"))) {
		return "勝ち";
	} else if ((player.equals("グー") && choice1.equals("パー") && choice2.equals("パー"))
		   || (player.equals("グー") && choice1.equals("パー") && choice2.equals("グー"))
		   || (player.equals("グー") && choice1.equals("グー") && choice2.equals("パー"))
		   || (player.equals("チョキ") && choice1.equals("グー") && choice2.equals("グー"))
		   || (player.equals("チョキ") && choice1.equals("チョキ") && choice2.equals("グー"))
		   || (player.equals("チョキ") && choice1.equals("グー") && choice2.equals("チョキ"))
		   || (player.equals("パー") && choice1.equals("チョキ") && choice2.equals("チョキ"))
		   || (player.equals("パー") && choice1.equals("チョキ") && choice2.equals("パー"))
		   || (player.equals("パー") && choice1.equals("パー") && choice2.equals("チョキ"))) {
		return "負け";
	} else {
		return "引き分け";
	}
   }
}
