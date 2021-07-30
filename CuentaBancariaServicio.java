/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

public class CuentaBancariaServicio {

    public void imprimirMenu() {

        System.out.println("¿Qué operación desea realizar?");
        System.out.println("Menú");
        System.out.println("1. Consultar datos de la cuenta");
        System.out.println("2. Consultar Saldo");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Retirar dinero");
        System.out.println("5. Retiro dinero express(hasta un 20% de su saldo)");
        System.out.println("6. Salir");

    }

    public void pedirCuenta(CuentaBancaria cuentaBancaria) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese número de cuenta.");

        cuentaBancaria.setnumeroCuenta(scan.nextInt());

        System.out.println("Ingrese dni.");

        cuentaBancaria.setDNI(scan.nextInt());
    }

    public void consultarSaldo(CuentaBancaria cuentaBancaria) {

        System.out.println("Su sualdo actual es de: " + cuentaBancaria.getsaldoActual());

    }

    public void consultarDatos(CuentaBancaria cuentaBancaria) {

        System.out.println("Su número de cuenta es: " + cuentaBancaria.getnumeroCuenta());

        System.out.println("Su Dni es: " + cuentaBancaria.getDNI());

    }

    public void ingresar(CuentaBancaria cuentaBancaria) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque la cantidad de dinero que desea ingresar.");

        double ingreso = scan.nextDouble();

        double saldoactual1 = cuentaBancaria.getsaldoActual();

        cuentaBancaria.setsaldoActual(saldoactual1 + ingreso);

        System.out.println("El saldo actual ahora es de: " + cuentaBancaria.getsaldoActual());

    }

    public void retirar(CuentaBancaria cuentaBancaria) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque la cantidad de dinero que desea retirar.");

        double retirar = scan.nextDouble();

        double saldoactual2 = cuentaBancaria.getsaldoActual();

        if (saldoactual2 < retirar) {

            System.out.println("La cantidad que desea retirar excede el saldo disponible");

        } else {

            cuentaBancaria.setsaldoActual(saldoactual2 - retirar);

            System.out.println("El saldo actual ahora es de: " + cuentaBancaria.getsaldoActual());

        }
    }

    public void extraccionRapida(CuentaBancaria cuentaBancaria) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque la cantidad de dinero que desea retirar.");

        double retirar = scan.nextDouble();

        double saldoactual = cuentaBancaria.getsaldoActual();

        double porcentajeSaldo = (saldoactual * 20) / 100;

        if (retirar > porcentajeSaldo) {

            System.out.println("Solo se le permite retirar hasta un 20% de su saldo. Por favor ingrese otro monto");

        } else {

            cuentaBancaria.setsaldoActual(saldoactual - retirar);

            System.out.println("El saldo actual ahora es de: " + cuentaBancaria.getsaldoActual());

        }

    }

    public void ejecutarOperaciones(CuentaBancaria cuentaBancaria) {

        Scanner scan = new Scanner(System.in);

        this.imprimirMenu();

        int operacion = scan.nextInt();

        while (operacion >= 1 && operacion <= 5) {

            switch (operacion) {

                case 1:

                    consultarDatos(cuentaBancaria);

                    break;

                case 2:

                    consultarSaldo(cuentaBancaria);

                    break;

                case 3:

                    ingresar(cuentaBancaria);

                    break;

                case 4:

                    retirar(cuentaBancaria);

                    break;

                case 5:

                    extraccionRapida(cuentaBancaria);

                    break;

            }
            imprimirMenu();
            operacion = scan.nextInt();

        }
    }

}
