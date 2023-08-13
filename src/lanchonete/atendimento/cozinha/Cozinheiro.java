package lanchonete.atendimento.cozinha;


public class Cozinheiro {
    
    public void adicionarLancheNoBalcao(){
        System.out.println("Adiconando lanche natural x-burguer no balcão.");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão.");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando lanche tipo x-burguer...");
    }

    private void preparaVitamina(){
        System.out.println("Preparando Suco...");
    }

    private void prepararCombo(){
        prepararLanche();
        preparaVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, carne");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Fruta, leite e suco.");
    }
    
    private void lavarIngredientes(){
        System.out.println("Lavando os Ingredientes...");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no Liquidificador...");
    }

    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o hamburguer");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirParaTrocarIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
