public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        empleados[] empleados2 = new empleados[2];

        empleados2[0] =new empleadotiempocompleto("pepe ", "2024", 70000);
        empleados2[1] = new empleadomediotiempo( "chi ", "1363", 15, 5);
       
       
        for (empleados empleados : empleados2){
            System.out.println(" empleado " + empleados.getnombre()+ " salario mensual " + empleados.calcularsalario());
        }  

        System.out.println("============================================");

        for (int i = 0; i < empleados2.length; i++) {
        System.out.println("nombre del mae " + empleados2[i].getnombre() + "su salario " +  empleados2[i].calcularsalario());
        
        }

        //a la clase empleado se craen otros atributo horas extras, asistencia, etc

        // en que parte del codiigo usamos y como, los 4 pilares 








    }
}
