package item5;

import java.util.List;

public class SpellCheckerSingleton {

  // 사전에 따라 변경될 가능성이 있다 ex) 영어, 한글 ...
  private final Dictionary dictionary = new Dictionary();

  private SpellCheckerSingleton() {
    // 객체 생성 방지
  }

  public static SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();

  public boolean isValid(String word) {
    return dictionary.contains(word);
  }

  public List<String> suggestions(String typo) {
    return dictionary.closeWordsTo(typo);
  }
}
