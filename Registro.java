//package registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    static ArrayList<Pregrado> listaPregrado = new ArrayList<Pregrado>();
    static ArrayList<Posgrado> ListaPosgrado = new ArrayList<Posgrado>();
    static String orden = "";
    public static void procesar_comandos(int comando, String tipo, String datos){
        
        if(comando == 1){          
            if(tipo.equals("Pregrado")){
                Pregrado NuevoPregrado = new Pregrado(datos.split("&")[2],datos.split("&")[3],datos.split("&")[4],datos.split("&")[5],datos.split("&")[6]);
                listaPregrado.add(NuevoPregrado);
                orden+="N ";
            }else{
                Posgrado NuevoPosgrado = new Posgrado(datos.split("&")[2],datos.split("&")[3],datos.split("&")[4],datos.split("&")[5],datos.split("&")[6]);
                ListaPosgrado.add(NuevoPosgrado);
                orden+="L ";
            }
        }else if(comando == 2){
            int indicePregrado = 0,indicePosgrado = 0;
            String salida = "***Listado de estudiantes***\n";
            for(String indiceO: orden.split(" ")){
                if(indiceO.equals("N")){
                    salida+=("\tEstudiante Pregrado\n");
                    salida+=("\tNombre: "+listaPregrado.get(indicePregrado).getNombre()+"\n");
                    salida+=("\tEdad: "+listaPregrado.get(indicePregrado).getEdad()+" anios\n");
                    salida+=("\tPrograma: "+listaPregrado.get(indicePregrado).getPrograma()+"\n");
                    salida+=("\tEtnia: "+listaPregrado.get(indicePregrado).getTipoEtnia()+"\n");
                    salida+=("\tCreditos aprobados: "+listaPregrado.get(indicePregrado).getCantidadCreditos()+"\n");
                    indicePregrado++;
                }else{
                    salida+=("\tEstudiante Posgrado\n");
                    salida+=("\tNombre: "+ListaPosgrado.get(indicePosgrado).getNombre()+"\n");
                    salida+=("\tEdad: "+ListaPosgrado.get(indicePosgrado).getEdad()+" anios\n");
                    salida+=("\tPrograma: "+ListaPosgrado.get(indicePosgrado).getPrograma()+"\n");
                    salida+=("\tEtnia: "+ListaPosgrado.get(indicePosgrado).getTipoEtnia()+"\n");
                    salida+=("\tModalidad: "+ListaPosgrado.get(indicePosgrado).getModalidad()+"\n");
                    indicePosgrado++;
                }
            }
            System.out.println(salida);                  
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String entrada = sc.nextLine();
            if(!entrada.split("&")[0].equals("3")){
                if(entrada.split("&")[0].equals("1")){
                    procesar_comandos(Integer.parseInt(entrada.split("&")[0]),entrada.split("&")[1], entrada);
                }else{
                    procesar_comandos(Integer.parseInt(entrada.split("&")[0]),"", entrada);
                }
            }else{
                break;
            }
        }        
    }
}
