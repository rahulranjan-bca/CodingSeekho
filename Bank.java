class Bank{
	private int balance;
	
	public void checkBalance(){
		System.out.println(balance);
	}
	public void deposite(int amount){
		balance = balance + amount;
	}	
}