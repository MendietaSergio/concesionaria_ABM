package com.devmendietasergio.automovil;

import com.devmendietasergio.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        //llamamos y hacemos visible a nuestro IGU
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
