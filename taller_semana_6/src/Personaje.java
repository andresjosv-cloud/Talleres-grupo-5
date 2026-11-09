public class Personaje {
    private String nombre;
    private String especie;
    private String estado;
    private int episodios;

    public Personaje(String nombre, String especie, String estado, int episodios) {
        this.nombre = nombre;
        this.especie = especie;
        this.estado = estado;
        this.episodios = episodios;
    }

    public String getNombre()  { return nombre; }
    public String getEspecie() { return especie; }
    public String getEstado()  { return estado; }
    public int getEpisodios()  { return episodios; }

    public String getTipo() {
        return "Residente";
    }

    public String resumen() {
        return nombre + " | " + especie + " | " + estado + " | " + episodios + " episodios";
    }
}
