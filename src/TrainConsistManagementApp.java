import java.util.*; //Hashset willbe in the order of what you input, Set means it will not be in the order
class TrainConsistManagementApp {
    void task() {
        System.out.println("===============================");
        System.out.println("UC5- Preserve insertion order of boggies");
        System.out.println("================================");
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        System.out.println("Final train consist");
        System.out.println(formation);
        formation.add("Sleeper");
        System.out.println("After trying to insert duplicate sleeper: ");
        System.out.println(formation);
    }
    public static void main(String[] args){
        TrainConsistManagementApp ob=new TrainConsistManagementApp();
        ob.task();
    }
}
