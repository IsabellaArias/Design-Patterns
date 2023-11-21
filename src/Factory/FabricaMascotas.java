package Factory;

public class FabricaMascotas {
    public Mascota crearMascota(TipoMascota tipo, String...detalles) {
        switch (tipo) {
            case PERRO:
                return new Perro(detalles[0]);
            case GATO:
                return new Gato(detalles[0]);
            default:
                throw new IllegalArgumentException("Tipo de mascota no válido");
        }
    }
}
