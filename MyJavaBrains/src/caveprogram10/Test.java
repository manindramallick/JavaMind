package caveprogram10;

import java.util.HashMap;
import java.util.Map;

public class Test {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  StudentGet obj = new StudentGet("ABC");
  Map<StudentGet, String> hm = new HashMap<>();
  hm.put(obj, "iabc");
  System.out.println(hm.get(obj));
  
  obj.setName("ixyz");
  System.out.println(hm.get(obj));

 }

}


class StudentGet
{
 String name;
 StudentGet(String name)
 {
  this.name=name;
 }
 void setName(String a)
 {
  name=a;
 }
/* @Override
 public int hashCode() {
  // TODO Auto-generated method stub
   return name.hashCode();
 }*/
}