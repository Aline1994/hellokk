package hellokk.sort;
/**
 * 冒泡排序，最大最小的排在最后一位
 * @author iwpoo
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int []x={6,2,4,1,5,9};
		bubbleSort(x);
		for (int i : x) {
			System.out.print(i);
		}
		System.out.println();
		quickSort(x);
		for(int i:x){
			System.out.print(i);
		}
	}
	//冒泡相邻之间的比较
	public static void bubbleSort(int []arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	//快速选择是第一个和剩下的全部进行比较找出最小的
	public static void quickSort(int []arr){
		for(int i=0;i<arr.length;i++){
			int min = arr[i];
			for(int j=i;j<arr.length;j++){
				if(min>arr[j]){
					min=arr[j];
					arr[j]=arr[i];
					arr[i]=min;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void bubble_sort(int []unsort){
		for(int i=0;i<unsort.length;i++){
			for(int j=i+1;j<unsort.length;j++){
				if(unsort[i]<unsort[j]){
					int temp = unsort[i];
					unsort[i]=unsort[j];
					unsort[j]=temp;
				}
			}
			for(int in:unsort){
				System.out.print(in+"*****");

			}
			System.out.println();
		}
	}
}
