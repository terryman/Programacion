package exercici_boolean_user_password;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Scanner;

public class Exercici_Boolean_User_Password {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        String user_auth = "usuario1", pass_auth = "asdfg", user, pass;

        for (int i = 1; i <= 3; i++) {
        
            System.out.println("Introduce tu usuario");

            user = sc.next();

            System.out.println("Introduce tu contraseña");

            pass = sc.next();

            boolean compar_user = user_auth.equals(user) ? TRUE : FALSE;
            boolean compar_auth = pass_auth.equals(pass) ? TRUE : FALSE;
            
                if (compar_user == TRUE && compar_auth == TRUE){
                    System.out.println("Acceso autorizado");
                    break;
                }
                else{
                    System.out.println("El usuario o contraseña son incorrectos, quedan " + (3 - i) + " intentos");
                }
        }
    }
}

//Recibe un nombre de usuario y una contraseña, y devuelve un valor lógico: 
//verdadero si se ha introducido el nombre y la contraseña adecuadas. Además, 
//incrementa el número de intentos que recibe como parámetro de entrada/salida.