
class ArrayLimit {
    public void someCheck(String []someArr, int inputData, char inputData2) {
		int data = 1;
		char data2 = 1;
		String[] myArr = new String[3];
		
		if(data<=sommeArr.length) {
			String t = someArr[data];
		}
	    
	        //** Start ** Should not get ISsues
	        if(data<=sommeArr.length && data >=0 ) {
			String t = someArr[data];
		}	       
	        if(data<=sommeArr.length && data >0 ) {
			String t = someArr[data];
		}
	        if(data>=0 && data<=sommeArr.length) {
			String t = someArr[data];
		}	       
	        if(data >0 && data<=sommeArr.length) {
			String t = someArr[data];
		}
	        //**End**  Should not get ISsues
		
		if(data<=myArr.length) {
			String t = myArr[data];
		}
		
		if(data2<=sommeArr.length) {
			String t = someArr[data2];
		}
		
		if(data2<=myArr.length) {
			String t = myArr[data2];
		}
		
		if(inputData<=sommeArr.length) {
			String t = someArr[inputData];
		}
		
		if(inputData<=myArr.length) {
			String t = myArr[inputData];
		}
		
		if(inputData2<=sommeArr.length) {
			String t = someArr[inputData2];
		}
		
		if(inputData2<=myArr.length) {
			String t = myArr[inputData2];
		}
	}
}
