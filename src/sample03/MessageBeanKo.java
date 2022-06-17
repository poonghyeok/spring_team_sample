package sample03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageBean")
@Scope("prototype")
public class MessageBeanKo implements MessageBean {
	private int num; //field >> initial value = 0
	

	public MessageBeanKo() {
		// TODO Auto-generated constructor stub
		System.out.println("MessageBean constructor is called.");
	}
	
	@Override
	public void sayHello(String name) {
		num++;
		System.out.println("num = " + num);
		System.out.println("안녕하세요 " + name);
	}


}
