package br.com.caelum.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot {
	
	
	
//	@Bean
//	public RoutesBuilder rota() { 
//	    return new RouteBuilder() {
//	        @Override
//	        public void configure() throws Exception {
//	            from("file:pedidos").
//	            to("activemq:queue:pedidos");
//	        } 
//	    };
//	}

	
	
	public static void main(String[] args) {
		SpringApplication.run(Boot.class, args);
	}
}
