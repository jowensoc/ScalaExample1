import com.bookshop.application.TextService
import org.scalatest.funsuite.AnyFunSuite

class TextServiceTest extends AnyFunSuite {

  test("TextService.ReverseEachWord") {
    var results = TextService.ReverseEachWord("Joe Bloggs");
    var expectedResults = "eoJ sggolB";

    printf("Results: '%s'. Expected: %s \r\n", results, expectedResults);

    assert(results.equals(expectedResults));
  }

  test("TextService.ReverseText") {
    var results = TextService.ReverseText("Fox jumped over the fence");

    var expectedResults = "ecnef eht revo depmuj xoF";

    printf("Results: '%s'. Expected: %s \r\n", results, expectedResults);

    assert(results.equals(expectedResults));
  }


  test("TextService.DummyRun") {
    var results = TextService.ReverseText("Fox jumped over the fence");

    var expectedResults = "ecnef eht revo depmuj xoF";

    printf("Results: '%s'. Expected: %s \r\n", results, expectedResults);

    assert(results.equals(expectedResults));
  }

}
