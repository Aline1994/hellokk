package hellokk.shuati;

public class BigAndLittle {
	public static void main(String[] args) {
		int [] a = {3,5,67,2,4};
		System.out.println(getBig(a)+" "+getMini(a));
	}
	public static int getBig(int [] a){
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}
	public static int getMini(int [] a){
		int min = a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
	}
}
