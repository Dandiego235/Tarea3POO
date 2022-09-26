package poo.tarea3;

import java.util.ArrayList;

public class Empresa extends Entidad {
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;
    public Empresa(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, String pNombreE, String pIdE, int pTelefonoE, String pDireccionE, String pCorreoE, int pSalarioE, String pFechaE){
        super( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo);
        empleados = new ArrayList<Empleado>();
        Empleado owner = new Empleado( pNombreE,  pIdE,  pTelefonoE,  pDireccionE,  pCorreoE,  pSalarioE,  pFechaE);
        incluirEmpleado(owner);
    }

    public void incluirCliente(Cliente pCliente){
        clientes.add(pCliente);
    }

    public void modificarCliente(String identificacion, String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha){
        for (Cliente cliente : clientes){
            if (cliente.getId() == identificacion){
                if (!pNombre.equals("")){
                    cliente.setNombre(pNombre);
                }
                if (!pId.equals("")){
                    cliente.setId(pId);
                }
                if (pTelefono != 0){
                    cliente.setTelefono(pTelefono);
                }
                if (!pDireccion.equals("")){
                    cliente.setDireccion(pDireccion);
                }
                if (!pCorreo.equals("")){
                    cliente.setCorreo(pCorreo);
                }
                if (pLimite != 0){
                    cliente.setLimite(pLimite);
                }
                if (!pFecha.equals("")){
                    cliente.setFecha(pFecha);
                }
                break;
            }
        }
    }

    public void incluirEmpleado(Empleado pEmpleado){
        empleados.add(pEmpleado);
    }

    public void incluirProveedor(Proveedor pProveedor){
        proveedores.add(pProveedor);
    }

    public void desplegarClientes(){
        for (Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }

    public void desplegarEmpleados(){
        for (Empleado empleado : empleados){
            System.out.println(empleado);
        }
    }

    public void desplegarProveedores(){
        for (Proveedor proveedor : proveedores){
            System.out.println(proveedor);
        }
    }

    public void desplegarCantidadClientes(){
        System.out.println("Cantidad de clientes: " + clientes.size());
    }

    public void desplegarCantidadProveedores(){
        System.out.println("Cantidad de proveedores: " + proveedores.size());
    }
}
