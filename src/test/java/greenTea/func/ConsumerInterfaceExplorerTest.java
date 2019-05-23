package greenTea.func;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConsumerInterfaceExplorerTest {

  ConsumerInterfaceExplorer<String> c;

  @Before
  public void setUp() throws Exception {
    c = new ConsumerInterfaceExplorer<>();
  }

  @After
  public void tearDown() throws Exception {}

  @Test
  public void consumerExplorerAnonymous() {

    c.consumerExplorerAnonymous("black");
  }

  @Test
  public void consumerExplorerlambda() {

    c.consumerExplorerlambda("panther");
  }
}
