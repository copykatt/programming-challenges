import java.math.BigInteger;

public class CalcAndPrintFactorial {
  BigInteger n;

  public CalcAndPrintFactorial (BigInteger n) {
    this.n = n;
  }

  public void start () {
    long startTime = System.currentTimeMillis();

    System.out.println(fact (n));

    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;

    System.out.println("Fact. of " + n + "\nRuntime " + totalTime + "ms.");
  }

  public BigInteger fact (BigInteger n) {
    if (n.equals(BigInteger.ONE)) return BigInteger.ONE;
    else 
      return n.multiply(fact(n.subtract(BigInteger.ONE)));
  }

}

class CalcAndPrintFactorialDemo {

  public static void main (String[] args) {
        BigInteger biggy = new BigInteger (args[0]);

    CalcAndPrintFactorial calcapfact = new CalcAndPrintFactorial (biggy);
    
    calcapfact.start ();

  }

}

/* OUTPUT
 * ╰─± java CalcAndPrintFactorialDemo 100
 *  93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
 *  Fact. of 100
 *  Runtime: 8ms.
 *
 */
