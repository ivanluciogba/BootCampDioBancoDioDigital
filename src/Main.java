public class Main {

    public static void main(String[] args){
        System.out.println("Seja bem vindo ao BANCO DIO DIGITAL\n");
        
        Cliente ivan = new Cliente();
        ivan.setNome("ivan");
        
        Conta contaC = new ContaCorrente(ivan);
        Conta contaP = new ContaPoucanca(ivan);

        contaC.depositar(3000);
        contaC.depositar(5000);
        contaC.transferir(3000, contaP);
        
        
        contaC.imprimirExtrato();
        contaP.imprimirExtrato();


        System.out.println("Sua transação foi concluida com sucesso!");
    }
    
}
