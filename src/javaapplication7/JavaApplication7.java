package javaapplication7;
import java.util.Scanner;

/**
 *
 * @author Cristopher Duarte Pimienta
 */
public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        String [] estudiante;
        int u;
        System.out.println("¿Cuantos estudiantes hay?");
        u=leer.nextInt();
        int [] nota;
        nota=new int[u];
        estudiante=new String[u];
        for(int x=0;x<estudiante.length;x++){
            System.out.println("Digite su nombre");
            estudiante[x]=leer.next();
            System.out.println("Digite su nota");
            nota[x]=leer.nextInt();
        }
       
        
            
        
    }
    
}
