public class SomeClass{
  public static void main(String[] args){

   Originator originator = new Originator();

   originator.setState(State.DEBUG,"DebugMessage");
   originator.save();
   System.out.println(originator.getState());
  }
}
