// 21:51

import org.junit.Test; //
import org.junit.runner.RunWith; //
import org.springframework.beans.factory.annotation.Autowired; //
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest; //
import org.springframework.test.context.junit4.SpringRunner;//

import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;

/*
 * c)	Framkvæmið prófanir án þess að þurfa að kalla á þjóninn 
 * 		(server) en á laginu þar fyrir neðan þar sem Spring meðhöndlanr HttpRequest 
 * 		beiðnir og afhendir controllernum þau. Notið @AutoConfigureMockMvc Kallið test 
 *		klasann ApplicationTest.java
*/

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {

// The server is not booted
private MockMvc mockMvc;

/*  Method to chek if it works to send HttpRequest to /browse and get in return
 *  browse.html site that contains the string "Yes"
 *  */

@Test
public void BrowseReturns() throws Exception {
this.mockMvc.perform(get("/browse"))
	.andDo(print()).andExpect(status().isOk())
	.andExpect(content().string(containsString("Yes")));
}

}