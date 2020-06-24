package Class;
import java.util.Scanner;

public class BankApplication {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		boolean run = true;
				while(run) {
			System.out.println("===============================================");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("===============================================");
			
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("���α׷��� ���� �մϴ�.");
				run = false;
				break;
			}			
		}		
	}
	//���»���
	private static void createAccount() {
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("������ : ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		BankAccount account = new BankAccount(ano,owner,balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=account;
				System.out.println("���°� �����Ǿ����ϴ�.");				
				break;
			}
		}		
	}
	
	//���¸��
	private static void accountList() {
		System.out.println("========");
		System.out.println("���¸��");
		System.out.println("========");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.print((i+1)+"��° ���� : ");
				System.out.print(accountArray[i].getAno()+"  ");
				System.out.print(accountArray[i].getOwner()+"  ");
				System.out.println(accountArray[i].getBalance()+"  ");
			}
		}
	}
	private static void deposit() {	
		if(accountArray[0]==null) {
			System.out.println("���°� ������ϴ�.");
			return;
		}
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		BankAccount account = findAccount(ano);
		if(account!=null) {
			System.out.print("�Աݾ� : ");
			int balance = account.getBalance()+scanner.nextInt();
			account.setBalance(balance);
		}
	}
	
	private static void withdraw() {
		if(accountArray[0]==null) {
			System.out.println("���°� ������ϴ�.");
			return;
		}		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		BankAccount account = findAccount(ano);
		if(account!=null) {
			System.out.print("��ݾ� : ");
			int balance = scanner.nextInt();
			if(balance>account.getBalance()) {
				System.out.println("�ܾ��� �����մϴ�.");
				return;
			}else {
				balance = account.getBalance()-balance;
				account.setBalance(balance);
			}			
		}
	}
	
	// Account �迭���� ano�� ������ ��ü ã�� // deposit �� withdraw ȣ���ؼ� �̿�
	private static BankAccount findAccount(String ano) {		
		for(int i=0; i < accountArray.length;i++) {
			if(accountArray[i].getAno().equals(ano)) {
				System.out.println("���¸� ã�°Ϳ� ���� �߽��ϴ�.");
				return accountArray[i];
			}
		}
		System.out.println("���°� ���� ���� �ʽ��ϴ�.");
		return null;
	}
}
	//�����ϱ�
//	private static void deposit() {
//		if(accountArray[0]==null) {
//			System.out.println("������ ���°� �����ϴ�.");
//			return;
//		}
//		System.out.print("���¹�ȣ : ");
//		String ano = scanner.next();		
//		for(int i = 0 ; i <accountArray.length;i++) {
//			if(accountArray[i].getAno().equals(ano)) {
//				System.out.print("���ݾ� : ");
//				int balance = scanner.nextInt();				
//				System.out.println(balance+"���� ���ݵǾ����ϴ�.");
//				balance = balance + accountArray[i].getBalance();
//				accountArray[i].setBalance(balance);
//				System.out.println(accountArray[i].getBalance()+"���� ���ҽ��ϴ�.");
//				break;
//			}else {
//				System.out.println("���¸� �߸� �������ϴ�.");
//				break;
//			}
//		}
//	}
	
	//����ϱ�
//	private static void withdraw() {
//		if(accountArray[0]==null) {
//			System.out.println("������ ���°� �����ϴ�.");
//			return;
//		}
//		System.out.print("���¹�ȣ : ");
//		String ano = scanner.next();
//		for(int i = 0 ; i <accountArray.length;i++) {
//			if(accountArray[i].getAno().equals(ano)) {
//				System.out.print("��ݾ� : ");
//				int balance = scanner.nextInt();				
//				System.out.println(balance+"���� ��ݵǾ����ϴ�.");
//				balance = accountArray[i].getBalance() - balance;
//				accountArray[i].setBalance(balance);
//				System.out.println(accountArray[i].getBalance()+"���� ���ҽ��ϴ�.");
//				break;
//			}else {
//				System.out.println("���¸� �߸� �������ϴ�.");
//				break;
//			}
//		}
//	}

