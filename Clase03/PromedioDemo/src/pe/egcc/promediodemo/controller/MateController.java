package pe.egcc.promediodemo.controller;

import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class MateController {

  private MateService service;

  public MateController() {
    service = new MateService();
  }
  
  public int promediar(int n1, int n2) { 
    return service.promediar(n1, n2);
  }

  
  
  
}
