public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo("Notebook hp", true);
        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();


        Proyector proyector = new Proyector("Proyector sala 1000", true);
        proyector.mostrarEstado();
        Computador computador = new Computador("Computador sala 10000", false);
        computador.mostrarEstado();
        Impresora impresora = new Impresora("Impresora sala 35678", true);
        impresora.mostrarEstado();


    }
}