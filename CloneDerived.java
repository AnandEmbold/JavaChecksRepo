
class CloneDerived  extends CloneBase implements Clonable {
    int j;
    
    @Override 
    CloneDerived clone() throws CloneNotSupportedException {
      CloneDerived myDerClone = (CloneDerived)super.clone();
      myDerClone.j = this.j;
      return myDerClone;
    }
}
