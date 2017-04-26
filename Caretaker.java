import java.util.*;

public class Caretaker{


  private ArrayList<Memento> events;

  protected Caretaker();

  protected void add(Memento memento){
    events.add(memento);
  }

  protected Memento get(int x){
    return events.get(x);
  }
}
