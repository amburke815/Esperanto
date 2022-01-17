package esperanto.dicts;

import esperanto.langstrings.EnglishString;
import esperanto.langstrings.EsperantoString;
import java.util.Map;

public abstract class EsperantoDictionary {
  public final Map<EnglishString, EsperantoString> dictionary = init();

  public abstract Map<EnglishString, EsperantoString> init();
}
