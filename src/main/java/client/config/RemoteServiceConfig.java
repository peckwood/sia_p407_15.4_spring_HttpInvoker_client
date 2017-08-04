package client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import client.Calculator;

@Configuration
public class RemoteServiceConfig {

	@Bean
	public HttpInvokerProxyFactoryBean calculatorService() {
		HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8080/sia_p407_15.4_spring_HttpInvoker_server/calculator.service");
		proxy.setServiceInterface(Calculator.class);
		return proxy;
	}
}
