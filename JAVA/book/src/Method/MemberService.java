package Method;

public class MemberService {
	String id;
	String pwd;
	
	public boolean login(String id,String pwd) {
		this.id=id;
		this.pwd=pwd;
		if(id!=null&&pwd!=null) {
			if(this.id == "hong") {
				if(this.pwd == "12345") {
					System.out.println("�α��� �Ǿ����ϴ�.");
					return true;
				}
			}
		}
		return false;
	}
	
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
}