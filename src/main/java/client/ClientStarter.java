package client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import client.config.RemoteServiceConfig;

public class ClientStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( RemoteServiceConfig.class);
		Calculator calculator = context.getBean(Calculator.class);
		System.out.println(calculator.sum(1, 2));
		context.close();
		
		System.out.println("==========================");
		
	}
}
