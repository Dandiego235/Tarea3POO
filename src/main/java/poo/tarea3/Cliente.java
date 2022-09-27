/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tarea3;

/**
 * @author Daniel Granados Retana y Diego Granados Retana
 *  Tarea 3: Programación Orientada a Objetos
 * 26 de setiembre, 2022
 */
public class Cliente extends Entidad{
    private int limiteCredito; // se almacena el límite del crédito
    private String fecha; // Almacena la fecha en la que iniciaron negocios con la empresa.
    
    // Función: Crea el objeto del cliente
    // Entrada: los parámetros del cliente
    // Salida: nada
    public Cliente(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo);
        limiteCredito = pLimite;
        fecha = pFecha;
    }
    

    // setters y getters de los parámetros del cliente.
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
    
    // Función: Despliega la información del cliente
    // Entrada: nada
    // Salida: el texto con la información
    @Override
    public String toString(){
        return super.toString() + "Limite de crédito: " + limiteCredito + "\nFecha en que se registró: " + fecha + "\n";
    }
}
