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
public class Operadores {
    
    
    public float adicao (float v1, float v2){
        return v1 + v2;
        
    }
     public float subtracao(float v1, float v2){
        return v1 - v2;
        
    }
     public float multiplicacao (float v1, float v2){
        return v1 * v2;
        
    }
     public float divisao (float v1, float v2){
        return v1 - v2;
        
    }
    
    
     public boolean comparar_e ( float v1, float v2, float v3, float v4)
     {
         
         if ( v1 == v2 && v3 == v4)
         {
             
             return true;
         }
         else 
         {
         return false;
         }
     }
     
     public boolean comparar_ou( float v1, float v2, float v3, float v4)
     {
         
         if ( v1 == v2 || v3 == v4)
         {
             
             return true;
         }
         else 
         {
         return false;
         }
     }
     
     
      public boolean comparar_contrario( float v1, float v2, float v3, float v4)
     {
         
         if ( v1 + v2 != v3 + v4)
         {
             
             return true;
         }
         else 
         {
         return false;
         }
     }
     
       public boolean comparar_menorIgual( float v1, float v2, float v3, float v4)
     {
         
         if ( v1 + v2 <= v3 + v4)
         {
             
             return true;
         }
         else 
         {
         return false;
         }
     }
      public boolean comparar_maiorIgual( float v1, float v2, float v3, float v4)
    {
         
         if ( v1 - v2 >= v3 - v4)
         {
             
             return true;
         }
         else 
         {
         return false;
         }
            
    }
       
      public float atribuicaoMultiplicacao(float v1, float v2) 
      {
        v1 *= v2;
         return v1;
      }
    
      public float atribuicaoDivisao(float v1, float v2) 
      {
         v1 /= v2;
           return v1;
      }
      
      public float atribuicaoSubtracao(float v1, float v2)
      {
         v1 -= v2;
            return v1;
      }
      
      public float atribuicaoAdicao(float v1, float v2)
      {
         v1 += v2;
             return v1;
      }
      
}
