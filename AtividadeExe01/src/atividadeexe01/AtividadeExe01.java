/*1) Crie uma classe para representar uma conta-corrente,
com métodos para depositar uma quantia, sacar uma quantia 
e obter o saldo. Para cada saque será debitada também uma 
taxa de operação equivalente à 0,5% do valor sacado.
Crie, em seguida, uma subclasse desta classe anterior para
representar uma conta-corrente de um cliente especial. 
Clientes especiais pagam taxas de operação de apenas 0,1% 
do valor sacado. Faça testes com as duas classes e 
verifique seus resultados.
*/

package atividadeexe01;

public class AtividadeExe01 {


    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrenteEspecial cs1 = new ContaCorrenteEspecial();
        
        c1.relalizarDeposito(40);        
        c1.consultaSaldo();
        
        c1.relazarSaque(20);
        c1.consultaSaldo();
        
        cs1.relalizarDeposito(40);
        cs1.consultaSaldo();
        
        cs1.relazarSaque(20);
        cs1.consultaSaldo();
        
        
    }
    
}
