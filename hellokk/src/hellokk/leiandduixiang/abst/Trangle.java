package hellokk.leiandduixiang.abst;

public class Trangle extends Shape {
	private double a ;
	private double b;
	private double c;
	public Trangle(String color,double a,double b,double c){
		super(color);
		setSides(a,b,c);
	}
	public void setSides(Double a,Double b,Double c){
		if(a>=b+c || b>=a+c|| c>=a+b){
			System.out.println("两边之和必须大于第三边");
			return;
		}
		if(a<=b-c || b<=a-c|| c>=a+b){
			System.out.println("两边之和必须大于第三边");
			return;
		}
		this.a = a;
		this.b=b;
		this.c = c;
	}
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "三角形";
	}
}
