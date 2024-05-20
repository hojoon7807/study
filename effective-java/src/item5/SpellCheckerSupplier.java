package item5;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class SpellCheckerSupplier {
  private final Dictionary dictionary;

  public SpellCheckerSupplier(Supplier<? extends Dictionary> factory) {
    this.dictionary = Objects.requireNonNull(factory.get());
  }

  public boolean isValid(String word) {
    return dictionary.contains(word);
  }

  public List<String> suggestions(String typo) {
    return dictionary.closeWordsTo(typo);
  }
}
