package interfaces;

import java.util.List;


import modelo.Capacitacion;

public interface ICapacitacion {
	
	void crearCapacitacion(Capacitacion capacitacion );
	
	List<Capacitacion> listarCapacitacion();

}
