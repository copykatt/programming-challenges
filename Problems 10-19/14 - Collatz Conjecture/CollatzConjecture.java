public class CollatzConjecture {
  int n;

  public CollatzConjecture (int n) {
    this.n = n;
  }
  
  public void start () {
    calculate(this.n); 
  }

  public void calculate (int n) {
    System.out.println("n: " + n);
    if (n == 1) return;
    else if (n%2 == 0) 
      calculate (n / 2);
    else if (n%2 == 1) 
      calculate(3*n + 1);
    }
}

class CollatzConjectureDemo {
  
  public static void main (String[] args) {
    int n;
    n = Integer.parseInt(args[0]);

    CollatzConjecture collatz = new CollatzConjecture(n);

    collatz.start ();
  }

}
