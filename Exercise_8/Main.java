// Authors: Spencer Kase Rohlfing & Kendall Guerra

class Main {
  public static void main(String[] args) {
    Player black = new Player("Black");
    Player white = new Player("White");

    black.movePiece(0,"C2");
    white.movePiece(3, "C4");
    black.movePiece(7,"C8");
    white.movePiece(11, "D3");
    black.movePiece(10,"D7");

    black.movePiece(0,"C4");
    black.undoMovePiece();
    black.movePiece(0,"C5");
    white.movePiece(15, "A4");
  }
}