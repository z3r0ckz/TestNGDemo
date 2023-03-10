import org.testng.annotations.Test;

public class TestCases {

    @Test
    void setup(){

        System.out.println("Im inside the setup");
    }

    @Test
    void testSteps(){
        System.out.println("im inside test steps");
    }
    @Test
    void tearDown(){

        System.out.println("im inside tearDown");
    }

}
