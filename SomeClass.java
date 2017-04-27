public class SomeClass{
  public static void main(String[] args){

   Originator originator = new Originator();

   originator.setState("State");
   originator.save();
   System.out.println(originator.getState());
   originator.setState("State1");
   originator.save();
   System.out.println(originator.getStateFromCareTaker(1));
   originator.setState("State2");
   originator.save();
   System.out.println(originator.getStateFromCareTaker(2));

  }
}
