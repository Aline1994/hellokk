package hellokk.designDemo.composite.newComposit;

public class HRDepartment extends Company{
	 public HRDepartment(){}  
	      
	 public HRDepartment(String name){  
	        super(name);  
	    }  
	      
	@Override
	protected void add(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void remove(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void display(int depth) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder("");  
	        for (int i = 0; i < depth; i++) {  
	            sb.append("-");   
	        }  
	        System.out.println(new String(sb) + this.getName() ) ; 
	}

}
