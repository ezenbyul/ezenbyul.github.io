package Class;

public class BankAccount {
	private String ano;
	private String owner;
	private int balance;
	
	public BankAccount(String ano, String owner, int blance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = blance;
	}
	
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}
