public abstract class Conta implements Iconta {
   
    private static final int AGENCIA_PADRAO = 4000;

    private static  int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void depositar(double valor) {
          saldo += valor;
    }

    @Override
    public void sacar(double valor) {
           saldo -= valor;
    }

    @Override
    public void trasferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
            
    }

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

   
    
   
  public int getAgencia() {
      return agencia;
  }
  
  public int getNumero() {
      return numero;
  }
  
  public double getSaldo() {
      return saldo;
  }	

  protected void imprimirInfosComuns () {

    System.out.println(String.format ("CPF: %s ", this.cliente.getCpf()));
    System.out.println(String.format ("Titular: %s ", this.cliente.getNome()));
    System.out.println(String.format ("numero: %d ", this.numero));
    System.out.println(String.format ("Agencia: %d ", this.agencia));
    System.out.println(String.format ("Saldo R$: %.2f ", this.saldo));
}


public static int getAgenciaPadrao() {
    return AGENCIA_PADRAO;
}


public static int getSEQUENCIAL() {
    return SEQUENCIAL;
}


public static void setSEQUENCIAL(int sEQUENCIAL) {
    SEQUENCIAL = sEQUENCIAL;
}


public void setAgencia(int agencia) {
    this.agencia = agencia;
}


public void setNumero(int numero) {
    this.numero = numero;
}


public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public Cliente getCliente(){
    return cliente;
}


public void setCliente(Cliente cliente){
    this.cliente = cliente;
}

}
