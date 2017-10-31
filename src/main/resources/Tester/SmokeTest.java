
import is.hi.soguheimur.controller.ComposeController;
import static org.assertj.comre.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.Runwith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // creates the testing enviorment and runs test with the class Springrunner.class
@SpringBootTest // all the context is established

public class SmokeTest {

@Autowired
ComposeController composeController;

/* 
 * Aðferð til að athuga hvort controllerin hefur verið búinn til
*/

@Test // defines it as a testing method
public void contextLoads() {
	assertThat(composeController).isNotNull(); // Tests to see if controller has been created
}

}