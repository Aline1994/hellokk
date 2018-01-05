package hellokk.designDemo.absfacory;

import hellokk.designDemo.facory.MailSender;
import hellokk.designDemo.facory.Sender;

public class MailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
