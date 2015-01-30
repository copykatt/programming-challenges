public class CountWordsInString {
  String sentence; 

  public CountWordsInString (String sentence) {
    this.sentence = sentence;   
  }
  
  public void start () {
    System.out.println(count()); 
  }
  
  public int count () {
    int sum = 1; // because at least one arg as input
    for (int i=0; i<sentence.length(); i++) {
      if (sentence.charAt(i) == ' ') 
        sum += 1;
    }
    return sum;
  }

}

class CountWordsInStringDemo {

  public static void main (String[] args) {
    String sentence = args[0];
    
    CountWordsInString countwords = new CountWordsInString (sentence);
    
    countwords.start ();
  }

}
