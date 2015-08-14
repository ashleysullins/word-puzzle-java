import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {

  App testApp = new App();

  @Test
  public void replaceVowels_replaceAWithDash_dash() {
    String result = "-";
    assertEquals(result, App.replaceVowels("A"));
  }

  @Test
  public void replaceVowels_replaceEWithDash_dash() {
    String result = "-";
    assertEquals(result, App.replaceVowels("E"));
  }

  @Test
  public void replaceVowels_replaceIWithDash_dash() {
    String result = "-";
    assertEquals(result, App.replaceVowels("I"));
  }

  @Test
  public void replaceVowels_replaceOWithDash_dash() {
    String result = "-";
    assertEquals(result, App.replaceVowels("O"));
  }

  @Test
  public void replaceVowels_replaceUWithDash_dash() {
    String result = "-";
    assertEquals(result, App.replaceVowels("U"));
  }

  @Test
  public void replaceVowels_doNotReplaceConsonantsAndPunctuation_word() {
    String result = "smhqp's!";
    assertEquals(result, App.replaceVowels("smhqp's!"));
  }

}
