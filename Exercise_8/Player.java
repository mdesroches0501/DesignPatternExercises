public class Player {
  String color;
  Command[] commands = new Command[16];
  Object[] pieces = new Object[16];
  Command undoCommand;

  public Player(String color){
    this.color = color;

    Command noCommand = new NoCommand();
    for(int i = 0; i < 16; i++){
      commands[i] = noCommand;  
    }
    undoCommand = noCommand;

    int i = 0;
    for(i = 0; i < 8; i++){
      Pawn p = new Pawn("Pawn" + i, "B" + (i+1));
      pieces[i] = p;
    }
    pieces[i++] = new Rook("Rook0","A1");
    pieces[i++] = new Rook("Rook1","A8");

    pieces[i++] = new Knight("Knight0","A2");
    pieces[i++] = new Knight("Knight1","A7");

    pieces[i++] = new Bishop("Bishop0","A3");
    pieces[i++] = new Bishop("Bishop1","A6");

    pieces[i++] = new Queen("Queen","A4");
    pieces[i++] = new King("King","A5");

  }

  public void movePiece(int slot, String location){
    if(slot < 8){ //Just Pawns
      PawnMove pm = new PawnMove((Pawn)pieces[slot], location);
      commands[slot] = pm;
    }else if(slot == 8 || slot == 9){ //Just Rooks
      RookMove rm = new RookMove((Rook)pieces[slot], location);
      commands[slot] = rm;
    }else if(slot == 10 || slot == 11){ //Just Knights
      KnightMove km = new KnightMove((Knight)pieces[slot], location);
      commands[slot] = km;
    }else if(slot == 12 || slot == 13){ //Just Bishops
      BishopMove bm = new BishopMove((Bishop)pieces[slot], location);
      commands[slot] = bm;
    }else if(slot == 14){ //Just Queen
      QueenMove qm = new QueenMove((Queen)pieces[slot], location);
      commands[slot] = qm;
    }else if(slot == 15){ //Just King
      KingMove km = new KingMove((King)pieces[slot], location);
      commands[slot] = km;
    }else{
      System.out.println("Slot doesn't exist...");
      return;
    }
    System.out.print(color+ ": ");
    undoCommand = commands[slot];
    commands[slot].execute();
  }

  public void undoMovePiece(){
    System.out.print(color+ ": UNDO:");
    undoCommand.undo();
  }
}