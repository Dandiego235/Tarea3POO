package poo.tarea3;

public class Proveedor extends Cliente{
    public Proveedor(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo, pLimite, pFecha);
    }

    public String toString(){
        String texto = super.toString();
        return texto;
    }
}
