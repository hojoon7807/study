package item5;

import java.util.List;

public class SpellCheckerStatic {

  // 사전에 따라 변경될 가능성이 있다 ex) 영어, 한글 ...
  private static final Dictionary dictionary = new Dictionary();

  private SpellCheckerStatic() {
    // 객체 생성 방지
  }

  public static boolean isValid(String word) {
    return dictionary.contains(word);
  }

  public static List<String> suggestions(String typo) {
    return dictionary.closeWordsTo(typo);
  }

}
