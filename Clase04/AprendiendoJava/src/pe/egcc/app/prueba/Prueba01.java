package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  private int num = 20;

  public int getNum() {
    return num;
  }
  
  public static void main(String[] args) {
    int nota = 60;
    Prueba01 o = new Prueba01();
    System.out.println( o.getNum() );
    System.out.println(nota);
       
  }
  
}
