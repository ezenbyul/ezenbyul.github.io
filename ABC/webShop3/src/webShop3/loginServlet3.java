package webShop3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet3
 */
@WebServlet("/login3")
public class loginServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet3() {
        System.out.println("����3�� �����Ǿ����ϴ�.");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("����3�� �����մϴ�.");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("����3�� �����մϴ�.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("m_id");
		String pw = req.getParameter("m_pw");
		
		System.out.println("���̵� : "+id);
		System.out.println("�н����� : "+pw);

		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();	//html �� �ؽ�Ʈ�� �Ǿ� �ִ� �����͸� ������ ����ϱ� ���� ��ü
		
		if(id != null && (id.length() != 0)) {  //�ڹٽ�ũ��Ʈ �����ϸ� �ȵ�.
			if(id.contentEquals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<h2>�����ڷ� �α��� �ϼ̽��ϴ�.</h2>");
				out.print("</body>");
				out.print("</html>");
			} else {
				out.print("<html>");
				out.print("<body>");
				out.print("<h3>"+id+"���� �α��� �ϼ̽��ϴ�.</h3>");
				out.print("</body>");
				out.print("</html>");
			}
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>���̵�� ��й�ȣ�� �Է��ϼ���~!</h3>");
			out.print("<a href='http://localhost:8090/webShop3/login3.html'>�α���â���� �̵�</a>");
			out.print("</body>");
			out.print("</html>");
		}
	}
}











