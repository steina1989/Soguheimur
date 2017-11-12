package is.hi.soguheimur;
/*
 * @author Ólafur Konráð Albertsson oka4@hi.is
 * 
 * */
import org.junit.Test; 
import org.junit.runner.RunWith; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import is.hi.soguheimur.services.PublicationService;
import is.hi.soguheimur.controller.BrowsingController;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;

/*
 * d)	Framkvæmið prófanir á weblayer. Gerið svipað og í c) en notið @WebMvcTest. 
 * Sýnið hvernig þið prófið tvo mismunandi controller-a. Kallið test klasann WebLayerTest.java
*/

@RunWith(SpringRunner.class)
// here we skip using @SpringBootTest

// Only the veflagið is booted but not the entire context. 
//We can only ask to run SoguheimurErrorController Class  */



@WebMvcTest(controllers = { BrowsingController.class }, secure = false)
public class WebLayerTest {

@Autowired
private MockMvc mockMvc;

@MockBean // test of service class
PublicationService pubService;
//thdemo thdemo;

/*
 * Method to chek if it works to send HttpRequest to a /adress and get back adress.html site
*/

@Test
public void ErrorReturnError() throws Exception {
this.mockMvc.perform(get("/browse/thdemo"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
	.string(containsString("Home page")));

}

}