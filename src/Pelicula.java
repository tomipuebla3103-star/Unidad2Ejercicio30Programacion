public class Pelicula {
    String titulo;
    int duracionMinutos;

    Pelicula(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    void reproducir() {
        System.out.println("Reproduciendo película: " + titulo);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}
