package webShop3;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public loginServlet() {
        System.out.println("로그인 요청");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("로그인 쓰레드가 시작됨");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("로그인 쓰레드 종료됨");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String m_id = req.getParameter("m_id");
		String m_pw = req.getParameter("m_pw");
		String[] subject = req.getParameterValues("subject");
		System.out.println("입력한 아이디 : "+m_id);
		System.out.println("입력한 비밀번호 : "+m_pw);
		for(String str:subject) {
			System.out.println("선택한 언어 : "+str);
		}
	}
}
