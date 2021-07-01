import java.util.ArrayList;

public class main {
    public static void main (String [] args){
        ArrayList <Object> lista = new ArrayList<>();
        lista.add("13");
        lista.add("Hola mundo");
        lista.add(48);
        lista.add("Adios mundo");

        int valor = 0;
        for(int i = 0; i < lista.size(); i++){
            try {
                    valor = (int) lista.get(i);
            } catch (Exception e){
                System.out.println("Error con el valor en la posición: " + i + ", con el valor: " + lista.get(i));
                if(test( (String) lista.get(i) )){
                    System.out.println("Pruebe a utilizar un Parse Integer para acomodar el valor.\n" + e.toString());
                } else{
                System.out.println("El valor que se ha casteado no puede convertirse porque no es un número. \n" + e.toString());
                }
            }
        }
    }

    private static boolean test(String texto){
        try{
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }


}