
class ThrowMissingInCatch {
    public void someCheck1() {
		try {
			throwMe();
		} catch(Exception e) {
			System.out.println("Some err");
		}
	}
	
	public void someCheck2() {
		try {
			throwMe();
		} catch(Exception e) {
			System.out.println("Some err");
			Exception newE = new Exception(e);
		}
	}
	
	public void throwMe() throws Exception{
		throw new Exception("rr");
	}
	
	public void someCheck3() throws Exception {
		try {
			throwMe();
		} catch(Exception e) {
			System.out.println("Some err");
			Exception newE = new Exception(e);
			throw newE;
		}
	}
	
	public void someCheck5() throws Exception {
		try {
			throwMe();
		} catch(Exception e) {
			throw e;
		}
	}
}
