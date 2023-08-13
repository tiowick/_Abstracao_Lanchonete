package lanchonete.area_cliente;

public class Cliente {

    public void escolherLanche(){
        System.out.println("Escolhendo lanche...");
    }

    public void fazerPedido(){
        System.out.println("Fazendo o pedido....");
    }

    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pagando a conta...");
    }

    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo no app...");
    }
    
}
