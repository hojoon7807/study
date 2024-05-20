package item5;

public class App {

  public static void main(String[] args) {
    SpellCheckerSupplier spellCheckerSupplier = new SpellCheckerSupplier(Dictionary::new);
  }
}
