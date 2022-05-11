package dio.gof.strategy;

public class Robo {

    //comportamento do robo, estrategia de comportamento pro robo
    private  Comportamento strategy;

    //Se o robo quiser musar de estrategia
    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    //Garantir que meu robo consiga se mover

    public void mover(){
        //Delegar a responsabilidade de movimentação para nossa strategy
        strategy.mover();
    }


}
