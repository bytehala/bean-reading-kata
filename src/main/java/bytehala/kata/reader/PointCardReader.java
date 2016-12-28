package bytehala.kata.reader;

import bytehala.kata.models.PointCard;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import java.io.File;

public class PointCardReader {

  private String fileName;

  public PointCardReader(String fileName) {
    System.out.println( "Divesting file: " + fileName );
    this.fileName = fileName;
  }

  public void start() {
    readFile(new File(fileName));
  }

  private void readFile(File file) {
    StreamFactory factory = StreamFactory.newInstance();
    // load the mapping file from the working directory
    factory.load("src/main/resources/" + "pointcards.xml");

    BeanReader in = factory.createReader("pointcards", file);

    Object record = null;
    while ((record = in.read()) != null) {
        if ("pointcard".equals(in.getRecordName())) {
            PointCard pointcard = (PointCard) record;
            System.out.println(pointcard.getSerialNumber());
        }
    }

    in.close();
  }


}
