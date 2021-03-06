package hellokk.designDemo.template.newTemplate;
/**
 * 模板方法模式
 * 首先如果要计算2+3怎么使用模板方法
 * @author iwpoo
 *
 */
public abstract class AbsCalculate {
	public final int calculate(String exp,String opt){
		int[] a = split(exp,opt);
		return calculate(a[0],a[1]);
	}

	public  int[] split(String exp, String opt) {
		String [] a = exp.split(opt);
		int[] ai = new int[2];
		ai[0]= Integer.parseInt(a[0]);
		ai[1]=Integer.parseInt(a[1]);
		return ai;
	}

	public abstract int calculate(int i, int j);

	
}
