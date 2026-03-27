import java.util.*;
class TrainConsistManagementApp {
    void task() {
        System.out.println("===============================");
        System.out.println("UC3- Track unique boggie ids");
        System.out.println("================================");
        Set<String> bogies = new HashSet<>();
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        //Testin deuplicate ids
        bogies.add("BG101");

        System.out.println("Boggie id After insertion: ");
        System.out.println(bogies);
    }
    public static void main(String[] args){
        TrainConsistManagementApp ob=new TrainConsistManagementApp();
        ob.task();
    }
}
