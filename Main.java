import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner entrada = new Scanner(System.in);
        String numero = entrada.nextLine();
        int contador = numero.length();
        if (contador == 5) {
            System.out.println("Apenas numeros entre 0 e 9999!!!!");
            System.exit(0);
        } else if (contador == 1) {
            int d1 = numero.charAt(0) - '0';
            String num = unidade(d1);
            System.out.println(num);
        } else if (contador == 2) {
            int d1 = numero.charAt(0) - '0';
            int d2 = numero.charAt(1) - '0';
            if (d1 == 1) {
                String num = chato(d2);
                System.out.println(num);
            } else {
                String numd = dezena(d1);
                String numu = unidade(d2);
                if (d2 == 0){
                    System.out.println(numd);
                } else {
                    System.out.println(numd + " e " + numu);
                }
            }
        } else if (contador == 3) {
            int d1 = numero.charAt(0) - '0';
            int d2 = numero.charAt(1) - '0';
            int d3 = numero.charAt(2) - '0';
            if (d1 == 1 && d2 == 0 && d3 == 0) {
                System.out.println("cem");
            } else if (d2 == 0 && d3 == 0) {
                String numc = centena(d1);
                System.out.println(numc);
            } else if (d3 == 0) {
                String numc = centena(d1);
                String numd = dezena(d2);
                String numu = unidade(d3);
                System.out.println(numc + " e " + numd);
            } else if (d2 == 1) {
                String numc = centena(d1);
                String numd = chato(d3);
                System.out.println(numc + " e " + numd);
            } else {
                String numc = centena(d1);
                String numd = dezena(d2);
                String numu = unidade(d3);
                System.out.println(numc + " e " + numd + " e " + numu);
            }
        } else if (contador == 4) {
            int d1 = numero.charAt(0) - '0';
            int d2 = numero.charAt(1) - '0';
            int d3 = numero.charAt(2) - '0';
            int d4 = numero.charAt(3) - '0';
            String mil = "mil";
            if (d1 == 1 && d2 == 0 && d3 == 0 && d4 == 0) {
                System.out.println(mil);
            } else if (d2 == 0 && d3 == 0 && d4 == 0) {
                String numm = unidade(d1);
                System.out.println(numm + " " + mil);
            } else if (d3 == 0 && d4 == 0) {
                String numm = unidade(d1);
                String numc = centena(d2);
                if (d1 == 1 && d2 == 1) {
                    System.out.println(mil + " e " + "cem");
                    System.exit(0);
                } else if (d1 == 1){
                    System.out.println(mil + " e " + numc);
                }else if (d2 == 1){
                    System.out.println(numm + " " + mil + " e " + "cem");
                } else{
                    System.out.println(numm + " " + mil + " e " + numc);
                }
            } else if (d3 != 1 && d4 == 0) {
                String numm = unidade(d1);
                String numc = centena(d2);
                String numd = dezena(d3);
                if (d1 == 1){
                    System.out.println(mil + " " + numc + " e " + numd);
                } else {
                    System.out.println(numm + " " + mil + " " + numc + " e " + numd);
                }
            } else if (d3 == 1 && d4 == 0) {
                String numm = unidade(d1);
                String numc = centena(d2);
                String numd = chato(d4);
                if (d1 == 1) {
                    System.out.println(mil + " " + numc + " e " + numd);
                } else {
                    System.out.println(numm + " " + mil + " " + numc + " e " + numd);
                }
            } else {
                String numm = unidade(d1);
                String numc = centena(d2);
                String numd = dezena(d3);
                String numu = unidade(d4);
                if (d1 == 1) {
                    System.out.println(mil + " " + numc + " e " + numd + " e " + numu);
                } else {
                    System.out.println(numm + " " + mil + " " + numc + " e " + numd + " e " + numu);
                }
            }
        }
    }

    private static String centena(int x) {
        return switch (x) {
            case 1 -> "cento";
            case 2 -> "duzentos";
            case 3 -> "trezentos";
            case 4 -> "quatrocentos";
            case 5 -> "quinhentos";
            case 6 -> "seiscentos";
            case 7 -> "setecentos";
            case 8 -> "oitocentos";
            case 9 -> "novecentos";
            default -> "";
        };
    }

    private static String dezena(int x) {
        return switch (x){
            case 2 -> "vinte";
            case 3 -> "trinta";
            case 4 -> "quarenta";
            case 5 -> "cinquenta";
            case 6 -> "sessenta";
            case 7 -> "setenta";
            case 8 -> "oitenta";
            case 9 -> "noventa";
            default -> "";
        };
    }

    private static String chato(int x) {
        return switch (x){
            case 0 -> "dez";
            case 1 -> "onze";
            case 2 -> "doze";
            case 3 -> "treze";
            case 4 -> "quatorze";
            case 5 -> "quinze";
            case 6 -> "dezesseis";
            case 7 -> "dezessete";
            case 8 -> "dezoito";
            case 9 -> "dezenove";
            default -> "";
        };
    }

    private static String unidade(int x) {
        return switch (x) {
            case 0 -> "zero";
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "tres";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            default -> "";
        };
    }
}