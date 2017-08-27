package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Clase2 extends Clase1{

  public Clase2() {
    super("Gustavo Coronel");
  }

  @Override
  public int sumar(int n1, int n2) {
    int s;
    s = ( n1 + n2) * (n1 - n2);
    return s;
  }

  public void showMessage(String message){
    System.out.println(message);
  }
  
}
