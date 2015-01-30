import java.math.BigInteger;

public class CalcAndPrintFactorial {
  BigInteger n = new BigInteger();

  public CalcAndPrintFactorial (BigInteger n) {
    this.n = n;
  }

  public void start () {
    System.out.println(fact (n));
  }

  public BigInteger fact (BigInteger n) {
    if (n == 0) return 1;
    else 
      return n * (fact(n - 1));
  }

}

class CalcAndPrintFactorialDemo {

  public static void main (String[] args) {
    long startTime = System.currentTimeMillis();
    int n;
    n = Integer.parseInt(args[0]);
    BigInteger bigint = new BigInteger(n); 

    CalcAndPrintFactorial calcapfact = new CalcAndPrintFactorial (BigInteger(valueOf(bigint)));
    
    calcapfact.start ();

    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("Calculated factorial of " + n + " in " + totalTime + "ms.");
  }

}

/* OUTPUT
 *
 *
 */
