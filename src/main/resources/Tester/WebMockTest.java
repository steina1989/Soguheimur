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
 * e)	Framkvæmið prófanir á controller og service. Kallið test klasann WebMockTest.java
*/
@WebMvcTest (KennariController.class)

public class WebMockTest {

// Þjónninn (Tomcat) er ekki keyrður upp
@Autowired
private MockMvc;

// Bætum við prófunar (e.mock) service klasa
//- kemur úr springframework safninu (fyrir Mockito)
// Serstaklega gert fyrir Mockito safnið

@MockBean
DaginnService

@Test
public void testaLifirTrue() throws Exception {
/*
Látum erNafnRett() skila true
notum Mockto í prófanirnar - Mockto er Framwork fyrir unit testing í Java
http://site.mockingto.org/
*/

//prófið ætti að takast - prófum Sönnu leiðina í if-setningunni
when(daginnService.erALifi()).thenReturn(true);
this.mockMvc.perform(get("lifir/"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
.string(containsString("Nýr kennari")));
}
@Test
public void testaLifirFalse() throws Exception {

// Prófið ætti a takast - prófum ósönnuðu leiðina í if setningunni
when(daginnService.erALifi()).thenReturn(false);
this.mockMvc.perform(get("lifir/"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
.string(containsString("Listi yfir kennara")));

}
@Test
public void testaLifirFalseMedRongumStreng() throws Exception {

// Prófið ætti ekki að takast - prófum ósönnu leiðina í if- setningunni
when(daginnService.erALifi()).thenReturn(false);
this.mockMvc.perform(get("lifir/"))
	.andDo(print())
	.andExpect(status()
	.isOk())
	.andExpect(content()
.string(containsString("Nýr kennari"))); 

}

// that is supposed to be tested in the controller
/* 
dæmi til að sýna prófanir með kalli á service klasa
@param model
@return skilar heima.html ef þjónustan "er á lífi" annars listiKennara
*/
/*

@RequestMapping  (value = "/lifir", method=RequestMethod.Get) // viðbótaðaferð til að syna prófanir
public String lifir(Model model){
	Kennari K = new Kennari();
	model.addAttribute("kennari",k);
	if(daginnService.erALifi())
		return "heima";
	else
		return "listiKennara";	
}
*/

}