package hellokk.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SleepTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		for(int i=0;i<10;i++){
			System.out.println(i);
			Thread.sleep(100);
		}
		
		char c;
		BufferedReader  read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按q键退出");
		do{
			c = (char) read.read();
			System.out.println(c);
		}while(c!='q');
	}
}
