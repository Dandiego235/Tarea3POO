/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.tarea3;

/**
 *
 * @author Dandiego
 */
public class Entidad {
    private String nombre;
    private String identificacion;
    private int telefono;
    private String direccion;
    private String correo;
    
    public Entidad(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo){
        nombre = pNombre;
        identificacion = pId;
        telefono = pTelefono;
        direccion = pDireccion;
        correo = pCorreo;
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setId(String pId){
        identificacion = pId;
    }
    
    public String getId(){
        return identificacion;
    }
    
    public void setTelefono(int pTelefono){
        telefono = pTelefono;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public void setDireccion(String pDireccion){
        direccion = pDireccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setCorreo(String pCorreo){
        correo = pCorreo;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String toString(){
        return "Nombre: " + nombre + "\nIdentificación: " + identificacion + 
                "\nTeléfono: " + telefono + "\nDirección: " + direccion + "\nCorreo: " + correo + "\n";
    }
    
}
