package clasestring;
import java.util.*;
public class Clasestring {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        String c = "Carlos";
        /*System.out.println(c.length());
        //Length: Sirve para contar la cantidad de caracteres del nombre
        System.out.println(c.equals("Juan"));
        System.out.println(c.equals("Carlos"));
        //Equals: Devuelve un boolean es false cuando lo que escribi no es igual ala variable de comparacion (Exactamente igual)
        System.out.println(c.equalsIgnoreCase("carlos"));
        //EqualsIgnoreCase: Determina si la cadena independiente es igual aun asi tengan mayusculas o minusculas
        System.out.println(c.compareTo("Saturno"));
        /*compareTO: Compara los dos string con sus dos letras del alfabeto analizando si empieza con una letra anterior o porterios
        nos dara un valor de 0 si es igual ala variable de comparacion si el valor es positivo es por que la cadena 
        se encuentra es despues de la cadena de comparacion*/
        /*System.out.println(c.charAt(1));
        System.out.println(c.charAt(4));
        //charAt: Devuelve la posicion de el caracter de la variable de comparacion
        System.out.println(c.toCharArray());
        //toCharArray: Convierte el nombre en un arreglo
        System.out.println(c.substring(1));
        System.out.println(c.substring(1, 4));
        //subString: Devuelve lo que hay despues de la posicion de la variable 
        String n = "Carlos Yahir Fernandez Carrtllo";
        System.out.println(n.indexOf('F'));
        //indexOf: Sirve para devolver la posicion en la que piensa el caracter dentro de la variable de compracion
        System.out.println(n.lastIndexOf('a'));
        //lastIndexOf: Devuelve la posicion del ultimo caracter mencionado en la variable de comparacion
        System.out.println(n.startsWith("Car"));
        System.out.println(n.startsWith("gos"));
        //Busca coincidencias antre la variable de comparacion con alguna frase que haya dentro de ella (devolviendo un boolean)
        System.out.println("Ingresa la contraseña: ");
        String pas = o.nextLine();
        if(pas.length()>=8)
        {
            System.out.println("La contraseña es correcta");
        }
        else
        {
            System.out.println("La contraseña es menor a 8 caracteres");
        }*/
        String f = "";
        System.out.println(f.isEmpty());
        System.out.println(f.isEmpty());
        //isEmpty: Nos dice cuando una cadena esta vacia 
        System.out.println("ingresa una cadena de texto: ");
        String texto = o.nextLine();
        System.out.println(texto.contains("Hola"));
        //Contains: Sirve para compara de manera especifica la variable de comparacion
        System.out.println(texto.replace("Mundo", "Carlos"));
        int s = 45;
        double s2 = 34.5;
        String cadena = String.valueOf(s) + c;
        //sirve para concatenar las dos variables de forma correcta para que no marque error al ingresar variables de diferentes tipos
        String cadena2 = Integer.toString(s) + c;
        //sirve especificamente para variables de tipo entero
        System.out.println(cadena+cadena2);
        String cadena3 = Double.toString(s2) + c;
        System.out.println(cadena3);
        String numero = "25";
        int nc = Integer.parseInt(numero);
        int suma = nc + 5;
    }
    
}
