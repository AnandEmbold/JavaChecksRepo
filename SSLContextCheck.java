
class SSLContextCheck {
    public void someCheck(SSLContext someSSLCont) {
		SSLContext one = SSLContext.getInstance("SSL");
		SSLContext two = SSLContext.getInstance("SSLv2");
		SSLContext three = SSLContext.getInstance("SSLv3");
		SSLContext four = SSLContext.getInstance("TLS");
		SSLContext five = SSLContext.getInstance("TLSv1");
		SSLContext six = SSLContext.getInstance("TLSv1.1");
		SSLContext seven = SSLContext.getInstance("TLSv1.2");
		
		SSLContext init = new SSLContect(null, null);
		one = init.getInstance("SSL");
		two = init.getInstance("SSLv2");
		three = init.getInstance("SSLv3");
		four = init.getInstance("TLS");
		five = init.getInstance("TLSv1");
		six = init.getInstance("TLSv1.1");
		seven = init.getInstance("TLSv1.2");
		
		
		one = someSSLCont.getInstance("SSL");
		two = someSSLCont.getInstance("SSLv2");
		three = someSSLCont.getInstance("SSLv3");
		four = someSSLCont.getInstance("TLS");
		five = someSSLCont.getInstance("TLSv1");
		six = someSSLCont.getInstance("TLSv1.1");
		seven = someSSLCont.getInstance("TLSv1.2");
		
	}
}
