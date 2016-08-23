import java.util.*;
public class Bear{
  
  private String name;
  // you can't put primitive types in the <> below of an ArrayList has to be a proper class type. NB there is a reference equivalent for every primitive type (eg int has Integer - the Integer version has methods, such as to.s)
  private ArrayList<Edible> belly;
  private Journal journal; 


  public Bear(String name){
    this.name = name;
    // we're saying anything that implements the Edible interface can be added to our belly ArrayList.
    // as we're adding our salmon and human's as Edibles we can't call any methods that the human and salmon have - we can only call methods that Edibles have - that's why you might list methods in the interface.
    this.belly = new ArrayList<Edible>();
    this.journal = new Journal();
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return belly.size();
  }

  public void eat(Edible food, String day){
    belly.add(food); 
    journal.addCount(day);

    // at this point we need to add one to the value in the hashmap at the key of the day passed in.
  }

  // public int readJournal(String day){
  //   return journal.get(day);
  // }

  public void sleep(){
    belly.clear();
  }

  public Edible throwUp(){
    if (foodCount() > 0) {
      // the 0 below is like an array index it's saying return the first thing that's in the bear's stomach. So as long as the bear has eaten some stuff it will return an Edible (hence why we have edible above in the method as that's what we're expecting.)
      return belly.remove(0);
    }
    // even though we say we're expecting an Edible above, the null is ok before as null is a bit special - it's basically telling you there's an absence of anything.
    return null;
  }

  public int totalNutrition(){
    int counter = 0;
    for (Edible food : belly){
      counter += food.nutritionValue();
    }
    return counter;
  }
  

}
