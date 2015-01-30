public class TemperatureConverter {
  float val;
  String tt1, tt2;

  public TemperatureConverter (float val, String tt1, String tt2) {
    this.val = val;
    this.tt1 = tt1;
    this.tt2 = tt2;
  }
  
  public void start () {
    if (tt1.equalsIgnoreCase("Celsius") && tt2.equalsIgnoreCase("Fahrenheit"))
      System.out.println("Converted value: " + celsiusToFahrenheit(val));
    else if (tt1.equalsIgnoreCase("Fahrenheit") && tt2.equalsIgnoreCase("Celsius"))
      System.out.println(fahrenheitToCelsius(val));
 
 }

  public float celsiusToFahrenheit (float value) {
    float result = value*(1.8f) + 32;
    return result;
  }

  public float fahrenheitToCelsius (float value) {
    float result = (value - 32)*0.555f;
    return result;
  }
  
}

class TemperatureConverterDemo {

  public static void main (String[] args) {
    float val;
    val = Float.parseFloat(args[0]);
    String tt1 = args[1], tt2 = args[2];
    
    TemperatureConverter tempconverter = new TemperatureConverter (val, tt1, tt2);
    
    tempconverter.start ();
  }

}
