package Singleton;

public class ConexionBD {
    private static ConexionBD instancia;
    private String nombreBD;
    private boolean conectado;

    private ConexionBD() {
        // Configuración predeterminada
        nombreBD = "Base De Datos";
        conectado = false;
    }

    public static ConexionBD getInstance() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public void conectar() {
        // Lógica para establecer la conexión a la base de datos
        conectado = true;
        System.out.println("Conexión establecida con: " + nombreBD);
    }

    public void desconectar() {
        // Lógica para cerrar la conexión a la base de datos
        conectado = false;
        System.out.println("Conexión cerrada");
    }

    public boolean estaConectado() {
        return conectado;
    }

    public static void main(String[] args) {
        // Uso del Singleton para la conexión a la base de datos
        ConexionBD conexion = ConexionBD.getInstance();

        conexion.conectar();
        System.out.println("¿Está conectado? " + conexion.estaConectado());

        conexion.desconectar();
        System.out.println("¿Está conectado? " + conexion.estaConectado());
    }
}