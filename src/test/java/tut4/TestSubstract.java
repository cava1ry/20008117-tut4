import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSubstract {
    public static void main(String[] args) {

    }
    @Test
    public void testsubstract(){
        Assertions.assertEquals(1, Calc.subtract(2,1));
    }

}