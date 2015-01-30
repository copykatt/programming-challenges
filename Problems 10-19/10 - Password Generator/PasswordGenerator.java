import java.util.Random;

public class PasswordGenerator {
  int length;

  public PasswordGenerator (int length) {
    this.length = length;
  }
  
  public void start () {
    System.out.println(gen ());
  }

  public char[] gen () {
    Random rand = new Random ();
    int min = 33, max = 126;
    char[] ch = new char[length];

    for (int i=0; i<length; i++) {
      int n = rand.nextInt(max - min + 1) + min;
      ch[i] = (char) n;
    }
    return ch;
  }   
      
}

class PasswordGeneratorDemo {

  public static void main (String[] args) {
    long startTime = System.currentTimeMillis();
    int length;
    length = Integer.parseInt(args[0]);
    
    PasswordGenerator pwdgen = new PasswordGenerator (length);

    pwdgen.start ();
    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("Password generated in: " + totalTime + "ms.");
  }

}

/* SAMPLE OUTPUT 
 * $ java PasswordGeneratorDemo 10 
 * +p|U;{6hIO
 * Password generated in: 6ms.
 */
