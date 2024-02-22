import java.util.Scanner;

public class Paciente {
    private String nombre;
    private int id;

    public Paciente(){}

    public String getNombre() {
        return nombre;
    }



    public int getId() {
        return id;
    }

    



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setId(int id) {
        this.id = id;
    }



    public int elegirServicio(){
        int servicio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuales servicios va a necesitar 1.Bano 2.Peluqueria 3.Vacunacion 4.Cirugia");
        servicio = entrada.nextInt();
        entrada.nextLine();
        return servicio;
    }


}

     
