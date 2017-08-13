package pe.egcc.promedioapp.service;

import java.util.Arrays;
import pe.egcc.promedioapp.dto.PromedioDto;

public class PromedioService {

    /**
     *
     * @param dto
     * @return promedio practicas
     */
    public int PromedioPracticas(PromedioDto dto) {
        int[] practicas = {dto.getN1(), dto.getN2(), dto.getN3(), dto.getN4()};
        Arrays.sort(practicas);
        int promprac;
        promprac = (practicas[1] + practicas[2] + practicas[3]) / 3;
        return promprac;
    }

    public int CalcularPromedio(int promprac, PromedioDto dto) {
        int promedio;
        promedio = (promprac + dto.getEp() + dto.getEf()) / 3;
        return promedio;
    }

    public String Reporte(int promedio) {
        if (promedio >= 14) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
}
