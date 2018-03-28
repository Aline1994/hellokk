package hellokk.thread;
/**
 * 三个车位，多个车位停车入库，开车离开
 * @author iwpoo
 *	一辆车进来，首先判断时候有停车位
 */

public class Park {
	public static void main(String[] args) {
		
	}
	
}
class Car{
	private String name;
	private String number;
	public Car(String name,String number){
		this.name = name;
		this.number=number;
	}
}

class threads implements Runnable{
	public Car car;
	@Override
	public void run() {
		boolean [] parkpot = {false,false,false};
			synchronized(car){
				//首先判断还有没有车位
				for(int i=0;i<parkpot.length;i++){
					if(parkpot[i]==false&&parkpot[i+1]==false&&parkpot[i+2]==false){
						System.out.println("停车位已满");
					}else{
						if(parkpot[i]==true){
							System.out.println(i+"停车位是空的，可以停车");
						}
					}
				}
				
			}
		
	}
	
}