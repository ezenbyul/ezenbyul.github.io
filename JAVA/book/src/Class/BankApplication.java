package Class;
import java.util.Scanner;

public class BankApplication {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		boolean run = true;
				while(run) {
			System.out.println("===============================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("===============================================");
			
			System.out.print("선택> ");
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
				System.out.println("프로그램을 종료 합니다.");
				run = false;
				break;
			}			
		}		
	}
	//계좌생성
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		BankAccount account = new BankAccount(ano,owner,balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=account;
				System.out.println("계좌가 생성되었습니다.");				
				break;
			}
		}		
	}
	
	//계좌목록
	private static void accountList() {
		System.out.println("========");
		System.out.println("계좌목록");
		System.out.println("========");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.print((i+1)+"번째 계좌 : ");
				System.out.print(accountArray[i].getAno()+"  ");
				System.out.print(accountArray[i].getOwner()+"  ");
				System.out.println(accountArray[i].getBalance()+"  ");
			}
		}
	}
	private static void deposit() {	
		if(accountArray[0]==null) {
			System.out.println("계좌가 비었습니다.");
			return;
		}
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		BankAccount account = findAccount(ano);
		if(account!=null) {
			System.out.print("입금액 : ");
			int balance = account.getBalance()+scanner.nextInt();
			account.setBalance(balance);
		}
	}
	
	private static void withdraw() {
		if(accountArray[0]==null) {
			System.out.println("계좌가 비었습니다.");
			return;
		}		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		BankAccount account = findAccount(ano);
		if(account!=null) {
			System.out.print("출금액 : ");
			int balance = scanner.nextInt();
			if(balance>account.getBalance()) {
				System.out.println("잔액이 부족합니다.");
				return;
			}else {
				balance = account.getBalance()-balance;
				account.setBalance(balance);
			}			
		}
	}
	
	// Account 배열에서 ano와 동일한 객체 찾기 // deposit 와 withdraw 호출해서 이용
	private static BankAccount findAccount(String ano) {		
		for(int i=0; i < accountArray.length;i++) {
			if(accountArray[i].getAno().equals(ano)) {
				System.out.println("계좌를 찾는것에 성공 했습니다.");
				return accountArray[i];
			}
		}
		System.out.println("계좌가 존재 하지 않습니다.");
		return null;
	}
}
	//예금하기
//	private static void deposit() {
//		if(accountArray[0]==null) {
//			System.out.println("생성된 계좌가 없습니다.");
//			return;
//		}
//		System.out.print("계좌번호 : ");
//		String ano = scanner.next();		
//		for(int i = 0 ; i <accountArray.length;i++) {
//			if(accountArray[i].getAno().equals(ano)) {
//				System.out.print("예금액 : ");
//				int balance = scanner.nextInt();				
//				System.out.println(balance+"원이 예금되었습니다.");
//				balance = balance + accountArray[i].getBalance();
//				accountArray[i].setBalance(balance);
//				System.out.println(accountArray[i].getBalance()+"원이 남았습니다.");
//				break;
//			}else {
//				System.out.println("계좌를 잘못 적었습니다.");
//				break;
//			}
//		}
//	}
	
	//출금하기
//	private static void withdraw() {
//		if(accountArray[0]==null) {
//			System.out.println("생성된 계좌가 없습니다.");
//			return;
//		}
//		System.out.print("계좌번호 : ");
//		String ano = scanner.next();
//		for(int i = 0 ; i <accountArray.length;i++) {
//			if(accountArray[i].getAno().equals(ano)) {
//				System.out.print("출금액 : ");
//				int balance = scanner.nextInt();				
//				System.out.println(balance+"원이 출금되었습니다.");
//				balance = accountArray[i].getBalance() - balance;
//				accountArray[i].setBalance(balance);
//				System.out.println(accountArray[i].getBalance()+"원이 남았습니다.");
//				break;
//			}else {
//				System.out.println("계좌를 잘못 적었습니다.");
//				break;
//			}
//		}
//	}

