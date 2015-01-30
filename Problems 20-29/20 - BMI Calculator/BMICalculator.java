public class BMICalculator {
  float mass, height; 
  
  /**
   * 
   * @param mass The mass of the body [kg].
   * @param height The height of the body [m].
   */
  public BMICalculator (float mass, float height) {
    this.mass = mass;
    this.height = height;
  }
  
  public void start () {
    float get = getBMI();
    System.out.println("The BMI is: " + get);
    String str = getHealthCategory(get);
    System.out.println("The according health category: " + str);
  }
    
  /** 
   * Calculates the BMI.
   * @return bmi The calculated BMI.
   */
  public float getBMI () {
    float bmi = mass/(height*height);
    return bmi;
  }
  
  /**
   * Analyzes the BMI and tells the medical situation 
   * (category description taken from wikipedia).
   * @return category The category according to the calculated BMI.
   */
  public String getHealthCategory (float get) {
    float bmistart = 15.0f; 
    float[] diff = { 0.0f, 1.0f, 2.5f, 6.5f, 5.0f, 5.0f, 5.0f };
    final String[] categories = {
      "Very severely underweight",
      "Severely underweight",
      "Underweight",
      "Normal (healthy weight)",
      "Overweight",
      "Obese Class I (Moderately obese)",
      "Obese Class II (Severely obese)",
      "Obese Class III (Very severely obese)",
    }; 
    
    float sum = 0.0f;
    float[] bmis = new float[diff.length];
    for (int i=0; i<diff.length; i++) {
      if (i == 0) {
        sum = bmistart + diff[0];
        bmis[0] = sum;
      }
      else {
        sum += diff[i];
        bmis[i] = sum;
      }
    }
    
    String output = "";
    for (int i=0; i<bmis.length; i++)
      for (int j=0; j<categories.length; j++)
        if (get < bmis[0]) 
          output = categories[0];
        else if (get > bmis[6])
          output = categories[7];
        else if (bmis[i] < get && get < bmis[i+1]) 
          output = categories[i+1];
    return output;
  }
}

class BMICalculatorDemo {

  public static void main (String[] args) {
    float mass, height;
    mass = Float.parseFloat(args[0]); 
    height = Float.parseFloat(args[1]);
    
    BMICalculator bmicalc = new BMICalculator (mass, height);
    bmicalc.start (); 
  }

}
