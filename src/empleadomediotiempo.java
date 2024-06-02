public class empleadomediotiempo extends empleados {

    private double salarioporhora;
    private int horastrabajadasporsemana;

    public empleadomediotiempo(String nombre, String numerodeidentificacion, double salarioporhora,int horastrabajadasporsemana){
        super(nombre, numerodeidentificacion);
        this.salarioporhora = salarioporhora;
        this.horastrabajadasporsemana= horastrabajadasporsemana;
    }
    @Override
    public double calcularsalario(){
        return salarioporhora * horastrabajadasporsemana*4;
    }

}
