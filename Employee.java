
public class Employee extends Person {
  String office, dateHired;
  double salary;
  
  public Employee() { 
    
  }
  
  public void setOffice(String o) { 
    office = o;
  }
  
  public String getOffice() { 
    return office;
  }
  
  public void setDateHired(String d) { 
    dateHired = d;
  }
  
  public String getDateHired() { 
    return dateHired;
  }
  
  public void setSalary(double s) { 
    salary = s;
  }
  
  public double getSalary() { 
    return salary;
  }
  
  public String toString() { 
    return "Employee: " + getName();
  }
  
}
