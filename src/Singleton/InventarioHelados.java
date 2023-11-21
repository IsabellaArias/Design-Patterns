package Singleton;
import java.util.ArrayList;
import java.util.List;
class InventarioHelados {
    private static InventarioHelados instance;
    private List<String> heladosDisponibles;

    private InventarioHelados() {
        heladosDisponibles = new ArrayList<>();
    }

    public static InventarioHelados getInstance() {
        if (instance == null) {
            instance = new InventarioHelados();
        }
        return instance;
    }

    public void agregarHelado(String helado) {
        heladosDisponibles.add(helado);
    }

    public List<String> obtenerHeladosDisponibles() {
        return heladosDisponibles;
    }

    public static void main(String[] args) {
        InventarioHelados inventario = InventarioHelados.getInstance();

        // Agregando helados al inventario
        inventario.agregarHelado("Helado de Vainilla");
        inventario.agregarHelado("Helado de Chocolate");
        inventario.agregarHelado("Helado de Fresa");

        // Mostrando los helados disponibles en la tienda
        List<String> heladosDisponibles = inventario.obtenerHeladosDisponibles();
        System.out.println("Helados disponibles:");
        for (String helado : heladosDisponibles) {
            System.out.println("- " + helado);
        }
    }
}
