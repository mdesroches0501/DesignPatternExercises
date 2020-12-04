public class WashingtonSlotStore extends SlotStore {
    Slot createSlot(String item) {
        if (item.equals("straight")) {
            return new WAStraightSlot();
        } else if (item.equals("progressive")) {
            return new WAProgressiveSlot();
        } else if (item.equals("bonus")) {
            return new WABonusSlot();
        }
    }
}