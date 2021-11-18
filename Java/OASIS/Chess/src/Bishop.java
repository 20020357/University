public class Bishop extends Piece {
  /**Initialize Bishop with coordinates. */
  public Bishop(int coordinatesX, int coordinatesY) {
    super(coordinatesX, coordinatesY);
  }

  /**Initialize Bishop with coordinates and color. */
  public Bishop(int coordinatesX, int coordinatesY, String color) {
    super(coordinatesX, coordinatesY, color);
  }

  /**Getter symbol. */
  public String getSymbol() {
    return "B";
  }

  /**Can Bishop move ?. */
  public boolean canMove(Board board, int x, int y) {
    if (!board.validate(x, y)) {
      return false;
    } else {
      if (Math.abs(x - getCoordinatesX()) != Math.abs(y - getCoordinatesY())) {
        return false;
      } else {
        if (board.getAt(x, y) != null && getColor().compareTo(board.getAt(x, y).getColor()) == 0) {
          return false;
        } else {
          if ((getCoordinatesX() < x && getCoordinatesY() < y)
                || (getCoordinatesX() > x && getCoordinatesY() > y)) {
            int minX = Math.min(getCoordinatesX(), x);
            int minY = Math.max(getCoordinatesY(), y);
            for (int i = 1; i < Math.abs(getCoordinatesX() - x); i++) {
              if (board.getAt(minX + i, minY + i) != null) {
                return false;
              }
            }
          }
          if ((getCoordinatesX() < x && getCoordinatesY() > y)
                || (getCoordinatesX() > x && getCoordinatesY() < y)) {
            int minX = Math.min(getCoordinatesX(), x);
            int maxY = Math.max(getCoordinatesY(), y);
            for (int i = 1; i < Math.abs(getCoordinatesX() - x); i++) {
              if (board.getAt(minX + i, maxY - i) != null) {
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }
}
