package is.hi.soguheimur;
/*
 * @author Ólafur Konráð Albertsson oka4@hi.is
 * 
 * */
import org.junit.Test;
import org.junit.runner.RunWith; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import is.hi.soguheimur.controller.LoginController;
import is.hi.soguheimur.controller.SoguheimurErrorController;
import is.hi.soguheimur.services.UserService;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.*;

/*
 * e) Framkvæmið prófanir á controller með gefnu gildi á kalli á aðferð í service.
 *    Kallið test klasann WebMockTest.java
*/
@RunWith(SpringRunner.class)
@WebMvcTest (SoguheimurErrorController.class)
public class WebMockTest {

// Þjónninn (Tomcat) er ekki keyrður upp
@Autowired
private MockMvc mockMvc;

// Bætum við prófunar (e.mock) service klasa
// kemur úr springframework safninu (fyrir Mockito)
// Serstaklega gert fyrir Mockito safnið

@MockBean
UserService userService; // bý til gerfieintak <f klsasa inn í UserService

//-----------------------------------------------------------
@Test
public void testaerrorTrue() throws Exception {
/*
Látum erNafnRett() skila true
notum Mockto í prófanirnar - Mockto er Framwork fyrir unit testing í Java
http://site.mockingto.org/
*/

//prófið ætti að takast - prófum Sönnu leiðina í if-setningunni
when(userService.test()).thenReturn(true);
this.mockMvc.perform(get("/error"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
.string(containsString("message"))); // string sem á a vera inn í /error
}
///*
//------------------------------------------------------------
@Test
public void testaerrorFalse() throws Exception {

// Prófið ætti a takast - prófum ósönnuðu leiðina í if setningunni
when(userService.test()).thenReturn(false);
this.mockMvc.perform(get("/error"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
.string(containsString("message"))); // string sem á a vera inn í /error

}
//---------------------------------------------------------------
@Test
public void testaErrorFalseMedRongumStreng() throws Exception {

// Prófið ætti ekki að takast - prófum ósönnu leiðina í if- setningunni
when(userService.test()).thenReturn(false);
this.mockMvc.perform(get("/error"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
.string(containsString("message")));  // string sem á a vera inn í /error

}
//*/
}