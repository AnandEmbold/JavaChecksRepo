
public class CloneSuperBase extends CloneSuperSuperBase implements Cloneable {
    int i;
    
    @Override 
    public CloneSuperBase clone() throws CloneNotSupportedException {
    	return (CloneSuperBase) super.clone();
    }
}