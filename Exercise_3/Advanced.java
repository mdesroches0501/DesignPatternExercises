public class Advanced implements Observer {

    Subject babyData;

    private boolean cry;
    private int level;

    public Advanced(Subject babyData) {
        this.babyData = babyData;
        babyData.registerObserver(this);
    }

    public void update(boolean cry, int level) {
        this.cry = cry;
        this.level = level;
        System.out.println("Advanced: Baby is crying:" + cry);
        System.out.println("Advanced: Baby cry level:" + level);
    }
}
