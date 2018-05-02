

public class Bubble {
	public static void main(String[] args) {
		int [] x = {5,9,8,6,2};
		int [] y = sort(x);
		int []a = insertsort(x);
		for(int z:a){
			System.out.println(z);
		}
	}
	//冒泡
	public static  int[] sort(int []x){
		int temp = 0;
		for(int i=0;i<x.length-1;i++){
			for(int j=0;j<x.length-i-1;j++){
				if(x[j]>x[j+1]){
					temp = x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		return x;
	}
	
	//插入  :依次遍历数组，
	public static int[] insertsort(int[]x){
		int temp;
		for(int i=1;i<x.length;i++){
			temp = x[i];
			int j=i;
			while(--j>=0&&x[j]>temp){
				x[j+1]=x[j];
			}
			x[j+1]=temp;
		}
		return x;
	}
}
