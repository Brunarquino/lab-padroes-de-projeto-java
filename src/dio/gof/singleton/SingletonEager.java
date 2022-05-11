package dio.gof.singleton;

//Singleton "apressado"

public class SingletonEager {
    // Atribui a instancia já na criação da variavel estatica
    //Já está pronta para instanciar
    private static  SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public  static SingletonEager getInstancia(){
        return instancia;
    }
}
