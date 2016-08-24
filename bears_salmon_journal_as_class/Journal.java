import java.util.*;

public class Journal{

  private HashMap<String, Integer> entries;

  public Journal(){
    entries = new HashMap<String, Integer>();
  } 

  public void addCount(String day){
    entries.put(day, entries.getOrDefault(day, 0) + 1);
  }

  public int getADaysCount(String day){
    return entries.getOrDefault(day, 0);
  }

}