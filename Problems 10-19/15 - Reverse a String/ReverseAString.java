public class ReverseAString {
  String word;

  public ReverseAString (String word) {
    this.word = word;
  }
  
  public void start () {
    System.out.println(reverse());
  }

  public char[] reverse () {
    int ptr = word.length()-1;
    char[] wc = word.toCharArray();
    char tmp = ' ';
    char tmp1 = ' ';

    for (int i=0; i<word.length()/2; i++) {
      tmp = wc[i];  
      wc[i] = wc[ptr];
      wc[ptr] = tmp; 
      ptr--;
    } 
    return wc;
  }

}

class ReverseAStringDemo {

  public static void main (String[] args) {
    String word = args[0];
    
    ReverseAString reverse = new ReverseAString(word);

    reverse.start ();
  }

}
