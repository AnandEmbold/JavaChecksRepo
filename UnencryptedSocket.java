import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

class UnencryptedSocket {
    public void someCheck() throws UnknownHostException, IOException {
		Socket soc = new Socket("www.google.com",80);
		
		Socket soc1 = new Socket("www.google.com",443);
		Socket soc2 = new Socket("www.google.com",8443);
		
		Socket soc3 = SSLSocketFactory.getDefault().createSocket("www.google.com", 80);
		Socket soc4 = SSLSocketFactory.getDefault().createSocket("www.google.com", 443);
		Socket soc5 = SSLSocketFactory.getDefault().createSocket("www.google.com", 8443);
		
		Socket soc6 = SocketFactory.getDefault().createSocket("www.google.com", 80);
		Socket soc7 = SocketFactory.getDefault().createSocket("www.google.com", 443);
		Socket soc8 = SocketFactory.getDefault().createSocket("www.google.com", 8443);
	}
}
