package esperanto.langstrings;

import esperanto.dicts.EsperantoNoun;
import java.util.Objects;

public class EsperantoString {

  public final String val;

  public EsperantoString(String val) { this.val = val; }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;

    if (!(o instanceof EsperantoString))
      return false;

    return val.equals(((EsperantoString)o).val);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(val);
  }

  @Override
  public String toString() { return val; }
}
