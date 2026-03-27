import java.util.*; //Hashset willbe in the order of what you input, Set means it will not be in the order
class TrainConsistManagementApp {
    void task() {
        System.out.println("===============================");
        System.out.println("UC6- Map bogie to capacity (hashmap)");
        System.out.println("================================");
        Map<String,Integer> capacitymap = new HashMap<>();
        capacitymap.put("First class",24);
        capacitymap.put("Sleeper",72);
        capacitymap.put("Cargo",120);
        capacitymap.put("AC Chair",56);
        System.out.println("Bogie capacity details: ");
        for(Map.Entry<String,Integer> mp:capacitymap.entrySet()){
            System.out.println(mp.getKey()+"->"+mp.getValue());
        }
    }
    public static void main(String[] args){
        TrainConsistManagementApp ob=new TrainConsistManagementApp();
        ob.task();
    }
}
