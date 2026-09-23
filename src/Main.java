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


        proyector.ejecutarDiagnostico();
        computador.ejecutarDiagnostico();
        impresora.ejecutarDiagnostico();

        Dispositivo dispositivo1 = new Proyector("Proyector sala 10001", true);
        Dispositivo dispositivo2 = new Dispositivo("Computador Laboratorio 10002", true);
        Dispositivo dispositivo3 = new Dispositivo("Impresora Biblioteca 10003", true);

        dispositivo1.ejecutarDiagnostico();
        dispositivo2.ejecutarDiagnostico();
        dispositivo3.ejecutarDiagnostico();

        dispositivo.mostrarEstado();
    }
}