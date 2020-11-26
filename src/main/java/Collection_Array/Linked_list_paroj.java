package Collection_Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Linked_list_paroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList abc=new ArrayList();//non generics array
		abc.add("sanjay");
		abc.add(5);
		abc.add('A');
		abc.add("test");
		System.out.println(abc.get(3));
		for (int i = 0; i <abc.size(); i++) {
			System.out.println(abc.get(i));
		}
	
      ArrayList<String> xyz=new ArrayList<String>();//declaring generics
      xyz.add("jay");
      xyz.add("mike");
      xyz.add("sanjay");
      
      ArrayList<Integer> xyz1=new ArrayList<Integer>();//declaring generics
      xyz1.add(23);
      xyz1.add(27);
      xyz1.add(39);
      

      ArrayList<String> xyz2=new ArrayList<String>();//declaring generics
      xyz2.add("jay");
      xyz2.add("mike");
      xyz2.add("tom");
      
//      xyz.addAll(xyz2);
//      for (int i = 0; i < xyz.size(); i++) {
//    	  System.out.println(xyz.get(i));
//		
//	}
//      System.out.println("================");
//      xyz.removeAll(xyz2);
//      for (int i = 0; i < xyz.size(); i++) {
//    	  System.out.println(xyz.get(i));
//      }
      xyz1.add(23);
      xyz1.add(27);
      xyz1.add(39);   
      
//      xyz.addAll(xyz2);
//      for (int i = 0; i < xyz.size(); i++) {
//    	  System.out.println(xyz.get(i));
//		
//	}
//      System.out.println("================");
//      xyz.removeAll(xyz2);
//      for (int i = 0; i < xyz.size(); i++) {
//    	  System.out.println(xyz.get(i));
//      }
      
      System.out.println("================");
      xyz.retainAll(xyz2);
      for (int i = 0; i < xyz.size(); i++) {
    	  System.out.println(xyz.get(i));
    	  System.out.println("***********");
      } 
//      //making class objects of employee
      Add_Employee e1=new Add_Employee("sanjay",39,"2020");
      Add_Employee e2=new Add_Employee("jyoti",21,"cvs");
      Add_Employee e3=new Add_Employee("sunita",21,"job_hunt");
      
      ArrayList<Add_Employee> array=new ArrayList<Add_Employee>();
      array.add(e1);
      array.add(e2);
      array.add(e3);
    Iterator<Add_Employee> it=array.iterator();
      while (it.hasNext()) {
   Add_Employee emp= it.next();
   System.out.println(emp.name);
   System.out.println(emp.age);
   System.out.println(emp.dept);		
		}
    


	}

}
