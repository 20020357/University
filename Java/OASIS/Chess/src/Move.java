public class Move {
  private int startX;
  private int startY;
  private int endX;
  private int endY;
  private Piece movedPiece;
  private Piece killedPiece;

  /**Initialize Move with 5 parameters. */
  public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
    this.movedPiece = movedPiece;
  }

  /**Initialize Move with 6 parameters. */
  public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
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
    String coordinatesEndX = "";
    switch (endX) {
      case 1:
        coordinatesEndX = "a";
        break;
      case 2:
        coordinatesEndX = "b";
        break;
      case 3:
        coordinatesEndX = "c";
        break;
      case 4:
        coordinatesEndX = "d";
        break;
      case 5:
        coordinatesEndX = "e";
        break;
      case 6:
        coordinatesEndX = "f";
        break;
      case 7:
        coordinatesEndX = "g";
        break;
      case 8:
        coordinatesEndX = "h";
        break;
      default:
        break;
    }
    return movedPiece.getColor() + "-" + movedPiece.getSymbol()
            + coordinatesEndX + endY;
  }
}