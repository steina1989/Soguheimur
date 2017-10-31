import static org.assertj.core.api.Assertions.*;
/*
 * Fyrst test 
 * a)	Athugið  hvort forritið keyri og að einhver af controller klösunum verður til. 
 * 	    Notið AssertJ (assertThat() o.fl. ) til að athuga lögmæti. Kallið test klasann SmokeTest.java  
*/

public class fyrstTest {

	
	public boolean AssertJTest() {
		// file assertions:
		assertThat(manifestFile).exists(); //  chek if controller class exists
		assertThat(contentOf(manifestFile)).startsWith("Manifest-Version:");

		// stream assertions:
		assertThat(streamFromFile).hasSameContentAs(streamFrom(streamFromFileCopy));
	}
}
