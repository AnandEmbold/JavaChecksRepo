
public class CloneSuperSuperBase extends CloneSuperSuperSuperBase implements Cloneable {
    int i;
    
    @Override 
    public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
}
