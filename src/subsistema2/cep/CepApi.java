package subsistema2.cep;

import dio.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public  static CepApi getInstancia(){
        return instancia;
    }

    public String recuperCidade(String cep){
        return "Hortolândia";
    }

    public String recuperEstado(String cep){
        return "São Paulo";
    }

}
