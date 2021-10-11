import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalc {
    public static void main(String[] args) {

    }
    @Test
    public void testadd(){
        Assertions.assertEquals(2, Calc.add(1,1));
    }

}