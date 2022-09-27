package poo.tarea3;

import java.util.ArrayList;

public class Empresa extends Entidad {
    private ArrayList<Empleado> empleados; // Donde se van a almacenar los empleados
    private ArrayList<Cliente> clientes;  // Donde se van a almacenar los clientes personas
    private ArrayList<Proveedor> proveedores; // Donde se van a almacenar los proveedores personas
    private ArrayList<ProveedorEmpresa> proveedoresempresa; // Donde se van a almacenar los proveedores empresas
    private ArrayList<ClienteEmpresa> clientesempresa; // Donde se van a almacenar los clientes empresas

    // Función: Crea el objeto de la empresa. 
    // Entrada: Recibe los parámetros de la empresa y los parámetros para crear el primer empleado de la empresa:
    // Salida: nada
    public Empresa(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, String pNombreE, String pIdE, int pTelefonoE, String pDireccionE, String pCorreoE, int pSalarioE, String pFechaE){
        super( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo);
        empleados = new ArrayList<Empleado>();
        clientes = new ArrayList<Cliente>();
        proveedores = new ArrayList<Proveedor>();
        proveedoresempresa = new ArrayList<ProveedorEmpresa>();
        clientesempresa = new ArrayList<ClienteEmpresa>();

        // Se incluye la información de un empleado porque consideramos que una empresa necesita tener por lo menos un empleado para poder operar.
        incluirEmpleado( pNombreE,  pIdE,  pTelefonoE,  pDireccionE,  pCorreoE,  pSalarioE,  pFechaE);
    }

    // Función: incluye el cliente en la lista
    // Entrada: recibe los parámetros del cliente
    // Salida: nada
    public void incluirCliente(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha){
        // como en nuestro diagrama es una relación de composición, se crea el objeto en la misma clase.
        Cliente cliente = new Cliente( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo,  pLimite,  pFecha);
        clientes.add(cliente); // Se añade a lalista
    }

    // Función: incluye el cliente empresa en la lista
    // Entrada: recibe los parámetros del cliente Empresa
    // Salida: nada
    public void incluirCliente(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, String pNombreContacto, int pTelefonoContacto){
        // como en nuestro diagrama es una relación de composición, se crea el objeto en la misma clase.
        ClienteEmpresa cliente = new ClienteEmpresa(pNombre,  pId,  pTelefono,  pDireccion,  pCorreo,  pLimite,  pFecha, pNombreContacto,  pTelefonoContacto);
        clientesempresa.add(cliente); // Se añade a la lista
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

    // Función: modifica el cliente empresa
    // Entrada: recibe la identificación del cliente empresa y los parámetros a modificar
    // Salida: Nada
    // Restricciones: si los valores se pasan en "" o 0, no se modifican.
    public void modificarCliente(String identificacion, String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, String pNombreContacto, int pTelefonoContacto){
        for (ClienteEmpresa clienteempresa : clientesempresa){
            if (clienteempresa.getId() == identificacion){
                if (!pNombre.equals("")){
                    clienteempresa.setNombre(pNombre);
                }
                if (!pId.equals("")){
                    clienteempresa.setId(pId);
                }
                if (pTelefono != 0){
                    clienteempresa.setTelefono(pTelefono);
                }
                if (!pDireccion.equals("")){
                    clienteempresa.setDireccion(pDireccion);
                }
                if (!pCorreo.equals("")){
                    clienteempresa.setCorreo(pCorreo);
                }
                if (pLimite != 0){
                    clienteempresa.setLimite(pLimite);
                }
                if (!pFecha.equals("")){
                    clienteempresa.setFecha(pFecha);
                }
                if (!pNombreContacto.equals("")){
                    clienteempresa.setNombreContacto(pNombreContacto);
                }
                if (pTelefonoContacto != 0){
                    clienteempresa.setTelefonoContacto(pTelefonoContacto);
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
    public void incluirProveedor(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha){
        Proveedor proveedor = new Proveedor( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo,  pLimite,  pFecha);
        proveedores.add(proveedor);
    }

    // Función: añade un proveedor a la lista
    // Entrada: recibe los parámteros del proveedor empresa
    // Salida: Nada
    public void incluirProveedor(String pNombre, String pId, int pTelefono, String pDireccion, String pCorreo, int pLimite, String pFecha, String pNombreContacto, int pTelefonoContacto){
        ProveedorEmpresa proveedorempresa = new ProveedorEmpresa( pNombre,  pId,  pTelefono,  pDireccion,  pCorreo,  pLimite,  pFecha, pNombreContacto, pTelefonoContacto);
        proveedoresempresa.add(proveedorempresa);
    }

    // Función: Despliega los clientes
    // Entrada: Nada
    // Salida: Nada
    public void desplegarClientes(){
        for (Cliente cliente : clientes){
            System.out.println(cliente);
        }
        for (ClienteEmpresa clienteempresa : clientesempresa){
            System.out.println(clienteempresa);
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
        for (ProveedorEmpresa proveedorempresa : proveedoresempresa){
            System.out.println(proveedorempresa);
        }
    }

    // Función: Despliega la cantidad de clientes
    // Entrada: nada
    // Salida: nada
    public void desplegarCantidadClientes(){
        System.out.println("Cantidad de clientes: " + (clientes.size()+clientesempresa.size()));
        System.out.println("Cantidad de clientes que son personas: " + clientes.size());
        System.out.println("Cantidad de clientes que son empresas: " + clientesempresa.size());
    }

    // Función: despliega la cantidad de proveedores
    // Entrada: nada 
    // Salida: nada
    public void desplegarCantidadProveedores(){
        System.out.println("Cantidad de proveedores: " + (proveedores.size() + proveedoresempresa.size()));
        System.out.println("Cantidad de proveedores que son personas: " + proveedores.size());
        System.out.println("Cantidad de proveedores que son empresas: " + proveedoresempresa.size());
    }
}
