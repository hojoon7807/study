package item5;

import java.util.List;
import java.util.Objects;

public class SpellCheckerDI {

  // 사전에 따라 변경될 가능성이 있다 ex) 영어, 한글 ...
  private final Dictionary dictionary;

  public SpellCheckerDI(Dictionary dictionary) {
    this.dictionary = Objects.requireNonNull(dictionary);
  }

  public boolean isValid(String word) {
    return dictionary.contains(word);
  }

  public List<String> suggestions(String typo) {
    return dictionary.closeWordsTo(typo);
  }
}
