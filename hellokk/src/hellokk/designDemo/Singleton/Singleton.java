package hellokk.designDemo.Singleton;

public class Singleton {
	//持有私有静态实例，防止被引用
	private static Singleton instance = null;
	//私有静态方法，防止被实例化
	private Singleton(){}
	
	//创建实例
	public static Singleton getInstance(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
	
	//线程安全的创建实例,synchronized锁住的是这个对象，这样的用法性能会有所下降
	//因为只有在第一次创建对象的时候加锁，其他的时候不需要
	public static synchronized Singleton getIntanceSafe(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}
	//改进后的线程安全的实例创建,发现这样在多线程环境下还是容易发生问题，继续进行下列优化
	public static Singleton getInstanceSafe1(){
		if(instance==null){
			synchronized(instance){
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	//如果该对象用于序列化，保证序列化前后的的对象一致
	public Object readResolve(){
		return instance;
	}
	//使用内部类维护单例，因为jvm的内部能够保证一个类在加载的时候，这个类的加载过程是线程互斥的
	private static class SingletonFactory{
		private static Singleton instance = new Singleton();
	}
	public static  Singleton getInstancef(){
		return SingletonFactory.instance;
	}
}
 
