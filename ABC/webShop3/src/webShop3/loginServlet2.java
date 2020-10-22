package webShop3;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet2
 */
@WebServlet("/login2")
public class loginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doHandle(req, res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doHandle(req, res);
	}

	private void doHandle(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException {
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







