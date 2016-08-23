 import java.util.*;

 class Club{

  private String name;
  private ArrayList<Playable> squad;

  public Club(String name){
    this.name = name;
    this.squad = new ArrayList<Playable>();
  }

  public String getName(){
    return this.name;
  }

  public int playerCount(){
   return squad.size();
  }

  public void pick(Playable player){
   squad.add(player);
  }

  // public boolean teamComplete(){
  //  return playerCount() == team.length;
  // }

  public void postMatch(){
    squad.clear();
  } 
  

}