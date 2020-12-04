public class SlotTestDrive {

    public static void main(String[] args) {
        SlotStore nvStore = new NevadaSlotStore();
        System.out.println("The Taj Mahal orders a: \n");
        Slot slot = nvStore.createSlot("progressive");
    }
}