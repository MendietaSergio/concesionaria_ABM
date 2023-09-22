package com.devmendietasergio.automovil.logica;

import com.devmendietasergio.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        //creo objeto auto
        Automovil auto = new Automovil();
        //seteo datos en obejto
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        //agrego objeto en controlPersis
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();//ejecuto metodo traerAutos, devuelvo al que llame el metodo.
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setCantPuertas(cantPuertas);
        
        //le pido a la persistencia que modifique los datos
        controlPersis.modificarAuto(auto);
               
    }

}
