import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import com.sun.tools.javac.Main;

public class Chocolate_1_Test {

	@Test
	public void test() throws Exception {
		InputStream sysInBackup = System.in;
		ByteArrayInputStream in_1 = new ByteArrayInputStream("1".getBytes());
		System.setIn(in_1);
		

//	    assertEquals("add 5", chocolate_1.main(args));
	}

}
