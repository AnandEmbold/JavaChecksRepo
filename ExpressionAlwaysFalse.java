
class ExpressionAlwaysFalse {
    public void someCheck(boolean b) {
		if(b == true) 
			int i=0;
		
		boolean b2 = false;
		if(b2)
			int i=0;
		if(b2!=true)
			int i=0;
		if(!b2)
			int i=0;
		
		boolean b3 = true;
		if(!b3)
			int i=0;
		if(b3!=true)
			int i=0;
		if(b3)
			int i =0;
		
		b3 = false;
		if(!b3)
			int i=0;
		if(b3!=true)
			int i=0;
		if(b3)
			int i =0;
		
		Boolean b4= true;
		if(b4)
			int i=0;
		if(b4!=true)
			int i=0;
		if(!b4)
			int i=0;
		
		Boolean b5 = true;
		if(!b5)
			int i=0;
		if(b5!=true)
			int i=0;
		if(b5)
			int i =0;
		
		Boolean b6 = null;
		if(!b6)
			int i=0;
		if(b6!=true)
			int i=0;
		if(b6)
			int i =0;
		
	}
}
