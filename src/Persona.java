public class Persona
{
    // -------------------
    // --  ATRIBUTOS :  --
    // -------------------
    private String Nombre;
    private String Apellido;
    private int Edad;
    
    // ---------------------
    // --  CONSTRUCTOR :  --
    // ---------------------
    /* public Persona()
    {
        this.Nombre = null;
        this.Apellido = null;
        this.Edad = 0;
    } */
    
    // SOBRECARGA del Constructor, es reutilizar el constructor pero con diferentes parametros:
    public Persona(String nombre, String apellido, int edad)
    {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
    }
    
    // ---------------------------
    // --  METODOS GET y SET :  --
    // ---------------------------
    // Get y Set - "Nombre":
    public String getNombre() {
        return Nombre.toUpperCase();    // Convertido a MAYUSCULAS
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    // Get y Set - "Apellido":
    public String getApellido() {
        return Apellido.toUpperCase();  // Convertido a MAYUSCULAS
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    
    // Get y Set - "Edad":
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    
    // -------------------------
    // ---  OTROS MÉTODOS :  ---
    // -------------------------
    public String nombre_completo_01()
    {
        return Nombre + " " + Apellido;
    }
    
    public String nombre_completo_02()
    {
        return getNombre() + " " + getApellido();
    }
    
    public String enviar_saludo(String saludado)
    {
        if (Edad > 40)
        {
            return "Buenos dias querido " + saludado;
        }
        return "Hola, ¿Cómo estás " + saludado + "?";
    }
}
