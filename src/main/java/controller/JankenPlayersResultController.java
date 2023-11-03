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
@WebServlet("/confirmjankenplayers")
public class JankenPlayersResultController extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // confirm.jsp にリダイレクト
    String view = "/WEB-INF/views/confirmjankenplayers.jsp";
    request.getRequestDispatcher(view).forward(request, response);
  }
    
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
    // janken_result.jsp にリダイレクト
    String view = "/WEB-INF/views/janken_result.jsp";
    request.getRequestDispatcher(view).forward(request, response);
  }
}
//    
//        public static void main(String[] args) {
//            try (Scanner scanner = new Scanner(System.in)) {
//				Random random = new Random();
//				int userHand = scanner.nextInt();
//				if (userHand < 0 || userHand > 2) {
//					// 無効な数値
//				    return;
//				}
//
//				int pcHand = random.nextInt(3);
//
//				int result = judge(userHand, pcHand);
//				if (result == 0) {
//					// 引き分け
//				    System.out.println("引き分けです！");
//				} else if (result == 1) {
//					// ユーザーの勝利
//				    System.out.println("あなたの勝ちです！");
//				} else {
//					// ユーザーの負け
//				    System.out.println("あなたの負けです！");
//				}
//			}
//        }
//
//        public static String getHandName(int hand) {
//            switch (hand) {
//                case 0:
//                    return "グー";
//                case 1:
//                    return "チョキ";
//                case 2:
//                    return "パー";
//                default:
//                    return "無効な手";
//            }
//        }
//
//        public static int judge(int userHand, int pcHand) {
//            if (userHand == pcHand) {
//                return 0; // 引き分け
//            } else if ((userHand == 0 && pcHand == 1) || (userHand == 1 && pcHand == 2) || (userHand == 2 && pcHand == 0)) {
//                return 1; // ユーザーの勝ち
//            } else {
//                return -1; // PCの勝ち
//            }
//        }
//    }