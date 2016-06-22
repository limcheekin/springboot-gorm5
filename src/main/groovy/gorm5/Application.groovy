package gorm5

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

// REF: http://therealdanvega.com/blog/2015/11/25/using-gorm-in-spring-boot
@SpringBootApplication
@EnableTransactionManagement
public class Application {

	public static void main(String[] args) {
		def appContext = SpringApplication.run(Application.class, args);
		def personService = appContext.getBean("personService")
		println "personService.count() = ${personService.count()}" 
			
	}
}
