public class Move {
  private int startX;
  private int endX;
  private int startY;
  private int endY;
  private Piece movedPiece;
  private Piece killedPiece;

  /**Initialize Move with 5 parameters. */
  public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
    this.startX = startX;
    this.endX = endX;
    this.startY = startY;
    this.endY = endY;
    this.movedPiece = movedPiece;
  }

  /**Initialize Move with 6 parameters. */
  public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
    this.startX = startX;
    this.endX = endX;
    this.startY = startY;
    this.endY = endY;
    this.movedPiece = movedPiece;
    this.killedPiece = killedPiece;
  }

  /**Getter startX. */
  public int getStartX() {
    return startX;
  }

  /**Setter startX. */
  public void setStartX(int startX) {
    this.startX = startX;
  }

  /**Getter endX. */
  public int getEndX() {
    return endX;
  }

  /**Setter endX. */
  public void setEndX(int endX) {
    this.endX = endX;
  }

  /**Getter startY. */
  public int getStartY() {
    return startY;
  }

  /**Setter startY. */
  public void setStartY(int startY) {
    this.startY = startY;
  }

  /**Getter endY. */  
  public int getEndY() {
    return endY;
  }

  /**Setter endY. */
  public void setEndY(int endY) {
    this.endY = endY;
  }

  /**Getter movedPiece. */
  public Piece getMovedPiece() {
    return movedPiece;
  }

  /**Setter movedPiece. */
  public void setMovedPiece(Piece movedPiece) {
    this.movedPiece = movedPiece;
  }

  /**Getter killedPiece. */
  public Piece getKilledPiece() {
    return killedPiece;
  }

  /**Setter killedPiece. */
  public void setKilledPiece(Piece killedPiece) {
    this.killedPiece = killedPiece;
  }

  /**Getter toString. */
  public String toString() {
    String coordinatesX = "";
    switch (endX) {
      case 1:
        coordinatesX = "a";
        break;
      case 2:
        coordinatesX = "b";
        break;
      case 3:
        coordinatesX = "c";
        break;
      case 4:
        coordinatesX = "d";
        break;
      case 5:
        coordinatesX = "e";
        break;
      case 6:
        coordinatesX = "f";
        break;
      case 7:
        coordinatesX = "g";
        break;
      case 8:
        coordinatesX = "h";
        break;
      default:
        break;
    }
    return movedPiece.getColor() + "-" + movedPiece.getSymbol()
            + coordinatesX + endY;
  }
}