package hellokk.designDemo.template;

public abstract class AbsCalculate {
	/*public final int calculate(String exp,String opt){
		int array[] = split(exp,opt);
		return calculate(array[0],array[1]);
	}

	private int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayint[] = new int[2];
		arrayint[0] = Integer.parseInt(array[0]);
		arrayint[1] = Integer.parseInt(array[1]);
		return arrayint;
	}

	abstract public int calculate(int a,int b);
	*/
	public final int calculate(String exp,String opt){
		int [] aint = split(exp,opt);
		return calculate(aint[0],aint[1]);
	}
	public int[] split(String exp,String opt){
		String array[] = exp.split(opt);
		int arrayint[] = new int[2];
		arrayint[0] = Integer.parseInt(array[0]);
		arrayint[1] = Integer.parseInt(array[1]);
		return arrayint;
	}
	public abstract int calculate(int a,int b);
}
