package poo.tarea3;

public class Proveedor extends Cliente{
    public Proveedor(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, boolean pTipo){
        super(pNombre, pId, pTelefono, pDireccion, pCorreo, pLimite, pFecha, pTipo);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
