package com.bookshop.application

import scala.collection.mutable.ArrayBuffer

object Main extends App {
  var listOfEmployees = ArrayBuffer[String]();

  def reverseText(item: String) : String = {
    var finalText = "";
    var text = "";

    var list = item.split(" ");
    //var list = if(reverseOrder) item.split(" ") else item.split(" ").reverse;

    // LOOP THROUGH EACH WORD
    for(element <- list) {
      var totalLength = element.length - 1;

      // LOOP THROUGH EACH LETTER
      for (lastIndex <- (totalLength to 0 by -1)) {
        text += element(lastIndex);
      }

      // CAPTIALISE FIRST LETTER ONLY
      text = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();

      finalText += text + " ";
      text = "";
    }

    return finalText.trim();
  }

  def examineEntry(item : String): Unit = {
    printf("Entry is %s \r\n", item);
    printf("Entry is %s characters long \r\n", item.length);
    printf("Reversed Text %s \r\n", reverseText(item));
    println("");
  }

  listOfEmployees.addOne("Jim");
  listOfEmployees.addOne("Peter");
  listOfEmployees.addOne("Jane");
  listOfEmployees.addOne("Joe Bloggs");

  for (item <- listOfEmployees) {
    examineEntry(item);
  }

}