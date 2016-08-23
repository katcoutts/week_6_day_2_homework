import static org.junit.Assert.*;
import org.junit.*;

public class JournalTest{
  Journal journal;
  Bear bear;
  Salmon salmon;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    journal = new Journal();
    chicken = new Chicken();
    salmon = new Salmon();
  }

  @Test
  public void canAddToADaysCount(){
    journal.addCount("tuesday");
    journal.addCount("tuesday");
    int i = journal.getADaysCount("tuesday");
    assertEquals(2, i);
  }

}