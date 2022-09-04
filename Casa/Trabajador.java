public class Trabajador extends Persona {
    private String cargo;
    private int salarioMensual;
    private int horasTrabajoMensual;

    public Trabajador(String cargo, int salarioMensual, int horasTrabajoMensual) {
        this.cargo = cargo;
        this.salarioMensual = salarioMensual;
        this.horasTrabajoMensual = horasTrabajoMensual;
    }
}
