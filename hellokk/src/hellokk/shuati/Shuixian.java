package hellokk.shuati;

import java.util.Scanner;

public class Shuixian {
	public static void main(String[] args) {
		while(true){
			System.out.println("请输入你要判断的数字");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			if(a<100||a>999){
				System.out.println("你输入的值有误");
				return;
			}
			boolean flag = isOrNot(a);
			if(flag){
				System.out.println("这个数字是水仙花");
			}else{
				System.out.println("这个数字不是水仙花");
			}
		}
		
		
	}
	public static boolean isOrNot(int a){
		boolean flag = false;
		String b = Integer.toString(a);
		int a1 = Integer.parseInt(b.substring(0, 1));
		int a2 = Integer.parseInt(b.substring(1, 2));
		int a3 = Integer.parseInt(b.substring(2, 3));
		int c = a1*a1*a1+a2*a2*a2+a3*a3*a3;
		if(c==a){
			flag=true;
		}
		return flag;
	}
}
