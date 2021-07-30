
package ejercicio5;


public class CuentaBancaria {
    
    private int numeroCuenta;
    private int DNI;
    private double saldoActual;
    
    public CuentaBancaria(){
        saldoActual= 10000;
    }
    
    public CuentaBancaria(double saldoActual) {
        
        this.saldoActual= saldoActual;
    }

    public CuentaBancaria(int numeroCuenta, int DNI, double saldoActual) {
        
        this.numeroCuenta = numeroCuenta;
        
        this.DNI = DNI;
        
        this.saldoActual = saldoActual;
    }
    
    
    public int getnumeroCuenta() {
        return this.numeroCuenta;
    }
    
     public void setnumeroCuenta(int numeroCuenta) {
         this.numeroCuenta = numeroCuenta;
    }
    
    public int getDNI() {
        return this.DNI;
    }
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
     
    public double getsaldoActual() {
        return this.saldoActual;
    }
    
    public void setsaldoActual(double saldoActual) {
        this.saldoActual= saldoActual;
    }
    
}
