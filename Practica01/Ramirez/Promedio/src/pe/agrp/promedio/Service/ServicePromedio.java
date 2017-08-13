package pe.agrp.promedio.Service;
public class ServicePromedio {
    public static int menorNota(int nota1, int nota2, int nota3, int nota4){
    int menor = nota1;
    if( menor > nota2){
      menor = nota2;
    }
    if( menor > nota3){
      menor = nota3;
    }
    if( menor > nota4){
      menor = nota4;
    }
    return menor;
  }
  
  
  public static int calcPromedio(int nota1, int nota2, int nota3, int nota4, int exap, int exaf){
    int promedio;
    int promefinal;
    int menor = menorNota(nota1, nota2, nota3, nota4);
    promedio = ( nota1 + nota2 + nota3 + nota4 - menor) / 3;
    promefinal = (promedio + exap + exaf) / 3;
    return promefinal;
  }
  
  public static String condicion( int promedio ){
    String cond = "";
    if(promedio >= 14){
      cond = "APROBADO";
    } else {
      cond = "DESAPROBADO";
    }
    return cond;
  }
    
}
