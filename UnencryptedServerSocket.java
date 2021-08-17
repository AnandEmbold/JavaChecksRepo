import java.io.IOException;
import java.net.ServerSocket;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

class UnencryptedServerSocket {
    public void someCheck() throws IOException {
		ServerSocket soc = new ServerSocket(1234);
		ServerSocket soc1 = new ServerSocket(80);
		ServerSocket soc2 = new ServerSocket(443);
		ServerSocket soc3 = new ServerSocket(8443);
		
		ServerSocket soc4 = SSLServerSocketFactory.getDefault().createServerSocket(1234);
		ServerSocket soc5 = SSLServerSocketFactory.getDefault().createServerSocket(80);
		ServerSocket soc6 = SSLServerSocketFactory.getDefault().createServerSocket(443);
		ServerSocket soc7 = SSLServerSocketFactory.getDefault().createServerSocket(8443);
		
		ServerSocket soc8 = ServerSocketFactory.getDefault().createServerSocket(1234);
		ServerSocket soc9 = ServerSocketFactory.getDefault().createServerSocket(80);
		ServerSocket soc10 = ServerSocketFactory.getDefault().createServerSocket(443);
		ServerSocket soc11 = ServerSocketFactory.getDefault().createServerSocket(8443);
	}
}
