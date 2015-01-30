import java.util.Random;

interface Talkative {
  String talk ();
}

public class PseudoRandomSentenceGenerator implements Talkative {
  
  String[][] words = {
    { "The", "This", "Go", "There" },
    { "wolf", "is", "have", "are" },
    { "must", "not", "some", "no" }, 
    { "die", "kindergarten", "ice", "dogs" }
  }; 

  public PseudoRandomSentenceGenerator () {}
  
  public void start () {
    System.out.println(talk ()); 
  }
  
  @Override
  public String talk () {
    Random rand = new Random ();
    String sentence = "";

    for (int i=0; i<words.length; i++)
      sentence += words[i][rand.nextInt(words[i].length)] + " ";
    return sentence ;
  }
}

class PRSGDemo {
  
  public static void main (String[] args) {
    
    PseudoRandomSentenceGenerator psrg = new PseudoRandomSentenceGenerator ();
    
    psrg.start ();

  }

}
