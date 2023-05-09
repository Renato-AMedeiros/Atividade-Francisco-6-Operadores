/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FazerNoNetbeans;

/**  RENATO AFONSO DE MEDEIROS SILVA  - RGM: 11222100164
 *   ALEXANDRE PEREIRA DE PAULA - RGM: 11222101350
 *
 * 
 */
public class Calculadora {
    
    public static void main (String[] args){
        Operadores op = new Operadores ();
        
        System.out.println ("O Resultado é: "+ op.adicao (10,5));
        
        System.out.println ("O Resultado é: "+ op.subtracao(10,5));
        
        System.out.println ("O Resultado é: "+ op.multiplicacao (10,5));
        
        System.out.println ("O Resultado é: "+ op.divisao(10,5));
        
        System.out.println ("O Resultado é: "+ op.comparar_e(10,5,10,5));
        
        System.out.println ("O Resultado é: "+ op.comparar_ou(10,5,10,5));
        
        System.out.println ("O Resultado é: "+ op.comparar_contrario(10,5,10,5));
        
        System.out.println ("O Resultado é: "+ op.comparar_menorIgual(10,5,10,5));
        
        System.out.println ("O Resultado é: "+ op.comparar_maiorIgual(10,5,10,5));
        
         System.out.println ("O Resultado é: "+ op.atribuicaoMultiplicacao(10,5));
         
         System.out.println ("O Resultado é: "+ op.atribuicaoDivisao(10,5));
         
         System.out.println ("O Resultado é: "+ op.atribuicaoSubtracao(10,5));
         
         System.out.println ("O Resultado é: "+ op.atribuicaoAdicao(10,5));
         
    }
    
}
