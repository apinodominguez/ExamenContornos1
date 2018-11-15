package factorial;

public class Factorial {

    public static void main(String[] args) {

    int num = 8, contador, i; //declaración de variables
     
   if (num == 0)
        contador = 1;
   
   else{
        contador = 1;
        for (i = num; i >= 1; i--){
        contador = contador * i;
        }
   }    
  
 System.out.println(contador); 

   }
    
}