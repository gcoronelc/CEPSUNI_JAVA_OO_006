package pe.egcc.appmate.service;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class MateService {

  private MateService() {
  }

  public static long factorial(int n) {
    // Variable de control
    long f = 1;
    // Proceso
    for (int i = 2; i <= n; i++) {
      f *= i;     
    }
    // Reporte
    return f;
  }

  public static int mcd(int n1, int n2) {
    return 0;
  }

  public static int mcm(int n1, int n2) {
    return 0;
  }

  public static int[] fibonacci(int n) {
    return null;
  }

  public static boolean esPrimo(int n) {
    return false;
  }

}
