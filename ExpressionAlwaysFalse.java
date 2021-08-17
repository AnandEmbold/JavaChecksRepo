class ExpressionAlwaysFalse {
    public void someCheck(boolean b) {
		int  i = -1;
		if(b == true) {
			i=0;
		}
		
		boolean b2 = false;
		if(b2) {
			i=0;
		}
		if(b2!=true){
			i=0;
		}
		if(!b2){
			i=0;
		}
		
		boolean b3 = true;
		if(!b3){
			i=0;
		}
		if(b3!=true){
			i=0;
		}
		if(b3){
			i =0;
		}
		
		b3 = false;
		if(!b3){
			i=0;
		}
		if(b3!=true){
			i=0;
		}
		if(b3){
			i =0;
		}
		
		Boolean b4= true;
		if(b4){
			i=0;
		}
		if(b4!=true){
			i=0;
		}
		if(!b4){
			i=0;
		}
		
		Boolean b5 = true;
		if(!b5){
			i=0;
		}
		if(b5!=true){
			i=0;
		}
		if(b5){
			i =0;
		}
		
		Boolean b6 = null;
		if(!b6){
			i=0;
		}
		if(b6!=true){
			i=0;
		}
		if(b6){
			i =0;
		}
		
	}
}