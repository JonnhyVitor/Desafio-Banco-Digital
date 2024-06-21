public interface Iconta {
   
    void sacar(double valor);
		   
    void depositar(double valor);
                     
    void trasferir(Conta contaDestino, double valor);
      
    void imprimirExtrato();
}
