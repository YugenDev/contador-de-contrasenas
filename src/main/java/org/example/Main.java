package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado=new Scanner(System.in);

        Integer numeroContrasenas;
        Integer numeroLetras;
        String contrasena;
        Integer contadorBueno=0;
        Integer contadorMalo=0;
        Integer contadorIntentos=0;

        System.out.println("digita cuantas contraseñas deseas escribir :");
       numeroContrasenas = entradaTeclado.nextInt();

        do {

            contadorIntentos=contadorIntentos+1;
            System.out.println("Digite la contraseña: ");
            contrasena = entradaTeclado.next();
            Integer contadorLetras=contrasena.length();

            if (contadorLetras>=8){

                contadorBueno=contadorBueno+1;


            } else {

                contadorMalo=contadorMalo+1;


            }

        }while(contadorIntentos<numeroContrasenas);

        System.out.println("numero de contraseñas erradas: "+contadorMalo);
        System.out.println("Numero de contraseñas aceptadas: "+contadorBueno);


    }
}