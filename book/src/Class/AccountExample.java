package Class;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(1000);
		System.out.println(account.getBalance());
		account.setBalance(-1000);
		System.out.println(account.getBalance());
		account.setBalance(1000000000);
		System.out.println(account.getBalance());
		account.setBalance(30000);
		System.out.println(account.getBalance());			
	}
}
