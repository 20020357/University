public abstract class Piece {
  private int coordinatesX;
  private int coordinatesY;
  private String color;

  /**Initialize Piece with coordinates X and Y. */
  public Piece(int coordinatesX, int coordinatesY) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    color = "white";
  }

  /**Initialize Piece with coordinates X, Y and color. */
  public Piece(int coordinatesX, int coordinatesY, String color) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    this.color = color;
  }

  /**Getter coordinatesX. */
  public int getCoordinatesX() {
    return coordinatesX;
  }

  /**Setter coordinatesX. */
  public void setCoordinatesX(int coordinatesX) {
    this.coordinatesX = coordinatesX;
  }

  /**Getter coordinatesY. */
  public int getCoordinatesY() {
    return coordinatesY;
  }

  /**Setter coordinatesY. */
  public void setCoordinatesY(int coordinatesY) {
    this.coordinatesY = coordinatesY;
  }

  /**Getter color. */
  public String getColor() {
    return color;
  }

  /**Setter color. */
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter Symbol. */
  public abstract String getSymbol();
  
  public abstract boolean canMove(Board board, int x, int y);
}
