package hellokk.designDemo.facory;

public class SendFactoru {
	//普通工厂模式
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("msg".equals(type)){
			return new MsgSender();
		}else{
			System.out.println("请输入正确的类型");
			return null;
		}
	}
	
	//多个工厂方法模式
	public Sender produceMsg(){
		return new MsgSender();
	}
	public Sender produceMail(){
		return new MailSender();
	}
	//静态工厂方法模式
	public static Sender produceMsgs(){
		return new MsgSender();
	}
	public static Sender produceMails(){
		return new MailSender();
	}
}
