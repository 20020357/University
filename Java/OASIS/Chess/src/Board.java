import java.util.ArrayList;

public class Board {
  public static final int HEIGHT = 8;
  public static final int WIDTH = 8;
  private ArrayList<Piece> pieces = new ArrayList<Piece>();

  /**Check coordinate. */
  boolean validate(int x, int y) {
    if ((1 <= x && x <= 8) && (1 <= y && y <= 8)) {
      return true;
    }
    return false;
  }

  /**Add piece to board. */
  public void addPiece(Piece piece) {
    if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
      boolean invalid = false;
      for (int i = 0; i < pieces.size(); i++) {
        if (pieces.get(i).getCoordinatesX() == piece.getCoordinatesX()
              && pieces.get(i).getCoordinatesY() == piece.getCoordinatesY()) {
          invalid = true;
        }
      }
      if (invalid == false) {
        pieces.add(piece);
      }
    }
  }

  /**Getter piece coordinates. */
  public Piece getAt(int x, int y) {
    for (int i = 0; i < pieces.size(); i++) {
      if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
        return pieces.get(i);
      }
    }
    return null;
  }

  /**Remove a piece from the chessboard. */
  public void removeAt(int x, int y) {
    for (int i = 0; i < pieces.size(); i++) {
      if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
        pieces.remove(i);
        break;
      }
    }
  }

  /**Getter pieces. */
  public ArrayList<Piece> getPieces() {
    return pieces;
  }

  /**Setter pieces. */
  public void setPieces(ArrayList<Piece> pieces) {
    this.pieces = pieces;
  }
}
