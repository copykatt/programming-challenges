public class FizzBuzz {

  public FizzBuzz () {}
  
  public void start () {
    final int MAX = 100;
    
    for (int i=1; i<MAX; i++) 
      if (i%3 == 0) 
        if (i%5 == 0) 
          System.out.println(i + ": FizzBuzz!");
        else
          System.out.println(i + ": Fizz!");
      else if (i%5 == 0) 
        System.out.println(i + ": Buzz!");
      else 
        System.out.println(i);
  }
}

class FizzBuzzDemo {
  public static void main (String[] args) {
    FizzBuzz fizzbuzz = new FizzBuzz ();

    fizzbuzz.start ();
  }
}
