public class App {
    public static void main(String[] args) throws Exception
    {
        // --------------------------------------------------------- //
        // -----------------------  Persona  ----------------------- //
        // --------------------------------------------------------- //
        Persona P1 = new Persona("Raúl","Alvarez",53);
        
        // Usando los Set:
        P1.setNombre("Seth");
        P1.setApellido("Meier");
        P1.setEdad(30);
        
        System.out.println("-- Persona --");
        System.out.println(P1.nombre_completo_01() + " tiene " + P1.getEdad());
        System.out.println(P1.nombre_completo_02() + " tiene " + P1.getEdad());
        System.out.println(P1.enviar_saludo(P1.getNombre()));
        
        // --------------------------------------------------------- //
        // -----------------------  Animal  ------------------------ //
        // --------------------------------------------------------- //
        Animal animal = new Animal("Bestia", 20);
        Gato gato = new Gato("Misho", 10);
        Perro perro = new Perro("Mailon", 12);
        
        System.out.println("");
        System.out.println("-- Animales --");
        System.out.println("El Animal llamado " + animal.Nombre + " y hace el sonido: " + animal.hacerSonido());
        System.out.println("El Gato llamado " + gato.Nombre + " y hace el sonido: " + gato.hacerSonido());
        System.out.println("El Perro llamado " + perro.Nombre + " y hace el sonido: " + perro.hacerSonido());
        System.out.println("El Total de Animales creados es de: " + animal.getCantAnimales());
        System.out.println("Yo atiendo a mis animalitos en: " + Veterinaria.Nombre);
        System.out.println("");
    }
}
