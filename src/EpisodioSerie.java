public class EpisodioSerie {
    String titulo;
    int duracionMinutos;

    EpisodioSerie(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    void reproducir() {
        System.out.println("Reproduciendo episodio: " + titulo);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}
