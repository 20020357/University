public abstract class Piece {
  private int coordinatesX;
  private int coordinatesY;
  private String color;

  /**Initialize Piece with coordinates X and Y. */
  public Piece(int coordinatesX, int coordinatesY) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
  }

  /**Initialize Piece with coordinates X, Y and color. */
  public Piece(int coordinatesX, int coordinatesY, String color) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    this.color = color;
  }

  /**Getter Symbol. */
  public abstract String getSymbol();
  public abstract boolean canMove();

}
