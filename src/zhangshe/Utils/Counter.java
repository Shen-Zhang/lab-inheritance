package zhangshe.Utils;

public class Counter
{

  
  int count;
  int start;
  
  public Counter(int value)
  {
    System.err.println("Counter(\"" + value + "\")");
    this.count = value;
    this.start = value;
    
  } // Counter(int)
  
  public void increment() throws Exception
  {
    this.count += 1;
  }
  
  public void reset()
  {
    this.count = this.start;
  }
  
  public String toString()
  {
    return "[" + this.count + "]";
  }

  public int value()
  {
    return this.count;
  }
  
}
