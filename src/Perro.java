public class Perro extends Animal
{
    String raza;
    
    // ---------------------
    // --  CONSTRUCTOR :  --
    // ---------------------
    public Perro(String nombre, int edad)
    {
        super(nombre, edad);   // Asignando la informacion heredada
    }
    
    // ----------------------
    // --  POLIMORFISMO :  --
    // ----------------------
    // Permite que en métodos con el mismo nombre, pero en diferentes clases, se comporten según el tipo de objeto donde se le llama.
    @Override   //Para Sobreescribir Metodo
    public String hacerSonido()
    {
        return "Guau";
    }
    
}