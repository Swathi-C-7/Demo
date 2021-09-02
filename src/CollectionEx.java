import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Student {
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
   Student(String n, int a, int i){ 
      name = n; 
      age = a; 
      id = i; 
   } 
   @Override public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+             
              " Age: "+ this.getAge() +                     
              " Id: "+ this.getId()+"]"); 
   }

}
public class CollectionEx {
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Swathi", 21, 1000)); 
      studentlist.add(new Student("tk", 22, 2000)); 
      studentlist.add(new Student("srivi", 10, 3000)); 
      studentlist.add(new Student("keerthu", 17, 4000)); 
   

   Stream s= studentlist.stream();
   List l1=(List) s.filter((o)->((Student)o).age>18).collect(Collectors.toList());
   System.out.println(l1);
}
}
