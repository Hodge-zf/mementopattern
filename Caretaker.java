import java.util.*;

public class Caretaker{


  private ArrayList<Message> events;

  protected Caretaker(){
    this.events =  new ArrayList<>();
  }

  protected void add(Message state){
    events.add(state);
  }

  protected Message get(int x){
    return events.get(x);
  }
}
