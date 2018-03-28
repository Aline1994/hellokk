package hellokk.leiandduixiang;

public class Digui {
		
	public static void main(String[] args) {
		int re = getnum1(10);
		System.out.println(re);
	}
	public static  int getnum(int num){
		if(num==0){
			return 1;
		}else if(num==1){
			return 4;
		}else{
			System.out.println("***********");
			return 2*getnum(num-1)+getnum(num-2);
		}
	}
	public static int getnum1(int num){
		if(num==20){
			return 1;
		}else if(num==21){
			return 4;
		}else{
			return getnum1(num+2)-2*getnum1(num+1);
		}
	}
}
