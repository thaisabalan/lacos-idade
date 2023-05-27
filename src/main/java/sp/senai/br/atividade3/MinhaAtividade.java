/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.atividade3;

import java.util.Scanner;
public class MinhaAtividade {
    public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
                
                int maior = 0;
                int menor = 999999999;
                int mD, pM = 0, pm;
                
                System.out.println("Digite nove idades desejadas: \n");
                
                int[] idade = new int[9];
                
                for(int i = 0; i < 9; i++){
                    idade[i] = teclado.nextInt();
                    if(idade[i] > maior) {
                        maior = idade[i];
                        
                    }
                    if(idade[i] < menor){
                        menor = idade[i];
                    }
                }
                
                mD = maior - menor;
                
                System.out.println("Sua maior idade e: " + maior);
                System.out.println("Sua menor idade e: " + menor);
                System.out.println("Sua maior diferença e:" + mD);
                
    }
}