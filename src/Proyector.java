public class Proyector extends  Dispositivo {

    public Proyector(String nombre, boolean activo) {
        super(nombre, activo);
    }

    @Override
    public void ejecutarDiagnostico() {
        System.out.println("Revisando lampara del proyector...");
    }
}