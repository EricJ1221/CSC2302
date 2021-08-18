

public class Team <T extends Player> { //by adding extends Player java will not allow us to create or add a team without it extending Player
   private String name;    //could also have declared an interface to do this 
   int played = 0;
   int won = 0;
   int lost = 0;
   int tied = 0;
   
   private ArrayList<T> members = new ArrayList<>();
   
   public Team(String name){ //made a constructor for the team
      this.name = name;
   }
   
   public String getName(){ //need a getter, getter will return something, unlike a setter
      return name;
   }
   
   public boolean addPlayer(T player){
      if(members.contains(player)){
         System.out.println((player).getName() + " is already on this team");
         return false;
      }else {
         members.add(player);
         System.out.println((player).getName() + " picked for team " + this.name);
         return true;
      }
   }
      
      public int numPlayers(){
         return this.members.size();
      }
      
      public void matchResult(Team opponent, int ourScore, int theirScore){
         if(ourScore > theirScore){
            won++;
         }else if(ourScore == theirScore){
            tied++;
         }else{
            lost++;
         }
         played++;
         if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
         }
      }
      public int ranking(){
         return(won * 2) + tied;
      }
   }