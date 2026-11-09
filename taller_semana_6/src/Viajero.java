public class Viajero extends Personaje {
    private String dimension;
    private int[] energia;

    public Viajero(String nombre, String especie, String estado, int episodios,
                   String dimension, int[] energia) {
        super(nombre, especie, estado, episodios);
        this.dimension = dimension;
        this.energia = energia;
    }

    public String getDimension() { return dimension; }
    public int[] getEnergia()    { return energia; }

    @Override
    public String getTipo() {
        return "Viajero";
    }

    @Override
    public String resumen() {
        return super.resumen() + " | Dimension " + dimension;
    }
}
