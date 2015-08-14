import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/home.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String word = request.queryParams("word");
      String puzzlefiedWord = replaceVowels(word);
      Boolean isBlank = false;

      if (word.length() == 0) {
        isBlank = true;
      }

      model.put("word", word);
      model.put("puzzlefiedWord", puzzlefiedWord);
      model.put("isBlank", isBlank);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String replaceVowels(String word){
    String wordMinusVowels = word.replaceAll("[aeiouAEIOU]", "-");
      return wordMinusVowels;
      }
}
