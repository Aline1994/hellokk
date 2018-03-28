package hellokk.shuati;

import java.util.ArrayList;
import java.util.List;

public class Guanggunshu {
	public static void main(String[] args) {
		long a = getGaunggun(3);
		System.out.println(a);
	}
	public static long getGaunggun(int m){
		List l = new ArrayList();
		Long sum=0l;
		for( Long i=(long) 470;i<10000l;i++){
			sum=i*i*i;
			if(sum.toString().endsWith("111")){
				System.out.println("*******"+sum);
				l.add(i);
			}
		}
		return (long) l.get(m);
	}
}
