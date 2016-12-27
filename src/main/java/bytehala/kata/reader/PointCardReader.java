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

  public void readFile() {
    StreamFactory factory = StreamFactory.newInstance();
    // load the mapping file from the working directory
    factory.load("src/main/resources/" + "pointcards.xml");

    // create a BeanReader to read from "input.csv"
    BeanReader in = factory.createReader("pointcards", new File(fileName));
    // create a BeanWriter to write to "output.csv"
    //BeanWriter out = factory.createWriter("contacts", new File("output.csv"));

    Object record = null;

    while ((record = in.read()) != null) {
        if ("pointcard".equals(in.getRecordName())) {
            PointCard pointcard = (PointCard) record;
            System.out.println(pointcard.getSerialNumber());
            // process the contact...
        }
    }

    in.close();
  }


}
