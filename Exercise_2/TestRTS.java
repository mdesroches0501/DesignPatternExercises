public class TestRTS{
    public static void main(String[] args){
        GameUnit grunt = new Grunt();
        GameUnit tank = new Tank();
        grunt.moveUnit();
        tank.moveUnit();
        grunt.unitAttack();
        tank.unitAttack();
        tank.setAttack(new Rocket());
        tank.unitAttack();
        tank.setMove(new Fly());
        tank.moveUnit();
        grunt.setAttack(new Pistol());
        grunt.unitAttack();
    }
}