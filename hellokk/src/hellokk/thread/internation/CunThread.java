package hellokk.thread.internation;

public class CunThread extends Thread{
	private Account account;
	private double cunAmount;
	
	public CunThread(String name,Account account,double cunAmount){
		super(name);
		this.account = account;
		this.cunAmount= cunAmount;
	}
	public void run(){
		for(int i=0;i<11;i++){
			account.cunqian(cunAmount);
		}
	}
}
