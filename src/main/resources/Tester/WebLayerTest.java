

import org.junit.Test; //
import org.junit.runner.RunWith; //
import org.springframework.beans.factory.annotation.Autowired; //
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest; //
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;//
import org.springframework.test.web.servlet.MockMvc;
import is.hi.soguheimur.controller.ComposeController;
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
//We can only ask to run KennariController Class  */

@WebMvcTest (ComposeController.class)

public class WebLayerTest {

@Autowired
private MockMvc mockMvc;

@MockBean // test of service class
DaginnService kennariService;

/*
 * Method to chek if it works to send HttpRequest to a /adress and get back adress.html site
*/

@Test
public void nyrKennariSkilarKarl() throws Exception {
this.mockMvc.perform(get("/listiKennarar"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
	.string(containsString("Listi")));

}

}