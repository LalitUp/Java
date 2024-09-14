/* Collection of objects is called class. It is a logical entity.

   A class can also be defined as a blueprint from which you can create an individual object. 
   Class doesn't consume any space.
   
*/

import javax.lang.model.element.Name;
import java.util.Scanner;

class Student {
   int id;
   String name;

   public static void main(String[] args){

      // create an object Student
      Student s1 = new Student();


      System.out.println(s1.id);
      System.out.println(s1.name);
   }
}