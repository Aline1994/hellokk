package hellokk.designDemo.builder;

import java.util.ArrayList;
import java.util.List;

import hellokk.designDemo.facory.MailSender;
import hellokk.designDemo.facory.MsgSender;
import hellokk.designDemo.facory.Sender;

public class Builder {
	private List<Sender>list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	public void produceMsgSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MsgSender());
		}
	}
	public void look(){
		for(Sender s:list){
			if(s instanceof MailSender){
				s = (MailSender)s;
				s.Send();
			}else if(s instanceof MsgSender){
				s = (MsgSender)s;
				s.Send();
			}
		}
	}
}
