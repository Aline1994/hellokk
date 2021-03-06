package hellokk;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloKK {
	/**
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
	 *	请写程序找出这两个只出现一次的数字\
	 *1.用map
	 *2.用list
	 * @param args
	 */
	public static void main(String[] args) {
		int []zx = {2,4,5,2,3,4,5,6};
		List<Integer> list = findtwodiff2(zx);
		for(int a:list){
			System.out.println(a);
		}
	}
	public static List<Integer> findtwodiff(int [] zx){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<zx.length;i++){
			if(list.contains(zx[i])){
				list.remove(new Integer(zx[i]));
			}else{
				list.add(zx[i]);
			}
		}
		return list;
		}
	
		public static List<Integer> findtwodiff2(int[]array){
			List<Integer> list = new ArrayList<Integer>();
			HashMap<Integer, Integer> resultMap=new HashMap<Integer, Integer>();
			for(int i=0;i<array.length;i++){
				if (resultMap.containsKey(array[i])) {
					int tmp=resultMap.get(array[i])+1;
					resultMap.put(array[i], tmp);
				}else {
					resultMap.put(array[i], 1);
				}
			}
			for (Map.Entry<Integer, Integer> entry: resultMap.entrySet()) {
				if (entry.getValue()==1) {
					list.add(entry.getKey());
				}
			}
			return list;
		}
		
}
