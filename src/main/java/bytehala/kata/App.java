package bytehala.kata;

import bytehala.kata.reader.PointCardReader;


public class App {
    public static void main( String[] args ) {
        String fileName = "src/main/resources/" + "beanbag.csv";
        PointCardReader reader = new PointCardReader(fileName);
        reader.readFile();
    }
}
