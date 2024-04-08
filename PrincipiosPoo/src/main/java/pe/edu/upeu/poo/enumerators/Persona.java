
package pe.edu.upeu.poo.enumerators;


enum GENERO{Femenino, Masculino}
enum ESTAFO_CIVIL{Casado,Divorciado,Soltero}
public class Persona {
    public static void main(String[] args) {
        System.out.println("Genero:"+GENERO.Masculino);
for(GENERO ec:GENERO.values()){
System.out.println(ec);

      }
    }
    
}
