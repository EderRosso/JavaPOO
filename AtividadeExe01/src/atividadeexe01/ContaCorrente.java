
package atividadeexe01;

public class ContaCorrente {
    protected double saldo;
    
    
    public void relazarSaque (double qtdSaque){
        qtdSaque += qtdSaque * 0.005;
        if(saldo >= qtdSaque){
            this.saldo -= qtdSaque;
        }
        else{
            System.out.println("Saldo insuficiente!!!");
        }
    }
    
    
    public void relalizarDeposito (double deposito){
        this.saldo += deposito;
    }

    public void consultaSaldo(){
        System.out.println("Saldo atual = " + saldo);
    }
    
    
    
}
