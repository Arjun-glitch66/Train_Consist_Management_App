import java.util.*;
class TrainConsistManagementApp {
    static class Bogie{
        String name;
        int capacity;
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }
    void task() {
        System.out.println("===============================");
        System.out.println("UC7- Sort Bogies by Capacity ( Comparator) ");
        System.out.println("================================");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("Ac chair ",56));
        bogies.add(new Bogie("First class",24));
        bogies.add(new Bogie("General",90));
        System.out.println("Before Sorting by Capacity: ");
        for(Bogie b : bogies){
            System.out.println(b.name+"->"+b.capacity);
        }
        Collections.sort(bogies,Comparator.comparingInt(b->b.capacity)); // (Ascending) -> [b1.capacity -b2.capacity] if +ve b2 first, if -ve b1 first
        System.out.println();
        System.out.println("After Sorting by capacity: ");
        for(Bogie b : bogies){
            System.out.println(b.name+"->"+b.capacity);
        }
    }
    public static void main(String[] args){
        TrainConsistManagementApp ob=new TrainConsistManagementApp();
        ob.task();
    }
}
