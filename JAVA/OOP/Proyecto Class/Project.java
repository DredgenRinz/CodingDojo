public class Project{
    private String nombre;
    private String descripcion;
    private double initialCost = 0;

    public Project(){}
    public Project(String n){
        this.nombre = n;
    }
    public Project(String n, String d){
        this.nombre = n;
        this.descripcion = d;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String d){
        this.descripcion = d;
    }

    public String elevatorPitch(){
        return this.nombre + " (" + this.initialCost + "): " + this.descripcion;
    }
    public double getInitialCost(){
        return this.initialCost;
    }
    public void setInitialCost(double ic){
        this.initialCost = ic;
    }

}

/*  Desafíos Opcionales

    Agregar los métodos apropiados de getter y setter y el constructor para que funcione.
    Agregar el método getPortfolioCost para calcular y devolver el costo total del portafolio completo.
    Agregar el método showPortfolio que mostrará en pantalla todos los proyectos en formato elevator Pitches, seguido del costo total.
    */
