/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.agrp.promedio.Prueba;
import pe.agrp.promedio.Service.ServicePromedio;
public class Prueba01 {

    public static void main(String[] args) {
        //Datos
        int nota1 = 14;
        int nota2 = 15;
        int nota3 = 14;
        int nota4 = 14;
        int exap = 19;
        int exaf = 03;
        
        //Proceso
        int menor = ServicePromedio.menorNota(nota1, nota2, nota3, nota4);
        int promefinal = ServicePromedio.calcPromedio(nota1, nota2, nota3, nota4, exap, exaf);
        String cond = ServicePromedio.condicion(promefinal);
        
        //Reporte
        System.out.println("Nota eliminada: " + menor);
        System.out.println("Promedio: " + promefinal);
        System.out.println("Condición: " + cond);
        
    }
    
}
