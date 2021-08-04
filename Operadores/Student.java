/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author j.benitez.prudente
 */
public class Student {
    int id;

  Student(int id) {

     this.id = id;

  }
@Override

  public boolean equals(Object obj) {
      if(obj == this)//si el objeto es igual al mismo 
      {
        return true;
      }
    if(obj instanceof Student)    
    {
        Student c = (Student) obj;
        return Integer.compare(this.id, c.id) == 0;
     }
    else
    {
     return false;
    
    }
  }
}
