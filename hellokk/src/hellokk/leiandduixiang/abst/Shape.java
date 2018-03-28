package hellokk.leiandduixiang.abst;

public abstract class Shape {
	private String color;
	public Shape(String color){
		this.color = color;
	}
	public abstract double calPerimeter();
	public abstract String getType();
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
}
