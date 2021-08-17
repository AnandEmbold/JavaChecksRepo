
class CloneSuper implements Clonable {
    int i;
    
    @Override 
    public CloneSuper clone() throws CloneNotSupportedException {
      Base myClone = new Base();
      myClone.i = this.i;
      return myClone;
    }
}
