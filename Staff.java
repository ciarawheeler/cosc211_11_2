
public class Staff extends Employee {
  String title;
  
  public Staff() { 
    
  }
  
  public void setTitle(String t) { 
    title = t;
  }
  
  public String getTitle() { 
    return title;
  }
  
  public String toString() { 
    return "Staff: " + getName();
  }

}
