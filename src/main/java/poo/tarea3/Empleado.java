package poo.tarea3;

/**
 *
 * @author Dandiego
 */

public class Empleado extends Entidad{
    private int salario;
    private String fecha;
    public Empleado(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pSalario, String pFecha){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo);
        salario = pSalario;
        fecha = pFecha;
    }

    public void setSalario(int pSalario){
        salario = pSalario;
    }

    public int getSalario() {
        return salario;
    }
    
    public void setFecha(String pFecha){
        fecha = pFecha;
    }

    public String getFecha(){
        return fecha;
    }

    public String toString(){
        String texto = super.toString();
        texto += "\nSalario: " + salario + "\nFecha: " + fecha + "\n";
        return texto;
    }
}
