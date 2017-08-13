package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    int n1 = 10;
    int n2 = 18;
    int n3 = 17;
    int n4 = 16;
    int n5 = 18;
    
    // Proceso
    MateService service = new MateService();
    int pr2 = service.promediar(n1, n2);
    int pr3 = service.promediar(n1, n2, n3);
    int pr4 = service.promediar(n1, n2, n3, n4);
    int pr5 = service.promediar(n1, n2, n3, n4, n5);
    
    // Reporte
    System.out.println("PR2: " + pr2);
    System.out.println("PR3: " + pr3);
    System.out.println("PR4: " + pr4);
    System.out.println("PR5: " + pr5);
    
  }
  
}
