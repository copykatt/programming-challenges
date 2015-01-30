import java.util.Random;

interface Talkable {
  String speak (); 
}

public class MagicEightBall implements Talkable {
  String question; 
 
  // Sentences taken from wikipedia.org/wiki/Magic_8-Ball
  final String[] answers = {
    "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"
  };

  public MagicEightBall (String question) {
    this.question = question; 
  }
  
  public void start () {
    System.out.println("The Magic 8-Ball says....");
    System.out.println(speak ());
  }
   
  @Override
  public String speak () {
    Random rand = new Random ();
    String sentence = answers[rand.nextInt(answers.length)];
    
    return sentence;
  }

}

class MagicEightBallDemo {

  public static void main (String[] args) {
    String question;
    question = args[0];

    MagicEightBall meb = new MagicEightBall (question);

    meb.start ();

  }

}
