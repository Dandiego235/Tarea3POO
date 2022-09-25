/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tarea3;

/**
 *
 * @author Dandiego
 */
public class Cliente extends Entidad{
    private int limiteCredito;
    private String fecha;
    private boolean tipo; // tipo para señalar si el cliente es persona o empresa: 0 para persona, 1 para empresa.
    
    
    public Cliente(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, boolean pTipo){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo);
        limiteCredito = pLimite;
        fecha = pFecha;
        tipo = pTipo;
    }
    
    public void setLimite(int pLimite){
        limiteCredito = pLimite;
    }
    
    public int getLimite(){
        return limiteCredito;
    }
    
    public void setFecha(String pFecha){
        fecha = pFecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public boolean getTipo(){
        return tipo;
    }
    
    // No hay un método llamado setBoolean porque no vamos a permitir que se le cambie el tipo a un cliente luego de haberse creado.
    
    public String toString(){
        String tipoStr = (tipo) ? "Empresa" : "Persona";
        return super.toString() + "Limite de crédito: " + limiteCredito + "\nFecha: " + fecha + "\nTipo: " + tipoStr + "\n";
    }
}
