import java.util.ArrayList;
public class Caja {
    private ArrayList<Cita> citas = new ArrayList<Cita>();
    private float ingresosMedicos;
    private float ingresosEsteticos;
    public static void añadirCitas(){

    }

    public void mostrarIngresos(){
        System.out.println(" ");
        float total = this.getIngresosEsteticos() + this.getIngresosMedicos();
        System.out.println("Ingresos totales del dia: " + total);
        System.out.println("Ingresos Esteticos del dia " + this.getIngresosEsteticos());
        System.out.println("Ingresos Medicos del dia " + this.getIngresosMedicos());

        for (Cita cita : this.getCitas()) {
            System.out.println(cita.getPaciente().getNombre());
            System.out.println(cita.getMonto());
        }

    }

    public Caja (){

    }

    public void addMedicos(float ingresoM){
        this.ingresosMedicos += ingresoM;
    }

    public void addEsteticos(float ingresoE){
        this.ingresosEsteticos += ingresoE;
    }

    public void addCitas(Cita cita){
        citas.add(cita);
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public float getIngresosMedicos() {
        return ingresosMedicos;
    }

    public void setIngresosMedicos(float ingresosMedicos) {
        this.ingresosMedicos = ingresosMedicos;
    }

    public float getIngresosEsteticos() {
        return ingresosEsteticos;
    }

    public void setIngresosEsteticos(float ingresosEsteticos) {
        this.ingresosEsteticos = ingresosEsteticos;
    }

   

    
    
}
