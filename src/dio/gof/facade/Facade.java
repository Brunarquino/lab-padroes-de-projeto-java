package dio.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

// Dentro dela realize operações para consolidar ou expor um interface mais simples para um operação mais completa
public class Facade {

    public void migrarCliente(String nome, String cep) {

        String cidade = CepApi.getInstancia().recuperCidade(cep);
        String estado = CepApi.getInstancia().recuperEstado(cep);

        CrmService.gravarcliente(nome, cep, cidade, estado);


    }

}
