package hellokk.thread.internation;

public class Account {
	private String aNo;
	private Double balance;
	private boolean flag=false;
	
	public Account(){}
	public Account(String aNo,Double balance){
		this.aNo = aNo;
		this.balance = balance;
	}
	public String getaNo() {
		return aNo;
	}
	public void setaNo(String aNo) {
		this.aNo = aNo;
	}
	public Double getBalance() {
		return balance;
	}
	public synchronized void draw(double drawAmount){
		try {
		if(!flag){
			//当flag为假，表示没有钱存进去
			wait();
		}else{
			System.out.println("执行取钱操作"+Thread.currentThread().getName()+"取钱："+drawAmount);
			if(drawAmount>balance){
				System.out.println("你没那么多钱");
			}else{
				balance-=drawAmount;
				System.out.println("总金额为"+balance);
				flag=false;
				notifyAll();
			}
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void cunqian(double cunAmount){
		try {
		if(flag){
			wait();
		}else{
			System.out.println("开始存款，存款金额是"+cunAmount);
			balance+=cunAmount;
			System.out.println("总金额是"+balance);
			flag=true;
			notifyAll();
		}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
