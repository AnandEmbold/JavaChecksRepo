
class Base implements Clonable {
    int i;
    
    @Override Object clone() throws CloneNotSupportedException {
      Base myClone = new Base();
      myClone = i = this.i;
      return myClone;
    }
}
