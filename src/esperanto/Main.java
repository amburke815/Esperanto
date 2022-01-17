package esperanto;

import esperanto.dicts.EsperantoDictionary;
import esperanto.dicts.EsperantoNoun;
import esperanto.langstrings.EnglishString;

public class Main {
  public static void main(String[] args) {
    EsperantoNoun nounDict = new EsperantoNoun();
    System.out.println("boy: " + nounDict.dictionary.get(new EnglishString("boy")));
    System.out.println("girl: " + nounDict.feminize(new EnglishString("boy")));
    System.out.println("indirect boy object: " + nounDict.indirectify(new EnglishString("boy")));
    System.out.println("indirect girl object: " + // Redesign for chaining to work, possibly introduce an EsperantoBaseNoun type
        nounDict.indirectify(nounDict.feminize(new EnglishString("boy"))));
  }
}
