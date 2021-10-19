package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        int contador = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] instanceof Asiento) {
                contador++;
            }   
        }
        return contador;
    }

    String verificarIntegridad() {
        boolean bandera = true;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i].registro != this.registro) {
                bandera = false; 
            }
        }
        if (motor.registro != this.registro) {
            bandera = false;
        }
        if (bandera) {
            return "Auto original";
        } else {
            return "Las piezas no son originales"; 
        }
        
    }
}

