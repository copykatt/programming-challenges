import java.util.Random;

/** 
 * Generate a random word with length given through command line 
 * argument. The generation involves taking a random int and mapping
 * it to its according character value.
 * @author copykatt
 */
public class WordGenerator {
  int length;
  
  public WordGenerator () {}
  public WordGenerator (int length) {
    this.length = length;
  }
      
  /**
   * The method maps length numbers of type int to characters
   * and concatenates the characters to a string. 
   * @param min The lower limit of the range. 
   * @param max The upper limit of the range.
   * @return name The word generated.
   */
  public String generate (int min, int max) {
    int n = 0; 
    String word = "";
    Random rand = new Random ();

    for (int i=0; i<length; i++) {
      n = rand.nextInt(max - min + 1) + min;
      word += (char) n; 
    } 
    return word;
  }

}

class WordGeneratorDemo {

  public static void main (String[] args) { 
    int length, min, max;
    try { 
      length = Integer.parseInt(args[0]);

      WordGenerator wordgen = new WordGenerator (length);

      min = 97; max = 122;
      System.out.println(wordgen.generate (min, max));
    } catch (ArrayIndexOutOfBoundsException aoe) {
      System.err.println("Give length of word to be generated.");
    }
    
  }
}
