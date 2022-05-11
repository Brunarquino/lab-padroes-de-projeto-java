package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarcliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM:" +
                "\nNome: " + nome +
                "\nCep: " + cep +
                "\nCidade: " + cidade +
                "\nEstado: " + estado);
    }

}
