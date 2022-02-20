
public class Person {
  String name, address, emailAdd;
  int phoneNumber;
  
  public Person() { 
    
  }
  
  public void setName(String n) { 
    name = n;
  }
  
  public String getName() { 
    return name;
  }
  
  public void setAddress(String a) { 
    address = a;
  }
  
  public String getAddress() { 
    return address;
  }
  
  public void setPhoneNumber(int p) { 
    phoneNumber = p;
  }
  
  public int getPhoneNumber() { 
    return phoneNumber;
  }
  
  public void setEmailAdd(String e) { 
    emailAdd = e;
  }
  
  public String getemailAdd() { 
    return emailAdd;
  }
  
  public String toString() { 
    return "Person: " + name;
  }

}
