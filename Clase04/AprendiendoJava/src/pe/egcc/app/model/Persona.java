package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Persona {

  private String nombre;

  public Persona() {
    this.nombre = "Karla";
  }
  
  
  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
}
