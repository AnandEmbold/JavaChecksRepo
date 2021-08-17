
class CloneDerived  extends CloneSuper implements Cloneable {
    int j;
    
    @Override
	public CloneDerived clone() throws CloneNotSupportedException {
      CloneDerived myDerClone = (CloneDerived)super.clone();
      myDerClone.j = this.j;
      return myDerClone;
    }
}
