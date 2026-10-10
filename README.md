<img width="481" height="180" alt="image" src="https://github.com/user-attachments/assets/2a35d53a-5cd1-4b9e-a980-be0c68460373" />

El Sistema de Reproducción de Contenidos Digitales

Descripción
Este proyecto consiste en un sistema en Java que permite reproducir diferentes tipos de contenidos multimedia, como películas, episodios de series y transmisiones en vivo. Todos los contenidos comparten una estructura común, pero cada uno tiene su propia lógica de reproducción.

Clases
- **ContenidoDigital:** clase abstracta que contiene los atributos `titulo` y `duracionMinutos`, y define el método abstracto `reproducir()`.
- **Pelicula:** representa una película y simula su reproducción teniendo en cuenta su duración.
- **EpisodioSerie:** representa un episodio de una serie y simula su reproducción.
- **TransmisionEnVivo:** representa una transmisión en directo y verifica que se encuentre en curso antes de reproducirla.

Funcionamiento
En el `main` se crean diferentes contenidos digitales y se almacenan en una lista de tipo `ContenidoDigital`. Luego, el programa recorre la lista e invoca el método `reproducir()` de cada elemento. Cada clase ejecuta su propio comportamiento y muestra los detalles correspondientes por consola.

 Recorrido del mensaje
1. El programa crea una película, un episodio de serie y una transmisión en vivo.
2. Los contenidos se agregan a una lista de tipo `ContenidoDigital`.
3. Se recorre la lista para reproducir cada contenido.
4. Se invoca el método `reproducir()` de cada elemento.
5. Cada clase ejecuta la reproducción según el tipo de contenido.
6. La transmisión en vivo verifica si está activa antes de iniciar la reproducción.
7. Finalmente, se muestran por consola los títulos, las características y los resultados de la reproducción.

Validaciones
El sistema debe comprobar que los títulos sean válidos y que la duración de los contenidos grabados sea correcta. Además, una transmisión en vivo solo debe reproducirse si se encuentra en curso.

Objetivo
Practicar el uso de clases abstractas, la herencia, el polimorfismo y la sobrescritura de métodos para trabajar con distintos tipos de contenidos mediante una estructura común.
