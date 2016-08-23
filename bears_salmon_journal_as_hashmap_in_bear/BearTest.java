import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon(); 
    human = new Human();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals( "Baloo", bear.getName() ); 
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon, "friday");
    assertEquals(1, bear.foodCount());
  }


  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon, "saturday");
    bear.eat(human, "wednesday");
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canEatHuman(){
    bear.eat(human, "thursday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatChicken(){
    bear.eat(chicken, "tuesday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canThrowUp(){
    bear.eat(salmon, "monday");
    Edible food = bear.throwUp();
    //Below (the line with original that's now commented out) we're casting and telling the compiler specifically that the food is a salmon and when we get it back we want it as a salmon so we can call all salmon methods on it (to make the test pass with this we replaced food on the bottom line with original.swim()).
    // Salmon original = (Salmon)food;
    //assertNotNull(food);
    assertEquals("swimming", food.swim());
  }

  @Test
  public void canThrowUpAChicken(){
    bear.eat(chicken, "monday");
    Edible food = bear.throwUp();
    assertEquals("Aaargh. I'm a chicken but I'm swimming", food.swim());

  }

  @Test
  public void canNotThrowUpIfNotEaten(){
    assertEquals(null, bear.throwUp());
  }

  @Test
  public void canCalculateNutritionValueOfWhatItEats(){
    bear.eat(chicken, "wednesday");
    bear.eat(human, "tuesday");
    bear.eat(salmon, "monday");
    assertEquals(2050, bear.totalNutrition());
  }

  @Test
  public void journalCanKeepTrackOfFoodCount(){
    bear.eat(chicken, "monday");
    bear.eat(salmon, "monday");
    bear.eat(salmon, "monday");
    int i = bear.readJournal("monday");
    assertEquals(3,i);
  }

  @Test
  public void journalCanKeepTrackOfChickensEaten(){
    bear.eat(chicken, "tuesday");
    bear.eat(chicken, "tuesday");
    int i = bear.readJournal("tuesday");
    assertEquals(2, i);
  }

}
