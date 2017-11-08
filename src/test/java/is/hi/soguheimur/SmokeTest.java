package is.hi.soguheimur;
/*
 * @author Ólafur Konráð Albertsson oka4@hi.is
 * 
 * */
import is.hi.soguheimur.controller.LoginController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
// https://stackoverflow.com/questions/39084491/unable-to-find-a-springbootconfiguration-when-doing-a-jpatest

@RunWith(SpringRunner.class) // creates the testing enviorment and runs test with the class Springrunner.class
@SpringBootTest() // all the context is established
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = NONE)
public class SmokeTest {
// 
/*
 * a)	Athugið  hvort forritið keyri og að einhver af controller klösunum verður til. 
 * Notið AssertJ (assertThat() o.fl. ) til að athuga lögmæti. 
 * Kallið test klasann SmokeTest.java 
*/	
	
@Autowired
LoginController loginController;

/* 
 * Method that checks if the controller has been created.
*/

@Test // defines it as a testing method
public void contextLoads() {
	assertThat(LoginController.class).isNotNull(); // Tests to see if controller has been created
    }
}
