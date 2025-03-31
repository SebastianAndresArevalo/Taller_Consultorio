package ord.edu.uniquindio.com.co.poo.app;


import ord.edu.uniquindio.com.co.poo.model.Consultorio;
import ord.edu.uniquindio.com.co.poo.model.Especialidad;
import ord.edu.uniquindio.com.co.poo.model.Odontologo;
import ord.edu.uniquindio.com.co.poo.model.Paciente;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();


        consultorio.registrarOdontologo(new Odontologo("001", "Juan", "12345",Especialidad.ORTODONCIA));


        Paciente paciente1 = new Paciente("1001", "Maria", 30, "1234", "Calle 1", LocalDate.now(), 6);
        consultorio.registrarPaciente(paciente1);

        List<Paciente> pacientesDestacados = consultorio.obtenerPacientesConMasDe5Tratamientos();
        System.out.println("Pacientes con más de 5 tratamientos:");
        for (Paciente p : pacientesDestacados) {
            System.out.println(p.nombre());
        }

    }
}