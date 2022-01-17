package esperanto.langstrings;

import java.util.Objects;

public class EnglishString {
  public final String val;

  public EnglishString(String val) { this.val = val; }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;

    if (!(o instanceof EnglishString))
      return false;

    return val.equals(((EnglishString)o).val);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(val);
  }

  @Override
  public String toString() { return val; }
}
