package hellokk.sort;
/**
 * 插入排序的思想：把数据分为两部分，，一部分数据比另一部分数据小
 * @author iwpoo
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		 int[] x = { 6, 2, 4, 1, 5, 9 };
         quickSorted(x, 0, x.length - 1);
         for (int item:x)
         {
             System.out.print(item);
         }
        System.out.println();
	}

    static void quick_sort(int[] unsorted, int low, int high)
    {
        int i,j,temp,t;
        if(low>high){
        	return;
        }
        i=low;
        j=high;
        temp=unsorted[low];
        while(i<j){
        	while(temp<=unsorted[j]&&i<j){
        		j--;
        	}
        	while(temp>=unsorted[i]&&i<j){
        		i++;
        	}
        	if(i<j){
        		t=unsorted[i];
        		unsorted[i]=unsorted[j];
        		unsorted[j]=t;
        	}
        	
        }
        unsorted[low]=unsorted[i];
    	unsorted[i]=temp;
    	quick_sort(unsorted,low,j-1);
    	quick_sort(unsorted,j+1,high);
    }

  
    
    
    
    
    
    
    public static void quickSorted(int []arr,int low,int high){
    	int i,j,temp,t;
    	i=low;
    	j=high;
    	temp=arr[low];
    	while(i>j){
    		return;
    	}
    	while(i<j){
    		while(temp<=arr[j]){
    			j--;
    		}
    		while(temp>=arr[i]){
    			i++;
    		}
    		t=arr[j];
    		arr[j]=arr[i];
    		arr[i]=t;
    	}
    	arr[low]=arr[i];
    	arr[i]=temp;
    	quickSorted(arr,low,j-1);
    	quickSorted(arr,j+1,high);
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}