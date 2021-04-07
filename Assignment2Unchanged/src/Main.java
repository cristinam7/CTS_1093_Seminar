

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			Account account = new Account(1523, 150, 2, 659);
			Account account1 = new Account(3500, 200, 0, 340);
			Account account2 = new Account(8888, 150, 3, 360);
			Account account3 = new Account(2400, 150, 2, 355);


			Account[] accounts = new Account[4];
			accounts[0] = account;
			accounts[1] = account1;
			accounts[2] = account2;
			accounts[3] = account3;
			
			System.out.println(account.loan());
			System.out.println(account.getRate());
			System.out.println(account.getMonthlyRate());
			System.out.println(account.to_string());
			
			account.print();
			
			System.out.println(Account.calculate(accounts));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
