public class ProjectTest{
    public static void main (String [] args){
        PortFolio carpeta = new PortFolio();
        Project test1 = new Project();
        Project test2 = new Project("Proyecto 2");
        Project test3 = new Project("Proyecto 3", "Prueba de creación del proyecto desde el constructor");

        test1.setNombre("Proyecto 1");
        test1.setDescripcion("Prueba de creación de proyecto con constructor vacio y setters");
        test1.setInitialCost(123456.7);

        test2.setDescripcion("Prueba de creación de proyecto sin descripción y setter");
        test2.setInitialCost(234567.8);

        test3.setInitialCost(345678.9);

        carpeta.addProject(test1);
        carpeta.addProject(test2);
        carpeta.addProject(test3);

        System.out.println(carpeta.getPortfolioCost());
        System.out.println(carpeta.showPortfolio());

    }
}