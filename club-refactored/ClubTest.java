import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class ClubTest{
    Club club;
    Winger winger;
    ScrumHalf scrumhalf;
    Prop prop;



  @Before 
  public void before() {
    club = new Club("Castleford Tigers");
    winger = new Winger();
    scrumhalf = new ScrumHalf();
    prop = new Prop();
  }

  @Test
  public void hasName(){
    assertEquals( "Castleford Tigers", club.getName() ); 
  }

  @Test
  public void teamsheetStartsEmpty(){
    assertEquals( 0, club.playerCount());
  }

  @Test
  public void canPickAPropForTeam(){
    club.pick(prop);
    assertEquals(1, club.playerCount());
  } 

  @Test
  public void canPickAWingerForTeam(){
    club.pick(winger);
    assertEquals(1, club.playerCount());
  }


  // @Test
  // public void cannotPickAnotherPlayerWhenTeamIsFull(){
  //   for(int i = 0; i < 13; i++){
  //     club.pick(player);
  //   }
  //   assertEquals(13, club.playerCount());
  // }

  // @Test
  // public void teamIsComplete(){
  //   for(int i = 0; i < 13; i++){
  //     club.pick(player);
  //   }
  //   assertEquals(true, club.teamComplete());
  // }

  // @Test
  // public void teamIsNotComplete(){
  //   for(int i = 0; i < 12; i++){
  //     club.pick(player);
  //   }
  //   assertEquals(false, club.teamComplete());
  // }

  @Test
  public void shouldEmptyTeamAfterMatch(){
    club.pick(prop);
    assertEquals(1, club.playerCount());
    club.postMatch();
    assertEquals(0, club.playerCount());
  }

}