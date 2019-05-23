package greenTea.func;

import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsumerInterfaceExplorer<Input> {

  private static Logger logger = LogManager.getLogger(ConsumerInterfaceExplorer.class);

  Consumer<Input> anonymous;
  Consumer<Input> lambda;

  public void consumerExplorerAnonymous(Input t) {

    this.anonymous =
        new Consumer<Input>() {
          @Override
          public void accept(Input t) {
            logger.info("anonymous : " + t.toString());
          }
        };

    this.anonymous.accept(t);
  }

  public void consumerExplorerlambda(Input t) {

    this.lambda =
        (x) -> {
          logger.info("lambda : " + x.toString());
        };
    this.lambda.accept(t);
  }
}
