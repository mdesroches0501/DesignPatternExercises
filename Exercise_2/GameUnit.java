public abstract class GameUnit {
    MoveBehavior moveBehavior; //interface
    Weapon weapon; //interface

    //methods
    public void moveUnit(){
        moveBehavior.move();
    }
    public void unitAttack(){
        weapon.attack();
    }
    public void setMove(MoveBehavior mb){ 
        moveBehavior = mb;
    }
    public void setAttack(Weapon w){
        weapon = w;
    }
}