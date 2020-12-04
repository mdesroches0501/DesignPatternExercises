public class BabyMonitorTest {
    public static void main (String[] args) {
        BabyData babyData = new BabyData();

        Simple simple = new Simple(babyData);
        babyData.setBaby(true, 0);
        babyData.setBaby(false, 0);
        
        Advanced advanced = new Advanced(babyData);
        // Advanced notification not crying
        babyData.setBaby(false, 0);
         // Advanced notification for yes crying level 0
        babyData.setBaby(true, 0);
        // Advanced notification for yes crying level 1
        babyData.setBaby(true, 1);
         // Advanced notification for yes crying level 2
         babyData.setBaby(true, 1);
    }
}
