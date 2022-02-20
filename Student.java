
public class Student extends Person {
  String STATUS;
  
  public Student() { 
    
  }
  
  public void setSTATUS(String s) { 
    STATUS = s;
  }
  
  public String getSTATUS() { 
    return STATUS;
  }
  
  public String toString() { 
    return "Student: " + getName();
  }
  
  
}
