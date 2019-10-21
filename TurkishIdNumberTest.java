
import org.junit.Assert;
import org.junit.Test;

public class TurkishIdNumberTest {

  @Test
  public void IsValidOutputFalse000e4ec542325f17b5f() {
    final TurkishIdNumber turkishIdNumber = new TurkishIdNumber(
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
    Assert.assertFalse(turkishIdNumber.IsValid());
  }

  @Test
  public void IsValidOutputFalse0028e423f2694c4233a() {
    final TurkishIdNumber turkishIdNumber = new TurkishIdNumber("\uff5b\uff28\u007f9\uff37$\uff5ao\uff3d60");
    Assert.assertFalse(turkishIdNumber.IsValid());
  }

  @Test
  public void IsValidOutputFalse003b1d069a4566ac670() {
    final TurkishIdNumber turkishIdNumber = new TurkishIdNumber("0[ \u00180yqw\u007f00");
    Assert.assertFalse(turkishIdNumber.IsValid());
  }

  @Test
  public void IsValidOutputFalse000e4ec542325f17b5f2() {
    final TurkishIdNumber turkishIdNumber = new TurkishIdNumber(
        "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
    Assert.assertFalse(turkishIdNumber.IsValid());
  }

  @Test
  public void IsValidOutputFalse0028915c183d0f25bb2() {
    final TurkishIdNumber turkishIdNumber = new TurkishIdNumber("~\uff39\uff33L5\uff3f\uff20\uff34\uff3b71");
    Assert.assertFalse(turkishIdNumber.IsValid());
  }

  @Test
  public void IsValidOutputFalse0006d56eea0a2935182() {
    final TurkishIdNumber turkishIdNumber = new TurkishIdNumber("foo");
    Assert.assertFalse(turkishIdNumber.IsValid());
  }
}
