import java.util.*;
import java.util.stream.Collectors;

class TrainConsistManagementApp {
    static List<Bogie> bogies;
    static class Bogie{
        String name;
        int capacity;
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }
    public static List<Bogie> addlist() {
        bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Ac chair ", 56));
        bogies.add(new Bogie("First class", 24));
        bogies.add(new Bogie("General", 90));
        return bogies;
    }

    public static void main(String[] args){
        System.out.println("===============================");
        System.out.println("UC8- Filter passenger Bogies using Streams ");
        System.out.println("================================");
        addlist();
        List<Bogie> newbogies = bogies.stream() //stream used instead of manual looping
                .filter(b->b.capacity>60)
                .collect(Collectors.toList()); //collects and stores to the new list "newbogies"
        System.out.println("Filtered capacity greater than 60");
        for(Bogie b:newbogies) {
            System.out.println(b.name + "->" + b.capacity);
        }
    }
}
