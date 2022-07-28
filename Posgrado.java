//package registro;

public class Posgrado extends Estudiante{
    String modalidad;
    
    public String getModalidad(){
        return modalidad;
    }

    public Posgrado(String nombre, String edad, String programa,String tipo_etnia, String modalidad){
        super(nombre,edad,programa,tipo_etnia);
        this.modalidad = (modalidad);
    }
}
