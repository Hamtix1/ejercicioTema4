// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Ciclo If
        System.out.println("Condicional IF");
        int numerolf=0;
        if(numerolf>0){
            System.out.println("El numero es Positivo");
        } else if (numerolf<0) {
            System.out.println("El numero es Negativo");
        }else{
            System.out.println("El numero Es Cero");
        }

        //Ciclo While
        int numeroWhile=0;
        System.out.println("\n\nCiclo While");
        while(numeroWhile<3){
            System.out.println("numeroWhile = "+numeroWhile);
            numeroWhile++;
        }

        //Ciclo do While ejecutado una sola vez
        System.out.println("\n\nCiclo do While");
        do{
            System.out.println("numeroWhile = "+numeroWhile);
            numeroWhile++;
        }while(numeroWhile<1);

        //Ciclo for
        System.out.println("\n\nCiclo For");
        int numeroFor=0;
        for(numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("numeroWhile = "+numeroFor);
        }

        //Switch Case
        System.out.println("\n\nSwitch Case");
        int estacion=4;
        switch(estacion){
            case 1:  System.out.println("Es Primavera");break;
            case 2:  System.out.println("Es Verano");break;
            case 3:  System.out.println("Es Otoño");break;
            case 4:  System.out.println("Es Invierno");break;
            default:  System.out.println("No es ninguna estación");break;
        }
    }
}