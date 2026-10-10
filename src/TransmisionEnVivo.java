public class TransmisionEnVivo {
    String titulo;
    int duracionMinutos;
    boolean enCurso;

    TransmisionEnVivo(String titulo, int duracionMinutos, boolean enCurso) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.enCurso = enCurso;
    }

    void reproducir() {
        if (enCurso == true) {
            System.out.println("Reproduciendo transmisión en vivo: " + titulo);
        } else {
            System.out.println("La transmisión no está en curso: " + titulo);
        }
    }
}
