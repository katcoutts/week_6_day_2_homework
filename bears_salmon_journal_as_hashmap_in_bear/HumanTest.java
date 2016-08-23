import static org.junit.Assert.*;
import org.junit.*;

public class HumanTest{

  Human human;

  @Before 
  public void before() {
    human = new Human();
  }

  @Test
  public void canSpeak(){
    assertEquals("speaking", human.speak());
  }

}