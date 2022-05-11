package dio.gof.singleton;

//Singleton "preguiçoso"
//No primeiro momento já não disponibiliza a instacia para o usuario
public class SingletonLazy {

    //Instacia dele mesmo
    private static  SingletonLazy instancia;

    //Garantido que ninguem exerternamente vai instancia o Singleton
    //Deixando privado
    private SingletonLazy() {
        super();
    }

    //Controla sua propria instancia
    //Garantindo que essa intancia vai ser exposta para quem está chamando
    //get instancia retorna a instancia que temos estaticamente
    public  static SingletonLazy getInstancia(){
        //Ela precisa ser instanciada para ser retornada
        if(instancia == null)instancia = new SingletonLazy();
        return instancia;
    }

}
