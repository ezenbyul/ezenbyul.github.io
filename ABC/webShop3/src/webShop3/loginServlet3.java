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
        System.out.println("서블릿3가 가동되었습니다.");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿3를 시작합니다.");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("서블릿3를 종료합니다.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("m_id");
		String pw = req.getParameter("m_pw");
		
		System.out.println("아이디 : "+id);
		System.out.println("패스워드 : "+pw);

		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();	//html 및 텍스트로 되어 있는 데이터를 브라우저 출력하기 위한 객체
		
		if(id != null && (id.length() != 0)) {  //자바스크립트 검증하면 안됨.
			if(id.contentEquals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<h2>관리자로 로그인 하셨습니다.</h2>");
				out.print("</body>");
				out.print("</html>");
			} else {
				out.print("<html>");
				out.print("<body>");
				out.print("<h3>"+id+"님이 로그인 하셨습니다.</h3>");
				out.print("</body>");
				out.print("</html>");
			}
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h3>아이디와 비밀번호를 입력하세요~!</h3>");
			out.print("<a href='http://localhost:8090/webShop3/login3.html'>로그인창으로 이동</a>");
			out.print("</body>");
			out.print("</html>");
		}
	}
}











