import java.util.ArrayList;

public class main {
    public static void main (String [] args){
        ArrayList <Object> lista = new ArrayList<>();
        lista.add("13");
        lista.add("Hola mundo");
        lista.add(48);
        lista.add("Adios mundo");

        int valor = 0;
        try {
            for(int i = 0; i < lista.size(); i++){
                valor = (int) lista.get(i);
            }

        } catch (Exception e){
            System.out.println("El valor que se ha casteado no puede convertirse porque no es un número. \n" + e.toString());
        }
    }


}