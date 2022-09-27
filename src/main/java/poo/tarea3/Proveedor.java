package poo.tarea3;

public class Proveedor extends Cliente{
    // Función: Crea el objeto del proveedor
    // Entrada: los parámetros del proveedor
    // Salida: nada
    public Proveedor(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, boolean pTipo){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo, pLimite, pFecha, pTipo);
    }
}
