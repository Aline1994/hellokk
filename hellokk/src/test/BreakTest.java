package test;
//break:结束内层的全部for循环
//return结束整个for循环，外层循环
//continue:结束本次for循环一项，进行下次循环
public class BreakTest {
	public static void main(String[] args) {
			for(int j=0;j<10;j++){
				if(j==3){
					continue;
				}
				System.out.println("******continue******"+j);
				/*if(j==4){
					break;
				}
				System.out.println("^^^^^^^^break^^^^^^^^^"+j);*/
			}
	}
}
