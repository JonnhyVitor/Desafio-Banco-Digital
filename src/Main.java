public class Main {
    public static void main(String[] args) {
        //exemplo cliete com nome joao
        Cliente joao = new Cliente();
        joao.setNome("Joao");
        
        Conta cc = new ContaCorrente(joao);
        //exemplo deposito 100
        cc.depositar(100);
        //exemplo saque 20
        cc.sacar(20);

        Conta poupanca = new ContaPoupanca(joao);
        poupanca.depositar(50);
        //exemplo transferencia 20
        cc.trasferir(poupanca, 20);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        

        

    }
}
