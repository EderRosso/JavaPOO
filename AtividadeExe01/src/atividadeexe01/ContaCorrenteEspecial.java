
package atividadeexe01;

public class ContaCorrenteEspecial extends ContaCorrente{
    
    @Override
    public void relazarSaque (double qtdSaque){
        qtdSaque += qtdSaque * 0.001;
        if(saldo >= qtdSaque){
            this.saldo -= qtdSaque;
        }
        else{
            System.out.println("Saldo insuficiente!!!");
        }
    }
    
}
