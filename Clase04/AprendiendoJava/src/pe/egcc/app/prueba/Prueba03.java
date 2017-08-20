package pe.egcc.app.prueba;

import pe.egcc.app.model.Persona;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    int n1 = 56;
    int n2 = 56;
    
    if( n1 == n2 ){
      System.out.println("n1 y n2 son iguales");
    } else {
      System.out.println("n1 y n2 son diferentes");
    }
    
    
    Persona v1 = new Persona();
    Persona v2 = new Persona();
    Persona v3 = v1;
    
    if( v1 == v2 ){
      System.out.println("v1 y v2 son iguales");
    } else {
      System.out.println("v1 y v2 son diferentes");
    }
    
    if( v1 == v3 ){
      System.out.println("v1 y v3 son iguales");
    } else {
      System.out.println("v1 y v3 son diferentes");
    }
    
    System.out.println("v1.nombre: " + v1.getNombre());
    v1.setNombre("Claudia");
    System.out.println("v2.nombre: " + v2.getNombre());
    System.out.println("v3.nombre: " + v3.getNombre());
    
  }
  
  
}
