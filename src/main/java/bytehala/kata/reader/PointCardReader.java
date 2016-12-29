package bytehala.kata.reader;

import bytehala.kata.models.PointCard;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PointCardReader {

  private String fileName;

  public PointCardReader(String fileName) {
    System.out.println( "Divesting file: " + fileName );
    this.fileName = fileName;
  }

  public void start() {
    List<PointCard> pointCards = readFile(new File(fileName));
  }

  private List<PointCard> readFile(File file) {
    List<PointCard> result = null;
    HashMap<String, PointCard> temp = new HashMap<String, PointCard>();

    StreamFactory factory = StreamFactory.newInstance();
    // load the mapping file from the working directory
    factory.load("src/main/resources/" + "pointcards.xml");

    BeanReader in = factory.createReader("pointcards", file);

    Object record = null;
    while ((record = in.read()) != null) {
        if ("pointcard".equals(in.getRecordName())) {
            if(result == null) {
              result = new ArrayList<PointCard>();
            }
            PointCard pointcard = (PointCard) record;
            pointcard.setDuplicated(false);
            System.out.println(pointcard.getSerialNumber());
            if(temp.get(pointcard.getSerialNumber()) != null) {
              temp.get(pointcard.getSerialNumber()).setDuplicated(true);
            } else {
              temp.put(pointcard.getSerialNumber(), pointcard);
            }

        }
    }

    in.close();
    result.addAll(temp.values());
    return result;
  }


}
