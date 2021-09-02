

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
class Customer {
   String name; 
   int age; 
   int id; 
   public String getName() {
      return name; 
   } 
   public int getAge() { 
      return age; 
   } 
   public int getId() { 
      return id; 
   } 
    Customer(String n, int a, int i){ 
     name = n; 
     age = a; 
     id = i; 
   } 
   @Override public String toString() {     
      return ("Customer[ "+"Name:"+this.getName()+             
              " Age: "+  this.getAge()+                 
              " Id: "+ this.getId()+"]"); 
   }
}
public class LambdaEX {
   public static void main(String[] args) {
      TreeSet<Customer> cust = new TreeSet<Customer>((Customer o1,Customer o2)->{
    	  if(o1.name.compareTo(o2.name)<0) return 1;
    	  else if(o1.name.compareTo(o2.name)>0) return -1;
    	  else return 0;
    	  
      });
      System.out.println("After Sorting the student data in descending order by Name:"); 
      cust.add(new Customer("Swathi C", 21, 1000)); 
      cust.add(new Customer("tk", 22, 2000)); 
      cust.add(new Customer("Keerthu", 23, 3000)); 
      cust.add(new Customer("Srivi", 17, 4000)); 
      System.out.println(cust);

      
   }
}