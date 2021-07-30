
package ejercicio5;


public class CuentaBancariaApp {

    
    public static void main(String[] args) {
        
       CuentaBancaria cuenta = new CuentaBancaria(50000);
       
       CuentaBancariaServicio servicio = new CuentaBancariaServicio();
       
       servicio.pedirCuenta(cuenta);
       
       servicio.ejecutarOperaciones(cuenta);
    }
}
