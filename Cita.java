import java.util.ArrayList;
import java.util.Scanner;
public class Cita {
    private ArrayList<Servicio> servicios= new ArrayList<Servicio>();
    private float monto;
    private Paciente paciente= new Paciente();

    public float pagarCita(){
        float pago;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Total a pagar: " + this.monto);
            System.out.println("El pago fue de:");
            pago = entrada.nextInt();

            entrada.nextLine();

        }while(pago<this.monto || pago<0);
        return pago;
    }

    public void imprimirComprobante(float pago){
        System.out.println("");
        System.out.println("Paciente: " +  this.getPaciente().getId());
        System.out.println("Nombre: " + this.getPaciente().getNombre());
        System.out.println("Servicios:");
        for (Servicio servicio : this.getServicios()) {
            System.out.println(servicio.getNombre() + "---" + servicio.getPrecio());
        }
        System.out.println(" Total a pagar: " + this.getMonto() + " Pago con: " + pago + " Cambio: " + (pago-this.getMonto()));
    }

    public Cita(){}
    public ArrayList<Servicio> getServicios() {
        return servicios;
    }
    public void addServicios(Servicio servicio){
        servicios.add(servicio);
    }
    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    



}
