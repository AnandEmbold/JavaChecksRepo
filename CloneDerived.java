
class CloneDerived  extends CloneBase {
    int j;
    
    @Override Object clone() throws CloneNotSupportedException {
      CloneDerived myDerClone = (CloneDerived)super.clone();
      myDerClone.j = this.j;
      return myDerClone;
    }
}
