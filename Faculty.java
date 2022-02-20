
public class Faculty extends Employee {
  String officeHours, rank;
  
  public Faculty() { 
    
  }
  
  public void setOfficeHours(String o) { 
    officeHours = o;
  }
  
  public String getOfficeHours() { 
    return officeHours;
  }
  
  public void setRank(String r) { 
    rank = r;
  }
  
  public String getRank() { 
    return rank;
  }
  
  public String toString() { 
    return "Faculty: " + getName();
  }
  

}
