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
        System.out.println("�α��� ��û");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("�α��� �����尡 ���۵�");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("�α��� ������ �����");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String m_id = req.getParameter("m_id");
		String m_pw = req.getParameter("m_pw");
		String[] subject = req.getParameterValues("subject");
		System.out.println("�Է��� ���̵� : "+m_id);
		System.out.println("�Է��� ��й�ȣ : "+m_pw);
		for(String str:subject) {
			System.out.println("������ ��� : "+str);
		}
	}
}
