package hellokk.shuati;

import java.math.BigInteger;

public class Jiecheng {
	public static void main(String[] args) {
		BigInteger a = getResult3(500);
		System.out.println(a);
	}
	public static long getResult(int m){
		if(m==1){
			return 1;
		}else{
			return m*getResult(m-1);
		}
		
	}
	public static long getResult1(int m){
		long sum = 1 ;
		for(int i=m;i>1;i--){
			sum*=i;
		}
		return sum;
	}

//计算大数字的阶乘
	public static BigInteger getResult3(int m){
		BigInteger b = BigInteger.ONE;
		for(int i=1;i<=m;i++){
			b=b.multiply(BigInteger.valueOf(i));
		}
		return b;
	}
}