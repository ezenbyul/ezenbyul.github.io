package Method;

public class MemberService {
	String id;
	String pwd;
	boolean ret;
	
	public boolean login(String id,String pwd) {
		this.id=id;
		this.pwd=pwd;
		if(this.id == "hong") {
			if(this.pwd == "12345") {
				this.ret = true;
			}
		}
		return this.ret;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
