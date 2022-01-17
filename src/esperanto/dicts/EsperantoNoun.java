package esperanto.dicts;

import esperanto.langstrings.EnglishString;
import esperanto.langstrings.EsperantoString;
import java.util.HashMap;
import java.util.Map;

public class EsperantoNoun extends EsperantoDictionary {
  public final Map<EnglishString, EsperantoString> dictionary = init();

  public Map<EnglishString, EsperantoString> init() {
    Map<EnglishString, EsperantoString> dict = new HashMap<>();

    /**
     * My currently known esperanto nouns. Only keeping track of singular masculine nouns for now
     */
    dict.putIfAbsent(
        new EnglishString("dog"),
        new EsperantoString("hundo"));

    dict.putIfAbsent(
        new EnglishString("boy"),
        new EsperantoString("knabo"));

    dict.putIfAbsent(
        new EnglishString("park"),
        new EsperantoString("parko"));

    dict.putIfAbsent(
        new EnglishString("bread"),
        new EsperantoString("pano"));

    dict.putIfAbsent(
        new EnglishString("milk"),
        new EsperantoString("lakto"));

    dict.putIfAbsent(
        new EnglishString("cat"),
        new EsperantoString("kato"));

    dict.putIfAbsent(
        new EnglishString("cafe"),
        new EsperantoString("kafejo"));

    dict.putIfAbsent(
        new EnglishString("sun"),
        new EsperantoString("suno"));

    return dict;
  }

  public EsperantoString pluralize(EnglishString engString) {
    if (!dictionary.containsKey(engString))
      throw new IllegalArgumentException("not found in noun dictionary");

    return pluralize(dictionary.get(engString));
  }

  public EsperantoString pluralize(EsperantoString espString) {
    if (!dictionary.containsValue(espString))
      throw new IllegalArgumentException("not found in noun dictionary");

    return new EsperantoString(espString + "j");
  }

  public EsperantoString indirectify(EnglishString engString) {
    if (!dictionary.containsKey(engString))
      throw new IllegalArgumentException("not found in noun dictionary");

    return indirectify(dictionary.get(engString));
  }

  public EsperantoString indirectify(EsperantoString espString) {
    if (!dictionary.containsValue(espString))
      throw new IllegalArgumentException("not found in noun dictionary");

    return new EsperantoString(espString + "n");
  }

  public EsperantoString feminize(EnglishString engString) {
    if (!dictionary.containsKey(engString))
      throw new IllegalArgumentException("not found in noun dictionary");

    return feminize(dictionary.get(engString));
  }

  public EsperantoString feminize(EsperantoString espString) {
    if (!dictionary.containsValue(espString))
      throw new IllegalArgumentException("not found in noun dictionary");

    return new EsperantoString(espString.val.substring(0, espString.val.length() - 1) + "ino");
  }
}
