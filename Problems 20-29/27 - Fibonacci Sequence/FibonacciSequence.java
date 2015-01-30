public class FibonacciSequence {
  int n;

  public FibonacciSequence (int n) {
    this.n = n; 
  }
  
  public void start () {
    System.out.println(fibonacci (this.n));
  }

  public int fibonacci (int n) {
    if (n == 0) return 0;
    else if (n == 1) return 1;
    else return fibonacci (n - 1) + fibonacci (n - 2);
  }

}

class FibonacciSequenceDemo {

  public static void main (String[] args) {
    long startTime = System.currentTimeMillis();
    int n;
    n = Integer.parseInt(args[0]);
    
    FibonacciSequence fibsq = new FibonacciSequence (n);
  
    fibsq.start ();

    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("Runtime: " + totalTime + "ms");
  }

}
