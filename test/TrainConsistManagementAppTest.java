import org.junit.jupiter.api.Test; //create new folder test (mark directory as test soruces root) , right click on main java file ->generate ->test->junit->ok->select location as test directory .

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*; //rectify the junit error (hover over it)

class TrainConsistManagementAppTest  {
    static List<TrainConsistManagementApp.Bogie> bogies= TrainConsistManagementApp.addlist(); //datas stored into a new list here

    static List<TrainConsistManagementApp.Bogie> fbc (int thresh) {
        return bogies.stream().filter(b -> b.capacity > thresh).collect(Collectors.toList());
    }
    @Test
    void testFilter_CapacityGreaterThanThreshold(){
        List <TrainConsistManagementApp.Bogie> newl=fbc(60); //returned values stored in newlist
        assertEquals(2,newl.size());
    }
}