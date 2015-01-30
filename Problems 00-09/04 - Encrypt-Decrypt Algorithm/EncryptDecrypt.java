/**
 * Take a string and encrypt/decrypt it in ascii range using a shift. 
 * Shift is number of type int and can be negative to decrypt a String
 * @author copykatt
 */
public class EncryptDecrypt { 
  int shift;
  String str;
  
  /**
   * @param shift The shift used on the characters of the String 
   * @param str The String to be encrypted/decrypted.
   */
  public EncryptDecrypt (int shift, String str) {
    this.shift = shift;
    this.str = str;
  }
  
  /**
   * The method breaks the String down to its characters, shifts them 
   * and saves the shifted values in another char String.
   * @return shifted The char String including the new shifted characters
   */
  public char[] getString () {
    char[] breakup = this.str.toCharArray();
    String gen = "";

    for (char c: breakup) 
      gen += (char) (c + this.shift);
    char[] shifted = gen.toCharArray();
    return shifted;
  }

}

class EncryptDecryptDemo {
  
  public static void main (String[] args) {
    int shift;
    String str; 

    shift = Integer.parseInt(args[0]); 
    str = args[1];
  
    EncryptDecrypt encdec = new EncryptDecrypt(shift, str);
    
    System.out.println(encdec.getString());
  }

}
