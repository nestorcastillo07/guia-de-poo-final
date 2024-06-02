abstract class empleados {

    private String nombre;
    private String numerodeidentificacion;

    public empleados(String nombre, String numerodeidentificacion){
        this.nombre = nombre;
        this.numerodeidentificacion = numerodeidentificacion;
    }

    public String getnombre(){ //getpara traer el atributos privados 
        return nombre;
    }
  
    public String getnumerodeidentificacion(){
      return numerodeidentificacion;
    }
  

//metodo abstracto
public abstract double calcularsalario();
}
