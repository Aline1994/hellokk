package hellokk.leiandduixiang.practice;

public class Sinfor {
	private String name;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		String s = setInfo("zx2");
		System.out.println(s);
	}
	public static  String setInfo(String name){
		Student [] ss = new Student[10];
		for(int i=0;i<10;i++){
			Student s = new Student();
			s.setName("zx"+i);
			s.setAddress("dfsdfs.com"+i);
			s.setAge(23+i);
			s.setEmail("123e21313.com"+i);
			s.setGender("女");
			ss[i]=s;
		}
	
		for(int i=0;i<ss.length;i++){
			if(ss[i].getName().equals(name)){
				return "这个人存在";
			}
		}
		
		return null;
	}
	//重写equals
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null&&this.getClass()==obj.getClass()){
		Sinfor s = (Sinfor)obj;
		if(this.getName().equals(s.getName())){
			return true;
		}
		}
		return false;
	}
}
