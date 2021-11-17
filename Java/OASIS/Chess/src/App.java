public class App {
  /**Main method.*/
  public static void main(String[] args) {
    Board board = new Board();
    Rook rook1 = new Rook(7, 1);
    board.addPiece(rook1);
    Move move = new Move(7, 7, 1, 3, rook1);
    
    System.out.println(rook1.getCoordinatesX() + " " + rook1.getCoordinatesY());
    System.out.println(move.toString());
    System.out.println(rook1.canMove(board, 6, 2));

    Rook rook2 = new Rook(7, 3, "black");
    board.addPiece(rook2);
    System.out.println(rook1.canMove(board, 7, 3));
    System.out.println(rook1.canMove(board, 7, 4));
    System.out.println(rook1.canMove(board, 7, 2));

    Game game = new Game(board);
    game.movePiece(rook1, 7, 2);
    System.out.println(rook1.getCoordinatesX() + " " + rook1.getCoordinatesY());
    game.movePiece(rook1, 7, 3);
    System.out.println(rook1.getCoordinatesX() + " " + rook1.getCoordinatesY());
  }
}
