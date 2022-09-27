package poo.tarea3;

import java.util.ArrayList;

public class Empresa extends Entidad {
    private ArrayList<Empleado> empleados; // Donde se van a almacenar los empleados
    private ArrayList<Cliente> clientes;  // Donde se van a almacenar los clientes
    private ArrayList<Proveedor> proveedores; // Donde se van a almacenar los proveedores

    // Función: Crea el objeto de la empresa. 
    // Entrada: Recibe los parámetros de la empresa:
    // Salida: nada
    public Empresa(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, String pNombreE, String pIdE, int pTelefonoE, String pDireccionE, String pCorreoE, int pSalarioE, String pFechaE){
        super( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo);
        empleados = new ArrayList<Empleado>();
        clientes = new ArrayList<Cliente>();
        proveedores = new ArrayList<Proveedor>();
        incluirEmpleado( pNombreE,  pIdE,  pTelefonoE,  pDireccionE,  pCorreoE,  pSalarioE,  pFechaE);
    }

    // Función: incluye el cliente en la lista
    // Entrada: recibe los parámetros del cliente
    // Salida: nada
    public void incluirCliente(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, boolean pTipo){
        // como en nuestro diagrama es una relación de composición, se crea el objeto en la misma clase.
        Cliente cliente = new Cliente( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo,  pLimite,  pFecha,  pTipo);
        clientes.add(cliente); // Se añade a lalista
    }

    // Función: modifica el cliente
    // Entrada: recibe la identificación del cliente y los parámetros a modificar
    // Salida: Nada
    // Restricciones: si los valores se pasan en "" o 0, no se modifican.
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

    // Función: añade un empleado a la lista
    // Entrada: Recibe los parámetros del empleado
    // Salida: nada
    public void incluirEmpleado(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pSalario, String pFecha){
        Empleado empleado = new Empleado(pNombre,  pId,  pTelefono,  pDireccion,  pCorreo,  pSalario,  pFecha);
        empleados.add(empleado);
    }

    // Función: añade un proveedor a la lista
    // Entrada: recibe los parámteros del proveedor
    // Salida: Nada
    public void incluirProveedor(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, boolean pTipo){
        Proveedor proveedor = new Proveedor( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo,  pLimite,  pFecha,  pTipo);
        proveedores.add(proveedor);
    }

    // Función: Despliega los clientes
    // Entrada: Nada
    // Salida: Nada
    public void desplegarClientes(){
        for (Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }

    // Función: Despliega los empleados
    // Entrada: Nada
    // Salida: Nada
    public void desplegarEmpleados(){
        for (Empleado empleado : empleados){
            System.out.println(empleado);
        }
    }

    // Función: despliega los proveedores
    // Entrada: nada
    // Salida: nada
    public void desplegarProveedores(){
        for (Proveedor proveedor : proveedores){
            System.out.println(proveedor);
        }
    }

    // Función: Despliega la cantidad de clientes
    // Entrada: nada
    // Salida: nada
    public void desplegarCantidadClientes(){
        int cantidadPersonas = 0;
        int cantidadEmpresas = 0;
        for (Cliente cliente : clientes){
            if (cliente.getTipo()){
                cantidadEmpresas++;
            } else {
                cantidadPersonas++;
            }
        }
        System.out.println("Cantidad de clientes: " + clientes.size());
        System.out.println("Cantidad de clientes que son personas: " + cantidadPersonas);
        System.out.println("Cantidad de clientes que son empresas: " + cantidadEmpresas);
    }

    // Función: despliega la cantidad de proveedores
    // Entrada: nada 
    // Salida: nada
    public void desplegarCantidadProveedores(){
        int cantidadPersonas = 0;
        int cantidadEmpresas = 0;
        for (Proveedor proveedor : proveedores){
            if (proveedor.getTipo()){
                cantidadEmpresas++;
            } else {
                cantidadPersonas++;
            }
        }
        System.out.println("Cantidad de proveedores: " + proveedores.size());
        System.out.println("Cantidad de proveedores que son personas: " + cantidadPersonas);
        System.out.println("Cantidad de proveedores que son empresas: " + cantidadEmpresas);
    }
}
