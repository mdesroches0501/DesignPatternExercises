public class NevadaSlotStore extends SlotStore {
    Slot createSlot(String item) {
        if (item.equals("straight")) {
            return new NVStraightSlot();
        } else if (item.equals("progressive")) {
            return new NVProgressiveSlot();
        } else if (item.equals("bonus")) {
            return new NVBonusSlot();
        }
    }
}