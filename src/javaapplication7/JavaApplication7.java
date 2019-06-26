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
        double acum=0;
        int cont=0;
        nota=new int[u];
        estudiante=new String[u];
        for(int x=0;x<estudiante.length;x++){
            System.out.println("Digite su nombre");
            estudiante[x]=leer.next();
            System.out.println("Digite su nota");
            nota[x]=leer.nextInt();
            

        }
        System.out.println("La lista de estudiantes es ");         
        for(int y=0;y<estudiante.length;y++){
           System.out.println(estudiante[y]);
           acum=acum+nota[y];

           
       }
        System.out.println("El promedio del salon es " + acum/u);
        
        for(int xx=0;xx<nota.length;xx++){
            if(nota[xx]<= 3){
                cont=cont+1;
            }
        }
        System.out.println("Los estudiantes que pasaron con un minimo de 3 fueron "+cont);
                    
        
    }
    
}
