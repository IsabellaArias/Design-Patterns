package Factory;

public class Perro extends Mascota {
    private final String tipo = "Perro";
    private final String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    @Override
    public void saludar() {
        System.out.println("¡Guau! ¡Hola! Soy un perro de raza " + raza + ".");
    }

    @Override
    public String obtenerTipo() {
        return tipo;
    }
}

class Gato extends Mascota {
    private final String tipo = "Gato";
    private final String color;

    public Gato(String color) {
        this.color = color;
    }

    @Override
    public void saludar() {
        System.out.println("¡Hola! Soy un gato de color " + color + ".");
    }

    @Override
    public String obtenerTipo() {
        return tipo;
    }
}
