package hellokk.shuati;

import java.util.Scanner;

public class Peidui2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要输入几组数，数量要小于5");
		int num = input.nextInt();
		String [] peidui = new String[num];
		for(int i=0;i<num;i++){
			Scanner input2 = new Scanner(System.in);
			System.out.println("请输入第"+i+"个要判断的");
			String c = input2.next();
			 peidui[i]=c;
		}
		boolean [] panduan = isPeidui(peidui);
		for(boolean s:panduan){
			System.out.println(s);
		}
	}
	public static boolean[] isPeidui(String [] s){
		boolean [] panduan = new boolean[s.length];
			for(int i=0;i<s.length;i++){
				int lt = s[i].length();
				if(lt%2!=0){
					panduan[i]=false;
				}else{
					String sz = s[i].substring(0, lt/2);
					String zs = s[i].substring(lt/2, lt);
					String c1 = "";
					char[] c = zs.toCharArray();
					for(int j=c.length-1;j>=0;j--){
						c1+=c[j];
					}
					if(sz.startsWith("(")&&zs.endsWith(")")){
						panduan[i]=true;
					}
				}
			}		
		
		return panduan;
	}
}
