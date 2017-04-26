public class SomeClass{
  public static void main(String[] args){
   
   Originator originator = new Originator();
   
   originator.save();
   System.out.println(originator.getState(0));
   originator.setState("State1");
   originator.save();
   System.out.println(originator.getStateFromCaretaker(1));
   originator.setState("State2");
   originator.save();
   System.out.println(originator.getStateFromCaretaker(2));
   
  }
}
