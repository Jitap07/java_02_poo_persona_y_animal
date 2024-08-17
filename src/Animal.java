public class Animal
{
    // -------------------
    // --  ATRIBUTOS :  --
    // -------------------
    String Nombre;
    int Edad;
    static int cantAnimales = 0;  // Con el "static", accedes sin necesidad de instanciar ("Animal animal = new Animal(. . .)")
    
    // ---------------------
    // --  CONSTRUCTOR :  --
    // ---------------------
    public Animal(String nombre, int edad)
    {
        this.Nombre = nombre;
        this.Edad = edad;
        this.cantAnimales ++;
    }

    // ---------------------------
    // --  METODOS GET y SET :  --
    // ---------------------------
    // Get y Set - "cantAnimales":
    public static int getCantAnimales()
    {
        return cantAnimales;
    }
    
    // -------------------------
    // ---  OTROS MÉTODOS :  ---
    // -------------------------
    public String hacerSonido()
    {
        return "Grrrr";
    }
}
