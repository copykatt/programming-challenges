public class DecimalBinaryConverter {
  int num;

  public DecimalBinaryConverter (int num) {
    this.num = num;
  }

  public void start () {
    System.out.println(convert());
  }

  public int convert () {
    int sum = 0;
    int length = Integer.toString(num).length(); 
    int n = 0; 
    String substr = "";
    
    for (int i=0; i<length; i++) {
          
    }
    /*for (int i=length; i>0; i--)  {
      substr = Integer.toString(num).substring(0,length+1-i);
      n = Integer.parseInt(substr) % 2;
      //sum += n*(10^j);
      //sum = Integer.parseInt(substr * 
      //num = Integer.parseInt(substr) % 10;
      System.out.println(substr);
      System.out.println("num: " + n);
    }*/
    return sum;    
  }

}

class DecimalBinaryConverterDemo {

  public static void main (String[] args) {
    int num;
    num = Integer.parseInt(args[0]);

    DecimalBinaryConverter decbin = new DecimalBinaryConverter (num);

    decbin.start ();
  }

}
