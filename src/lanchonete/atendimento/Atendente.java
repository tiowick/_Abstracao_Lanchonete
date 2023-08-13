package lanchonete.atendimento;

public class Atendente {
    
    public void servindoMesa() {
        pegarLancheNaCozinha();
        System.out.println("Servindo Mesa...");
    }

    private void pegarLancheNaCozinha() {
        System.out.println("Pegando lanche na cozinha...");
    }

    public void receberPagamento(){
        System.out.println("Recebendo pagamento...");
    }

    void trocarGas(){
        System.out.println("Atendente trocando o gás...");
    }

    private void pegarPedidobalcao(){
        System.out.println("Pegando pedido no balcão...");
    }
}
