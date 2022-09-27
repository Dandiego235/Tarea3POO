/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.tarea3;

/**
 *
 * @author Daniel Granados Retana y Diego Granados Retana
 *  Tarea 3: Programación Orientada a Objetos
 * 26 de setiembre, 2022
 */
public class Tarea3 {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("PersonAlly", "12345", 22412093, "San José", "admin@personally.com", 
        "Daniel Granados", "11879", 88888888, "Curridabat","daniel.granados@personally.com", 10000, "25/09/2022");
        
        empresa.incluirEmpleado("Diego Granados", "10545", 11111111, "Curridabat", "diego.granados@personally.com", 1000, "25/09/2022");
        empresa.incluirEmpleado("Tomás Antillón", "10293", 22222222, "Escazú", "tomas.antillon@personally.com", 1500, "26/09/2022");
        empresa.incluirEmpleado("Ricardo Vargas", "13562", 333333333, "San Pedro", "ricardo.vargas@personally.com", 2000, "31/09/2022");
        empresa.incluirEmpleado("Ori Babich", "17465", 44444444, "San Petersburgo", "ori.babich@personally.com", 1500, "02/10/2022");
        empresa.incluirEmpleado("William Mata", "23612", 55555555, "Cartago", "william.mata@personally.com", 15000, "10/10/2022");
        
        empresa.incluirCliente("Tecnológico de Costa Rica", "99999", 22212352, "Cartago", "cliente@itcr.ac.cr", 10000, "26/09/2022", "Manuel Granados", 46288431);
        empresa.incluirCliente("Apple", "34567", 72345987, "Cupertino", "sales@apple.com", 500000, "27/09/2022", "Diego Retana", 10768724);
        empresa.incluirCliente("David Navas", "73412", 66666666, "Tres Ríos", "davnav@gmail.com", 25000, "26/09/2022");
        empresa.incluirCliente("Javier Sánchez", "35821", 77777777, "Santa Ana", "lexjavfire@itcr.ac.cr", 1000, "26/09/2022");
        
        empresa.modificarCliente("35821", "", "", 0, "", "jav.sanchez@gmail.com", 0, "");
        empresa.modificarCliente("34567", "", "49851", 0, "", "timcook@apple.com", 1000000, "", "Tim Cook", 45923452);

        empresa.incluirProveedor("María Solano", "28336", 72564890, "Cartago", "marsol@gmail.com", 12000, "26/09/2022");
        empresa.incluirProveedor("Google", "93257", 12360984, "Silicon Valley", "providers@google.com", 1000000, "30/09/2022", "Margarita Corrales", 89230324);
        empresa.incluirProveedor("Gabriela Chaves", "89279", 23465647, "Heredia", "gabchav@yahoo.com", 25000, "15/10/2022");
        empresa.incluirProveedor("Wix", "46722", 88888888, "Londres", "business@wix.com", 3000, "20/11/2022", "Avishai Abrahami", 72946103);
        
        System.out.println("Registros de empleados: ");
        empresa.desplegarEmpleados();
        
        System.out.println("Registros de clientes: ");
        empresa.desplegarClientes();
        
        System.out.println("Registros de proveedores: ");
        empresa.desplegarProveedores();
        
        System.out.println("Cantidad de clientes: ");
        empresa.desplegarCantidadClientes();
        System.out.println("\n");
        
        System.out.println("Cantidad de proveedores: ");
        empresa.desplegarCantidadProveedores();
    }
}
