package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.*;
import subsistema1.crm.CrmService;

public class Main {
    public static void main(String[] args) {
        //Não conseguimos dar o new, instanciar o objeto
        // SingletonLazy lazy = new SingletonLazy();
        //Testes relacionados ao Design Patterns Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager= SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        System.out.println("\n");

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Bruna", "109586");




    }
}
