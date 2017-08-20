package pe.egcc.appmate.controller;

import pe.egcc.appmate.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class MateController {

  public long factorial(int n) {
    return MateService.factorial(n);
  }

}
