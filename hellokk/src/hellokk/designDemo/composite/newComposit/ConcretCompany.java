package hellokk.designDemo.composite.newComposit;

import java.util.ArrayList;
import java.util.List;

public class ConcretCompany extends Company{

	private List<Company>clist;
	
	public ConcretCompany(){
		clist = new ArrayList<Company>();
	}
	public ConcretCompany(String name){
		super(name);
		clist = new ArrayList<Company>();
	}
	
	@Override
	protected void add(Company company) {
		// TODO Auto-generated method stub
		clist.add(company);
	}

	@Override
	protected void remove(Company company) {
		// TODO Auto-generated method stub
		clist.remove(company);
	}
	//每个叶子节点的深度
	public void dp(int length){
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<length;i++){
			sb.append("-");
		}
		System.out.println(new String(sb)+this.getName());
		for(Company c:clist){
			c.display(length+2);
		}
	}
	@Override
	protected void display(int depth) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		System.out.println(new String(sb)+this.getName());
		for(Company c:clist){
			c.display(depth+2);
		}
	}

}
