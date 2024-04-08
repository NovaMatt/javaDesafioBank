import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombreCliente="Tony Stark";
        String tipoCuenta="Corriente";
        double saldoDisponible=1599.99;
        Scanner teclado = new Scanner(System.in);

        System.out.println(String.format("""
                *******************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f$ 
                
                *******************************
                """,nombreCliente,tipoCuenta,saldoDisponible));




        while (true){
            System.out.println(String.format("""
                ** Escribre el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """));
            int  opcion= teclado.nextInt();
            if (opcion==1){
                System.out.println(String.format("El saldo actualizado es: %.2f $",saldoDisponible));
            }else if(opcion==2){
                System.out.println("Cúal es el valor que deseas retirar? ");
                double montoRetiro= teclado.nextInt();
                if (montoRetiro>saldoDisponible){
                    System.out.println("Saldo insuficiente ");
                }else{
                    saldoDisponible-=montoRetiro;
                    System.out.println(String.format("Saldo restante: %.2f",saldoDisponible));
                }



            }else if(opcion==3){
                System.out.println("Cúal es el monto que vas a depositar? ");
                double montoDeposito=teclado.nextDouble();
                saldoDisponible+=montoDeposito;
                System.out.println(String.format("El saldo actualizado es: %.2f $",saldoDisponible));



            }else if(opcion==9){
                System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                break;
            }else{
                System.out.println("Opción invalida, por favor vuelva a intentarlo");
            }

        }

    }
}
