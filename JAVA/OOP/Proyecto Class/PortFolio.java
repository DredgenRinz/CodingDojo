import java.util.ArrayList;

public class PortFolio {
    private ArrayList <Project> projects = new ArrayList<>();

    public PortFolio(String n, String d){
        Project initial = new Project(n, d);
        projects.add(initial);
    }
    public PortFolio(String n){
        Project initial = new Project(n);
        projects.add(initial);
    }
    public PortFolio(){}

    public void createProject(String n, String d){
        Project temp = new Project(n, d);
        projects.add(temp);
    
    }
    public void createProject(String n){
        Project temp = new Project(n);
        projects.add(temp);
    }
    public void addProject(Project obj){
        this.projects.add(obj);
    }
    public ArrayList <Project> getProjects(){
        return this.projects;
    }
    public void setProjects(ArrayList <Project> temp){
        this.projects = temp;
    }

    public String getPortfolioCost(){
        double totalCost = 0;
        for(int i = 0; i < projects.size(); i++){
            totalCost += projects.get(i).getInitialCost();
        }
        return "El costo total del portafolio es: " + totalCost;
    }
    public String showPortfolio(){
        String elevator = "";
        for(int i = 0; i < projects.size(); i++){
            elevator += projects.get(i).elevatorPitch() + "\n";
        }
        return "Los proyectos en el portafolio son: \n" + elevator;
    }

}
