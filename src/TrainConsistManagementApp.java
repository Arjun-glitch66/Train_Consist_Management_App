import java.util.*;
class TrainConsistManagementApp {
    void task() {
        System.out.println("===============================");
        System.out.println("UC4- Maintain Ordered Boggie Consist");
        System.out.println("================================");
        List<String> trainconsist = new LinkedList<>();
        trainconsist.add("Engine");
        trainconsist.add("Sleeper");
        trainconsist.add("AC");
        trainconsist.add("Cargo");
        trainconsist.add("Guard");
        System.out.println("Initial train consist");
        System.out.println(trainconsist);
        trainconsist.add(2,"Pantry car");
        System.out.println("After inserting pantry car at position 2: ");
        System.out.println(trainconsist);
        trainconsist.removeFirst();
        trainconsist.removeLast();
        System.out.println("After removing first and last boggie: ");
        System.out.println(trainconsist);
    }
    public static void main(String[] args){
        TrainConsistManagementApp ob=new TrainConsistManagementApp();
        ob.task();
    }
}
