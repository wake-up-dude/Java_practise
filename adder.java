class tools{
  static int adder(int number){
    return ++number;
  }
}

public class main{
  public static void main(String args[]){
    tools t = new tools();
    System.out.println(t.adder(10));
  }
}
