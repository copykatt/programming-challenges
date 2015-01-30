/* Sample Time Servers:
 * time-a.nist.gov, 
 * wolfnisttime.com,
 * wwwv.nist.gov
 */

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

public class AtomClock {
  String TIME_SERVER;

  public AtomClock (String TIME_SERVER) {
    this.TIME_SERVER = TIME_SERVER; 
  }
  
  public void start () {
    getRemoteSystemTime (); 
  }

  private void  getRemoteSystemTime () {
    try {
    NTPUDPClient client = new NTPUDPClient ();
    InetAddress inetAddress = InetAddress.getByName (this.TIME_SERVER);
    TimeInfo tinfo = client.getTime (inetAddress);
    long returnTime = tinfo.getMessage().getTransmitTimeStamp().getTime();
    Date time = new Date (returnTime);
    
    System.out.println("Time: " + time);
    } catch (IOException e) {
      e.printStackTrace(); 
    }
  }

}

class AtomClockDemo {

  public static void main (String[] args) {
    String TIME_SERVER;
    TIME_SERVER = args[0];

    AtomClock ac = new AtomClock (TIME_SERVER);

    ac.start ();
    
  }

}
