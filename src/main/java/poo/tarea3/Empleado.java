package poo.tarea3;

/**
 *
 * @author Dandiego
 */

public class Empleado extends Entidad{
    private int salario; // Almacena el salario
    private String fecha; // Almacena la fecha en la que se unió

    // Función: Crea el objeto del empleado
    // Entrada: los parámetros del empleado
    // Salida: nada
    public Empleado(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pSalario, String pFecha){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo);
        salario = pSalario;
        fecha = pFecha;
    }

    // Función: modifica el salario
    // Entrada: El salario nuevo
    // Salida: nada
    public void setSalario(int pSalario){
        salario = pSalario;
    }

    // Función: Obtiene el salario
    // Entrada: Nada
    // Salida: El salario
    public int getSalario() {
        return salario;
    }

    // Función: Modifica la fecha en la que entró el empleado
    // Entrada: la fecha
    // Salida: nada
    public void setFecha(String pFecha){
        fecha = pFecha;
    }

    // Función: Obtiene la fecha
    // Entrada: nada
    // Salida: la fecha en la que entró el empleado
    public String getFecha(){
        return fecha;
    }

    // Función: Despliega la información del empleado
    // Entrada: nada
    // Salida: toda la información del empleado
    public String toString(){
        String texto = super.toString();
        texto += "Salario mensual: " + salario + "\nFecha de ingreso a la empresa: " + fecha + "\n";
        return texto;
    }
}
