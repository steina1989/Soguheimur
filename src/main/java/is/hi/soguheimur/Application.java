package is.hi.soguheimur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**

 * 
 *
 * The main class of the project.
 * By running the main class of {@link Application} then you start the Spring Boot system
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
