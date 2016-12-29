package bytehala.kata.models;

public final class PointCard {
  String serialNumber;
  int numPoints;
  String countryAlpha2Code;

  private boolean isDuplicated;

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setNumPoints(int numPoints) {
    this.numPoints = numPoints;
  }

  public int getNumPoints() {
    return numPoints;
  }

  public void setCountryAlpha2Code(String alpha2) {
    countryAlpha2Code = alpha2;
  }

  public String getCountryAlpha2Code() {
    return countryAlpha2Code;
  }

  public void setDuplicated(boolean v) {
    isDuplicated = v;
  }

  public boolean isDuplicated() {
    return isDuplicated;
  }
}
