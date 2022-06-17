package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		//ApplicationContext는 interface이기 때문에 객체 생성이 안되고, 
		ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
		//위와 같이 쓰면 src 생략이 가능하다. 더 간편하다!
		
		//xml에 지정해놓은 객체 생성법 사용
		//context에 id와 class 속성사용해서  bean tag로 선언해둠. 
		MessageBean messageBean = (MessageBean)context.getBean("messageBean");
		messageBean.sayHello("spring");
		System.out.println("==================================");
		
		//casting을 하는 방식도 있고 getBean의 두번째 param으로 dataType을 설정해도된다. 
		MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class);
		messageBean.sayHello("spring2");
		System.out.println("==================================");
		
		MessageBean messageBean3 = (MessageBean)context.getBean("messageBean");
		messageBean.sayHello("spring3");
		System.out.println("==================================");

		MessageBean messageBean4 = (MessageBean)context.getBean("messageBean");
		messageBean.sayHello("spring4");
		System.out.println("==================================");

		MessageBean messageBean5 = (MessageBean)context.getBean("messageBean");
		messageBean.sayHello("Goodbye");
		System.out.println("==================================");
		
		MessageBean messageBean6 = (MessageBean)context.getBean("messageBean");
		messageBean.sayHello("conflict test!!!!!!!!!");
		System.out.println("==================================");
		
		
		//각각의 객체를 생성했음에도 불구하고 같은 field를 증가시켰다. 왜  why
		//
		}
	
}
