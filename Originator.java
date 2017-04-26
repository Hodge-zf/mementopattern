public class Originator{

  private String state;
  private Caretaker caretaker;

  public void setState(String state){
    this.state = state;
  }

  public String getState(){
    return this.state;
  }

  public void save(){
    caretaker.add(new Memento(state));
  }

  public Momento getStateFromCareTaker(int x){
    return caretaker.get(x);
  }
