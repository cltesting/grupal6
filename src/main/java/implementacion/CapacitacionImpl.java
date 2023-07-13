package implementacion;

import java.util.ArrayList;
import java.util.List;

import controlador.CrearCapacitacion;
import interfaces.ICapacitacion;
import modelo.Capacitacion;

public class CapacitacionImpl implements ICapacitacion {

	@Override
	public void crearCapacitacion(Capacitacion capacitacion) {
		 //System.out.println("Capacitación creada: " + capacitacion);
		
				
	}

	@Override
	public List<Capacitacion> listarCapacitacion() {
		
		List<Capacitacion> capacitaciones = new ArrayList<>();
        capacitaciones.add(new Capacitacion(1,"11111111-1","Lunes","12:00","Las Condes","20"));
        capacitaciones.add(new Capacitacion(1,"22222222-2","Martes","12:00","Providencia","30"));
        capacitaciones.add(new Capacitacion(1,"33333333-3","Miercoles","12:00","Santiago","40"));
        return capacitaciones;
		
	}

}
