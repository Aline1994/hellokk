package hellokk.leiandduixiang.abst;

public class Circle extends Shape {
	
	private double r;
	public Circle(String color,double r) {
		super(color);
		this.r = r;
		// TODO Auto-generated constructor stub
	}
	public void setR(double r){
		this.r = r;
	}
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "圆";
	}
	public static void main(String[] args) {
		Trangle t = new Trangle("lanse",3,3,5);
		System.out.println(t.calPerimeter());
		System.out.println(t.getType());
		Circle c = new Circle("red",4.12);
		System.out.println(c.calPerimeter());
		System.out.println(c.getType());
	}
}
