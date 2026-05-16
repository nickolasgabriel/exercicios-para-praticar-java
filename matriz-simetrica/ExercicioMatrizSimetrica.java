package estudos.logicaProgramacao;
import java.util.Scanner;

public class ExercicioMatrizSimetrica {
    public static void main(String[] args) {
        Scanner definirMatriz = new Scanner(System.in);
        System.out.print("Digite o número de linhas que essa matriz ira possuir: ");
        int l = definirMatriz.nextInt();
        System.out.print("Digite o número de colunas que essa matriz ira possuir: ");
        int c = definirMatriz.nextInt();

        int[][] arrMatriz = new int[l][c];
        int contLinha=0, contColuna=0, verificador=0;

        //adicionar valores na matriz
        for (int i = 0; i < arrMatriz.length; i++) {
            for (int j = 0; j < arrMatriz[i].length; j++) {
                arrMatriz[i][j] = 2;
            }
        }

        //conferir se o número de linhas e colunas é o mesmo
        for (int i = 0; i < arrMatriz.length; i++) {
            for (int j = 0; j < arrMatriz[i].length; j++) {
                if(verificador==0){
                    contColuna++;
                }
            }
            contLinha++;
            verificador++;
        }

        //conferir se os elementos das linhas são iguais aos elementos das colunas
        if (contLinha == contColuna){
            verificador = 0;
            for (int i = 0; i < arrMatriz.length; i++) {
                for (int j = 0; j < arrMatriz[i].length; j++) {
                    if (arrMatriz[i][j] != arrMatriz[j][i]){
                        verificador++;
                    }
                }
            }
            if (verificador == 0){
                System.out.println("Essa é uma matriz simétrica");
            }else{
                System.out.println("Essa matriz não é simétrica!");
            }
        }else{
            System.out.println("Essa matriz não é simétrica!");
        }

    }
}
