package dio.gof.singleton;

//Singleton "Lazy Holder"

public class SingletonLazyHolder {

    //Criando uma nova classe
    //Instancia dentro de um Holder
    //Encapusulando a instancia em uma classe estatica interna
    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder(); //intancia publica para conseguir acessar
    }
    //tudo tem controler static em um Singleton


    private SingletonLazyHolder() {
        super();
    }

    public  static SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    } //Instanciar pelo holder
}
