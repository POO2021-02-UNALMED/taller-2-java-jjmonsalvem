package test;

public class prueba {
    public static void main(String[] args) {
        Motor objeto1 = new Motor();
        Auto objeto2 = new Auto();
        objeto1.registro = 1111;
        objeto2.registro = 1111;

        objeto2.verificarIntegridad();
    }
    
}
