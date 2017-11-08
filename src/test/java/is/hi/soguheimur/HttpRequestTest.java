package is.hi.soguheimur;

import is.hi.soguheimur.controller.ComposeController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


/*
 * b)	Sendið URL á test web client og athugið hvort svarið er löglegt. 
 * Kallið test klasann HttpRequestTest.java. 
*/

@RunWith(SpringRunner.class) // creates the testing Environment and runs test with the class Springrunner.class
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

// For random ports
@LocalServerPort
private int port;

//Client class to use in integration test and Http API
@Autowired
private TestRestTemplate restTemplate;

/* 
 * Method to chek if it works to send HttpRequest to home adress 
 * and get in return a site that entailes "We Got it"
 * */

@Test
public void DoWeHaveIT() throws Exception {
assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", 
		String.class)).contains("We Got it!");
}

}
