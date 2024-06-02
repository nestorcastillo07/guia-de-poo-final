public class empleadotiempocompleto extends empleados {

    private double salarioanual;

    public empleadotiempocompleto(String nombre, String numerodeidentificacion, double salarioanual){
        super(nombre, numerodeidentificacion); // para mandar a llamar al cnstructor de la clase base
        this.salarioanual = salarioanual;
    }

    @Override//anular el metodo de la clase base para que no haga sobre carga, es una sobre escritura
    public double calcularsalario(){
        return salarioanual / 12; //salariomensual
    }

}
