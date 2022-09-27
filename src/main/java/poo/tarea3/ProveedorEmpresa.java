package poo.tarea3;

public class ProveedorEmpresa extends ClienteEmpresa{
    // Función: Crea el objeto del proveedor empresa
    // Entrada: los parámetros del proveedor empresa
    // Salida: nada
    public ProveedorEmpresa(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, String pNombreCont, int pTelCont){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo, pLimite, pFecha, pNombreCont, pTelCont);    
    }
}