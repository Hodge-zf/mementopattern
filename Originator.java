public class Originator{

  private State state;
  private Caretaker caretaker;
  private String msg;

  public Originator(){
   this.state = state;
   this.caretaker = new Caretaker();
  }

  public void setState(State state,String msg){
    this.state = state;
    this.msg = msg;
  }

  public State getState(){
    return this.state;
  }

//broken
  public void save(){
    Message message;
    if(State.DEBUG == this.message)
      message = new DebugMessage(message);
    caretaker.add(message);
  }

  public Message getStateFromCareTaker(int x){
    return caretaker.get(x);
  }
}
