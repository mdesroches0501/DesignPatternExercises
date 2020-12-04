import java.util.*;

public abstract class Slot {
    String name;
    String cabinet;
    String display;
    String payment;
    String GPU;
    String OS;

    void create() {
        System.out.println("--- Making a " + name + " ---");
        System.out.println("\nFetching components: " + cabinet + payment + display + GPU);
        System.out.println("\nAssembling components ");
        System.out.println("\nTesting hardware ");
        System.out.println("\nUploading software: " + OS);
        System.out.println("\nTesting software ");
        System.out.println("\nComplete ");
    }
}