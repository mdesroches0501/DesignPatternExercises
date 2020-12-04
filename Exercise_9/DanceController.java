public interface DanceController { 

    public static enum direction{
        FORWARD, LEFT, RIGHT, BACK, MIDDLE
    }

    public void step(direction dir) {
        switch(dir) {
            case FORWARD: {
                color = GuitarController.colors.GREEN;
                break;
            }
            case LEFT: {
                color = GuitarController.colors.RED;
                break;
            }
            case RIGHT: {
                color = GuitarController.colors.YELLOW;
                break;
            }
            case BACK: {
                color = GuitarController.colors.BLUE;
                break;
            }
            case MIDDLE: {
                color = GuitarController.colors.ORANGE;
                break;
            }
        }
    }

    GuitarController.pressFretButton(color);
    GuitarController.pressPick();
    GuitarController.pressTremelo();
}