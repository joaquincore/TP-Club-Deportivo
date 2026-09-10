public class Main {
    public static void main(String[] args) {
        Deporte futbol = new Deporte("Futbol", "Deporte de 11 contra 11", true, 105.0, 68.0);
        Deporte basquet = new Deporte("Basquetbol", "Deporte de 5 contra 5", true, 28.0, 15.0);

        Entrenador dtFutbol = new Entrenador("Marcelo Gallardo", "18/01/1976", "25111222", "Presion Alta", 12, Categoria.SENIOR);
        Entrenador dtBasquet = new Entrenador("Sergio Hernandez", "01/11/1963", "18333444", "Defensa Zona", 20, Categoria.SENIOR);

        Jugador j1 = new Jugador("Enzo Perez", "22/02/1986", "32000111", futbol, Categoria.SENIOR, 24);
        Jugador j2 = new Jugador("Julian Alvarez", "31/01/2000", "42000222", futbol, Categoria.JUVENIL, 9);
        Jugador j3 = new Jugador("Facundo Campazzo", "23/03/1991", "35000333", basquet, Categoria.SENIOR, 7);

        Equipo equipoFutbol = new Equipo("Rayos F.C.", futbol, dtFutbol, 11);
        Equipo equipoBasquet = new Equipo("Titanes Basquet", basquet, dtBasquet, 5);

        equipoFutbol.agregarJugador(j1);
        equipoFutbol.agregarJugador(j2);

        equipoFutbol.agregarJugador(j3);

        equipoBasquet.agregarJugador(j3);

        System.out.println("");
        equipoFutbol.mostrarPlantilla();
        System.out.println("");
        equipoBasquet.mostrarPlantilla();
        System.out.println("");

        j1.presentarse();
        dtFutbol.planificarEntrenamiento();
        j1.jugarPartido();
        j1.entrenar();
    }
}