public class Simple implements Observer {

    Subject babyData;

    private boolean cry;
    private int level;

    public Simple(Subject babyData) {
        this.babyData = babyData;
        babyData.registerObserver(this);
    }

    public void update(boolean cry, int level) {
        this.cry = cry;
        this.level = level;
        System.out.println("Simple: Baby is crying: " + cry);
    }
}
