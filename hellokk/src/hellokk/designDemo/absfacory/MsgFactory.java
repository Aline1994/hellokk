package hellokk.designDemo.absfacory;

import hellokk.designDemo.facory.MsgSender;
import hellokk.designDemo.facory.Sender;

public class MsgFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MsgSender();
	}
	
}
