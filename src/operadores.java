public class operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        // aqui vai somar os 3 primeiros e concatenar com o ultimo número

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        //já aqui vai concatenar tudo

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        // também concatena tudo 

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        //também concatena tudo 


        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        /*
         já nesse o compilador primeiro executa oq está dentro dos parensetes
         e depois o que está fora: soma os 3 primeiros números e depois concatena com o que está fora dos parensteses
         */ 


        int numerro = 5;
        numerro++;
        //numerro= numerro + 1;

        System.out.println(numerro);
    /*quando coloca o simbolo" ++ " é de incremento  
    é a mesma coisa de você colocar "numero = numero +1" vai adicionar 1 no caso
    


    */
    //operador ternario
    int a,b;

    a=5;
    b=6;


    
      /*if(a==b)
       resultado = "verdadeiro";
      else
       resultado = "falso";
       dessa forma esta certa, mas tem um jeito de resumir esse codigo
       */

        String resultado = a==b ?"verdadeiro" : "falso";
        /*se o resultado for igual vai imprimir verdadeiro que é representado pelo ?
        se o resultado for diferente vai imprimir falso que é representado pelo :
        expressao SE = ?
        expressao SE NAO = :
         */

       System.out.println(resultado);
      
     //OPERADORES RELACIONAIS
     int numero1 = 1;
     int numero2 = 2;

     boolean simNo = numero1 == numero2;
     System.out.println("numeroUm é igual a numeroDois?" + simNo);

    simNo = numero1 != numero2;
     System.out.println("numeroUm é DIFERENTE a numeroDois?" + simNo);

     simNo = numero1 > numero2;
     System.out.println("numeroUm é MAIOR a numeroDois?" + simNo);

     //operadores logicos 
     //&& operador logico "E"
     //|| operador logico "ou"
     boolean condicao1 = true;
     boolean condicao2 = false;

     if(condicao1 && condicao2){
        System.out.println("as duas condiçoes sao verdadeiras");
     }
      if(condicao1 || condicao2){
        System.out.println("Uma duas condiçoes sao verdadeiras");
    }
     System.out.println("fim");









    
    
    
    }
}
