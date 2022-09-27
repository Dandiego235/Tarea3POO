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
public class ClienteEmpresa extends Cliente{
    private String nombreContacto;
    private int telefonoContacto;
    /* Clase que hereda las características de cliente.
       Añade los atributos para el nombre del contacto y el teléfono del contacto.
    */
    public ClienteEmpresa(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha,
            String pNombreContacto, int pTelefonoContacto){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo, pLimite, pFecha);
        nombreContacto = pNombreContacto;
        telefonoContacto = pTelefonoContacto;
    }
    
    // setters y getters de los atributos.
    public void setNombreContacto(String pNombreContacto){
        nombreContacto = pNombreContacto;
    }
    
    public String getNombreContacto(){
        return nombreContacto;
    }
    
    public void setTelefonoContacto(int pTelefonoContacto){
        telefonoContacto = pTelefonoContacto;
    }
    
    public int getTelefonoContacto(){
        return telefonoContacto;
    }
    
    // Función: Despliega la información del cliente
    // Entrada: nada
    // Salida: el texto con la información
    public String toString(){
        return super.toString() + "Nombre de contacto: " + nombreContacto + "\nTeléfono de contacto: " + telefonoContacto + "\n";
    }
}
