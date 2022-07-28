
//package registro;

public class Pregrado extends Estudiante{
    String cantidad_creditos;
    
    public String getCantidadCreditos(){
        return cantidad_creditos;
    }
    public Pregrado(String nombre, String edad, String programa,String tipo_etnia, String cantidad_creditos){
        super(nombre,edad,programa,tipo_etnia);
        this.cantidad_creditos = (cantidad_creditos);
    }
}
