package Method;

public class MemberServiceEx {

	public static void main(String[] args) {
		System.out.println("-------------정상 ID를 기입할 경우--------------");
		MemberService memverService = new MemberService();
		boolean result = memverService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memverService.logout("hong");
		} else {
			System.out.println("id 또는 pwd가 올바르지 않습니다.");
		}
		System.out.println("-------------잘못된 ID를 기입할 경우--------------");
		MemberService memverServiceX = new MemberService();
		boolean result2 = memverServiceX.login("잘못된ID", "123");
		if(result2) {
			System.out.println("로그인 되었습니다.");
			memverServiceX.logout("잘못된ID");
		}else {
			System.out.println("id 또는 pwd가 올바르지 않습니다.");
		}
		

	}
}
