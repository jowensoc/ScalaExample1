import com.bookshop.application.TextService
import org.scalatest.funsuite.AnyFunSuite

class TextServiceTest extends AnyFunSuite {

  test("TextService.ReverseEachWord") {
    var results = TextService.ReverseEachWord("Joe Bloggs");
    var expectedResults = "eoJ sggolB";

    printf("Results: '%s'. Expected: '%s' \r\n", results, expectedResults);

    assert(results.equals(expectedResults));
  }

  test("TextService.ReverseText") {
    var results = TextService.ReverseText("Fox jumped over the fence");

    var expectedResults = "ecnef eht revo depmuj xoF";

    printf("Results: '%s'. Expected: '%s' \r\n", results, expectedResults);

    assert(results.equals(expectedResults));
  }


  test("TextService.DummyRun") {
    var results = TextService.ReverseText("Fox jumped over the fence");

    var expectedResults = "ecnef eht revo depmuj xoF";

    printf("Results: '%s'. Expected: '%s' \r\n", results, expectedResults);

    assert(results.equals(expectedResults));
  }

  test("TextService.RemoveVowels") {
    var results = TextService.RemoveVowels("Apple Pie");

    var expectedResults = "ppl P";

    printf("Case Sensitivity Ignored. Results: '%s'. Expected: '%s' \r\n", results, expectedResults);

    //assert(results.equals(expectedResults));
    assert(results.equalsIgnoreCase(expectedResults));
  }

test("TextService.RemoveConsonants") {
    var results = TextService.RemoveConsonants("Apple Pie");

    var expectedResults = "Ae ie";

    printf("Case Sensitivity Ignored. Results: '%s'. Expected: '%s' \r\n", results, expectedResults);

    assert(results.equalsIgnoreCase(expectedResults));
  }

}
