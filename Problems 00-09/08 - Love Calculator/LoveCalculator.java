import java.util.Random;

public class LoveCalculator {
  String name1, name2;

  public LoveCalculator (String name1, String name2) {
    this.name1 = name1;
    this.name2 = name2;
  }
  
  public void start () {
    System.out.println("The results for " + name1 + " and " + name2 + " generated are: ");
    int n = calculate ();
    System.out.println(n + "%, " + analyze (n));
  }
  
  private int calculate () {
    Random rand = new Random ();
    int max = 100;
    int min = name1.length() - name2.length();
    int n = Math.abs(rand.nextInt(max - min + 1) + min);
    
    return n;
  }

  private String analyze (int n) {
    String msg = "";
    if (n >= 0 && n < 25) 
      msg += "NOPE. Sorry!";
    else if (n >= 25 && n < 50)
      msg += "This will be hard!";
    else if (n >= 50 && n < 75)
      msg += "This is not bad!";
    else 
      msg += "SUPERB!";
    return msg;
  }

}

class LoveCalculatorDemo {
  
  public static void main (String[] args) {
    String name1 = args[0];
    String name2 = args[1];
    
    LoveCalculator lovecalc = new LoveCalculator(name1, name2);

    lovecalc.start ();

  }

}
