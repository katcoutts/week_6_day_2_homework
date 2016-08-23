import static org.junit.Assert.*;
import org.junit.*;

public class ChickenTest{

  Chicken chicken;

  @Before 
  public void before() {
    chicken = new Chicken();
  }

  @Test
  public void canCluck(){
    assertEquals("Cluck", chicken.cluck());
  }

}