package Method;

public class MemberServiceEx {

	public static void main(String[] args) {
		System.out.println("-------------���� ID�� ������ ���--------------");
		MemberService memverService = new MemberService();
		boolean result = memverService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memverService.logout("hong");
		} else {
			System.out.println("id �Ǵ� pwd�� �ùٸ��� �ʽ��ϴ�.");
		}
		System.out.println("-------------�߸��� ID�� ������ ���--------------");
		MemberService memverServiceX = new MemberService();
		boolean result2 = memverServiceX.login("�߸���ID", "123");
		if(result2) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memverServiceX.logout("�߸���ID");
		}else {
			System.out.println("id �Ǵ� pwd�� �ùٸ��� �ʽ��ϴ�.");
		}
		

	}
}