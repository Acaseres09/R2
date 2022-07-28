//package registro;

public class Estudiante {
    String nombre;
    String edad;
    String programa;
    String tipo_etnia;
    public Estudiante(String nombre, String edad, String programa, String tipo_etnia){
        this.nombre = (nombre);
        this.edad = edad;
        this.programa = programa;
        this.tipo_etnia = (tipo_etnia);
    }
    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    public String getPrograma(){
        return programa;
    }
    public String getTipoEtnia(){
        return tipo_etnia;
    }
}
