public abstract class SlotStore {

    public Slot createSlot(String type) {
        Slot slot;

        slot = createSlot(type);

        return slot;
    }
   abstract Slot createSlot(String type);
}