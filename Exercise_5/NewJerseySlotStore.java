public class NewJerseySlotStore extends SlotStore {
    Slot createSlot(String item) {
        if (item.equals("straight")) {
            return new NJStraightSlot();
        } else if (item.equals("progressive")) {
            return new NJProgressiveSlot();
        } else if (item.equals("bonus")) {
            return new NJBonusSlot();
        }
    }
}