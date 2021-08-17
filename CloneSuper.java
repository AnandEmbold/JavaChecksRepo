
class CloneSuper extends CloneSuperBase implements Cloneable {
    int i;
    
    @Override 
    public CloneSuper clone() throws CloneNotSupportedException {
    	CloneSuper myClone = new CloneSuper();
      myClone.i = this.i;
      return myClone;
    }
}
