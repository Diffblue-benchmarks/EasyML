package eml.studio.client.util;

import org.junit.rules.ExpectedException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import eml.studio.client.util.Util;

public class UtilTest {

@Rule public Timeout globalTimeout = new Timeout(10000);
@Rule public ExpectedException thrown = ExpectedException.none();

@Test
  public void parseStrToIntInputNotNullOutputZero() {

    // Arrange
    final String value = "+0.pq.;.";

    // Act
    final int retval = Util.parseStrToInt(value);

    // Assert result
    Assert.assertEquals(0, retval);
  }

@Test
  public void parseStrToIntInputNotNullOutputNegative() {

    // Arrange
    final String value = "-7";

    // Act
    final int retval = Util.parseStrToInt(value);

    // Assert result
    Assert.assertEquals(-7, retval);
  }
}