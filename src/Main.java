//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pelicula pelicula = new Pelicula("Titanic", 195);
    EpisodioSerie episodio = new EpisodioSerie("Capítulo 1", 45);
    TransmisionEnVivo transmision = new TransmisionEnVivo("Partido de fútbol", 90, true);

    pelicula.reproducir();
    System.out.println("--------------------");

    episodio.reproducir();
    System.out.println("--------------------");

    transmision.reproducir();
}
