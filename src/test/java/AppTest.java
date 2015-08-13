import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void methodName_testDescription_expectedOutcome() {
    App testApp = new App();
    // eventually put your testing code here
    assertEquals(true, testApp.methodName("hello"));
  }
}
