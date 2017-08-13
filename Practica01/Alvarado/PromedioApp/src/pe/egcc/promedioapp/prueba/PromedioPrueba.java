package pe.egcc.promedioapp.prueba;

import pe.egcc.promedioapp.dto.PromedioDto;
import pe.egcc.promedioapp.service.PromedioService;

public class PromedioPrueba {

    public static void main(String[] args) {
        PromedioDto dto = new PromedioDto();
        dto.setN1(15);
        dto.setN2(5);
        dto.setN3(14);
        dto.setN4(11);
        dto.setEp(13);
        dto.setEf(11);

        PromedioService ps = new PromedioService();
        int promPrac = ps.PromedioPracticas(dto);
        int promfinal = ps.CalcularPromedio(promPrac, dto);

        System.out.println("Promedio Final del Alumno: " + promfinal);
        System.out.println("Condición de Promedio: " + ps.Reporte(promfinal));
    }

}
