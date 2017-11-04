
import is.hi.soguheimur.controller.ComposeController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // creates the testing enviorment and runs test with the class Springrunner.class
@SpringBootTest() // all the context is established

public class SmokeTest {

/*
 * a)	Athugið  hvort forritið keyri og að einhver af controller klösunum verður til. 
 * Notið AssertJ (assertThat() o.fl. ) til að athuga lögmæti. 
 * Kallið test klasann SmokeTest.java 
*/	

	
@Autowired
ComposeController ComposeController;

/* 
 * Method that checks if the controller has been created.
*/

@Test // defines it as a testing method
public void contextLoads() {
	assertThat(ComposeController).isNotNull(); // Tests to see if controller has been created
}

}