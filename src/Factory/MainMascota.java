package Factory;

public class MainMascota {
    public static void main(String[] args) {
        FabricaMascotas fabrica = new FabricaMascotas();

        Mascota miPerro = fabrica.crearMascota(TipoMascota.PERRO, "Labrador");
        miPerro.saludar();

        // Crear un gato con detalles de color
        Mascota miGato = fabrica.crearMascota(TipoMascota.GATO, "Negro");
        miGato.saludar();
    }
}