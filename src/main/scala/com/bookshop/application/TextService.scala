package com.bookshop.application

object TextService {

  private def reverseText(item: String, reverseOrder : Boolean): String = {
    var finalText = "";
    var text = "";

    var list = if (!reverseOrder) item.split(" ") else item.split(" ").reverse;

    // LOOP THROUGH EACH WORD
    for (element <- list) {
      var totalLength = element.length - 1;

      // LOOP THROUGH EACH LETTER
      for (lastIndex <- (totalLength to 0 by -1)) {
        text += element(lastIndex);
      }

      finalText += text + " ";
      text = "";
    }

    finalText.trim();
  }

  def ReverseEachWord(item : String): String = {
    return reverseText(item, false);
  }

  def ReverseText(item: String): String = {
    return reverseText(item, true);
  }

}
