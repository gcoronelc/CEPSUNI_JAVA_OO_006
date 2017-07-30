package pe.egcc.pedidoapp.service;

public class PedidoService {
  
  public double calcImpuesto(double importe){
    double impuesto;
    // ------ Inicio Proceso --------
    impuesto = importe * 0.18;
    // ------ Fin Proceso --------
    return impuesto;
  }
  
  public double calcTotal(double importe){
    double total;
    // ------ Inicio Proceso --------
    total = importe + calcImpuesto(importe);
    // ------ Fin Proceso --------
    return total;
  }
  
  
  
  
  
}
