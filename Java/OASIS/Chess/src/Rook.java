public class Rook extends Piece {
  /**Initialize Rook with 2 parameters. */
  Rook(int coordinatesX, int coordinatesY) {
    super(coordinatesX, coordinatesY);
  }

  /**Initialize Rook with 3 parameters. */
  Rook(int coordinatesX, int coordinatesY, String color) {
    super(coordinatesX, coordinatesY, color);
  }

  /**Getter symbol. */
  public String getSymbol() {
    return "R";
  }

  /**Can Rook move ?. */
  public boolean canMove(Board board, int x, int y) { 
    if (!board.validate(x, y)) {
      return false;
    } else {
      if (getCoordinatesX() != x && getCoordinatesY() != y) {
        return false;
      }
      if (board.getAt(x, y) != null) {
        if (getColor().compareTo(board.getAt(x, y).getColor()) == 0) {
          return false;
        }
      } else {
        if (getCoordinatesX() == x) {
          int min = Math.min(getCoordinatesY(), y);
          int max = Math.max(getCoordinatesY(), y);
          for (int i = min + 1; i < max; i++) {
            if (board.getAt(x, i) != null) {
              return false;
            }
          }
        }
        if (getCoordinatesY() == y) {
          int min = Math.min(getCoordinatesX(), x);
          int max = Math.max(getCoordinatesX(), x);
          for (int i = min + 1; i < max; i++) {
            if (board.getAt(i, y) != null) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
}
