import java.util.Scanner; 
import java.util.Random;

interface Playable {
  void play (String rps);
}

public class RockPaperScissors implements Playable {
  int score; 

  public RockPaperScissors () {}
  
  public void start () {
    Scanner scan = new Scanner (System.in);

    while (!won()) {
      System.out.println("Choose your weapon!");
      String rps = scan.nextLine ();

      play (rps);
    }

  }

  @Override 
  public void play (String rps) {
    String move = enemyMove();
    if (rps.equals(move)) 
      System.out.println("Draw! Both chose same weapon!");
    else {
      switch (move) {
        case "Rock":
          if (rps.equals("Paper")) {
            System.out.println("Enemy: " + move + "\nYou made a point!"); 
            score += 1;
          } 
          else if (rps.equals("Scissors")) {
            System.out.println("Enemy: " + move + "\nThe enemy made a point! AH!");
            score -= 1;
          }
          break;
        case "Paper": 
          if (rps.equals("Scissors")) {
            System.out.println("Enemy: " + move + "\nYou made a point!");
            score += 1; 
          }
          else if (rps.equals("Rock")) {
            System.out.println("Enemy: " + move + "\nThe enemy made a point! AH!");
            score -= 1;
          }
          break;
        case "Scissors":  
          if (rps.equals("Rock")) {
            System.out.println("Enemy: " + move + "\nYou made a point!");
            score += 1;
          } 
          else if (rps.equals("Paper")) {
            System.out.println("Enemy: " + move + "\nThe enemy made a point! AH!");
            score -= 1;
          }
          break;
        default: System.out.println("Nothing to do");
          break; 
      } 
    }
  }
  
  private String enemyMove () {
    Random rand = new Random (); 
    String[] weapon = { "Rock", "Paper", "Scissors" };
    String choice = weapon[rand.nextInt(weapon.length-1)]; 
    return choice;
  }
  
  private boolean won () {
    if (score == 3) {
      System.out.println("You won!");
      return true;
    }
    else if (score == -3) {
      System.out.println("You lost!");
      System.exit(0);
    }
    return false;
  }


}

class RockPaperScissorsDemo {

  public static void main (String[] args) {
    RockPaperScissors rps = new RockPaperScissors ();

    rps.start ();

  }

}
