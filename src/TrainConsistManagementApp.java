import java.util.*;
class TrainConsistManagementApp {
    void task() {
        System.out.println("===============================");
        System.out.println("UC2- ADD PASSENGER BOGGIES TO TRAIN");
        System.out.println("================================");
        List<String> passengerbogies = new ArrayList<>();
        passengerbogies.add("Sleeper");
        passengerbogies.add("AC Chair");
        passengerbogies.add("First class");
        System.out.println("After Adding Boggies: ");
        System.out.println("Passenger Boggies: " +passengerbogies);
        passengerbogies.remove("AC Chair");
        System.out.println("After Removing AC Chair: ");
        System.out.println("Passenger Boggies: " +passengerbogies);
        System.out.println("Checking If 'Sleeper' exists ");
        boolean istrue=false;
        if(passengerbogies.contains("Sleeper")){
            istrue=true;
            System.out.println("Contains sleeper? " +istrue);
        }
        System.out.println("Final Train Passenger consist: ");
        System.out.println(passengerbogies);
    }
    public static void main(String[] args){
        TrainConsistManagementApp ob=new TrainConsistManagementApp();
        ob.task();
    }

}
