package com.devmendietasergio.automovil.persistencia;

import com.devmendietasergio.automovil.logica.Automovil;
import com.devmendietasergio.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//desde la persistencia hago peticiones a la BD

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
    
    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();//trae todos los registros, en ese caso de los autos desde la BD, devuelvo info
    }
    
    public void borrarAuto(int idAuto) {
        //utilizar try-catch,en caso de que el id no sea el correcto, capta el error y podemos seguir sin que se crashee el programa.
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Automovil traerAuto(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }
    
    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
