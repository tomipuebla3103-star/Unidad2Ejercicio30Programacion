public  abstract class ContenidoDigital {
    String titulo;
    double  duracionMinutos;

    public  ContenidoDigital(String titulo,double duracionMinutos){
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }
     public abstract  void reproducir();
}
