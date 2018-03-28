package hellokk.shuati;

public class Dongtai {
	public static void main(String[] args) {
		long a = func(50);
		System.out.println(a);
	}
	public static long func(int n){
		if(n==1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			return func(n-1)+func(n-2);
		}
	}
}
