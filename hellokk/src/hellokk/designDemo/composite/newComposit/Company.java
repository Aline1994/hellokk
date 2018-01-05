package hellokk.designDemo.composite.newComposit;

public abstract class Company {
	private String name;
	
	public Company(String name){
		this.name=name;
	}
	public Company(){}
	public void SetName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	protected abstract void add(Company company);
	protected abstract void remove(Company company);
	protected abstract void display(int depth);
}
