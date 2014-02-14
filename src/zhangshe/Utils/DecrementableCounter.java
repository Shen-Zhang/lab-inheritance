package zhangshe.Utils;

public class DecrementableCounter
    extends
      Counter
{
  public DecrementableCounter(int start)
  {
    super(start);
    System.err.println("DecrementableCounter(\"" + start + "\")");
  } // DecrementableCounter(int)
  
  public void decrement()
  {
    this.count--;
  }
} // class DecrementableCounter