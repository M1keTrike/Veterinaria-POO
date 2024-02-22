import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        agregarCitas();
    }

    public static void agregarCitas(){

        Caja caja1 = new Caja();
        for(int i=0;i<2;i++){
            System.out.println(" ");
            System.out.println("Buenos dias es el Paciente: " + (i+1));
            Cita cita1 = agregarServicios(caja1,i+1);
            caja1.addCitas(cita1);
        }
        caja1.mostrarIngresos();
       
    }


    public static Cita agregarServicios(Caja caja1,int id){
        Scanner entrada = new Scanner(System.in);
        int continuar;
        Paciente paciente1 = new Paciente();
        System.out.println("Nombre de la mascota:");
        String nombre = entrada.nextLine();
        paciente1.setNombre(nombre);

        entrada.nextLine();

        paciente1.setId(id);
        Cita cita1 = new Cita();
        do{
            int servicio = paciente1.elegirServicio();
            switch (servicio) {
                case 1:
                    Estetico bano = new Estetico();
                    bano.setNombre("bano");
                    bano.setPrecio(150);
                    bano.agregarCajaE(caja1,150);
                    cita1.addServicios(bano);
                    
                    break;
                case 2:
                    Estetico peluqueria = new Estetico();
                    peluqueria.setNombre("peluqueria");
                    peluqueria.setPrecio(200);
                    peluqueria.agregarCajaE(caja1,200);
                    cita1.addServicios(peluqueria);
                    break;
                case 3:
                    Medico vacunacion = new Medico();
                    vacunacion.setNombre("vacunacion");
                    vacunacion.setPrecio(400);
                    vacunacion.agregarCajaM(caja1,400);
                    cita1.addServicios(vacunacion);
                    break;
                case 4:
                    Medico ciruguia = new Medico();
                    ciruguia.setNombre("cirugia");
                    ciruguia.setPrecio(1000);
                    ciruguia.agregarCajaM(caja1, 1000);
                    cita1.addServicios(ciruguia);
                    break;
            
                default:
                    System.out.println("No existe ese servicio");
                    break;
            }
            System.out.println("Quiere elegir otro servicio 1.Si 2.No");
            continuar = entrada.nextInt();

            entrada.nextLine();

        }while(continuar==1);
        cita1.setPaciente(paciente1);
        float monto = 0;
        for (Servicio servicio : cita1.getServicios()) {
            monto += servicio.getPrecio();
        }
        cita1.setMonto(monto);
        float pago = cita1.pagarCita();
        cita1.imprimirComprobante(pago);
        return cita1;
    }
}
