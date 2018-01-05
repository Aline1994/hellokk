package hellokk.designDemo.composite.newComposit;

public class Client {
	public static void main(String[] args) {
		Company root = new ConcretCompany();
		root.SetName("北京总公司");
		root.add(new HRDepartment("人力资源部"));
		root.add(new FinanceDepartment("金融事业部"));
		
		Company sdcomp = new ConcretCompany();
		sdcomp.SetName("山东分公司");
		sdcomp.add(new HRDepartment("山东分公司人力资源部"));
		sdcomp.add(new FinanceDepartment("山东财务部"));
		
		
		Company shcom = new ConcretCompany("上海分公司");
		shcom.add(new HRDepartment("上海分公司人力资源部"));
		shcom.add(new FinanceDepartment("上海分公司财务部"));
		
		Company zaozhuangCom = new ConcretCompany("枣庄办事处");  
	     zaozhuangCom.add(new FinanceDepartment("枣庄办事处财务部"));  
	     zaozhuangCom.add(new HRDepartment("枣庄办事处人力资源部")); 
	        
	     Company jinanCom = new ConcretCompany("济南办事处");  
	     jinanCom.add(new FinanceDepartment("济南办事处财务部"));  
	     jinanCom.add(new HRDepartment("济南办事处人力资源部"));   
	     
	     sdcomp.add(zaozhuangCom);
	     sdcomp.add(jinanCom);
	     sdcomp.add(shcom);
	     
	     Company huadongCom = new ConcretCompany("上海华东分公司");  
	        huadongCom.add(new HRDepartment("上海华东分公司人力资源部"));  
	        huadongCom.add(new FinanceDepartment("上海华东分公司账务部"));  
	        Company hangzhouCom = new ConcretCompany("杭州办事处");  
	        hangzhouCom.add(new FinanceDepartment("杭州办事处财务部"));  
	        hangzhouCom.add(new HRDepartment("杭州办事处人力资源部"));  
	        Company nanjingCom = new ConcretCompany("南京办事处");  
	        nanjingCom.add(new FinanceDepartment("南京办事处财务部"));  
	        nanjingCom.add(new HRDepartment("南京办事处人力资源部"));  
	        huadongCom.add(hangzhouCom);  
	        huadongCom.add(nanjingCom);   
	        
	        root.add(sdcomp);
	        root.add(huadongCom);
	        
	        root.display(0);
	}
}
