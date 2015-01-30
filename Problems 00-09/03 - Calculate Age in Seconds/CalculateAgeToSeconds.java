/**
 * Takes a number of type float as input assuming it stands for 
 * years, converts it to seconds and prints the value of type double
 * @author copykatt
 */
public class CalculateAgeToSeconds {
  final float age;
  
  /**
   * @param age The age value.
   */
  CalculateAgeToSeconds (float age) {
    this.age = age;
  }
  
  /**
   * The method uses the age value and converts
   * it so seconds. 
   * @return convert The age value converted to seconds. 
   */
  public double convertAgeToSeconds () {
    float blob = 365*24*60*60;
    double convert = this.age * blob;
    
    return convert;
  }
}

class CalculateAgeToSecondsDemo {
  public static void main (String[] args) {
    float age;
    age = Float.parseFloat(args[0]);
    
    CalculateAgeToSeconds calcats = new CalculateAgeToSeconds(age);
    System.out.println("Your age " + age + " in seconds is: ");
    System.out.println(calcats.convertAgeToSeconds() + "s");
  }
}
