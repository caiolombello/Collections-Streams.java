package Map;

import java.util.TreeMap;

public class Exercicio {
    public static void main(String[] args) {
        // Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor
        TreeMap<String, String> estadosBrasileiros = new TreeMap<>();
        estadosBrasileiros.put("Acre", "AC");
        estadosBrasileiros.put("Alagoas", "AL");
        estadosBrasileiros.put("Amapá", "AP");
        estadosBrasileiros.put("Amazonas", "AM");
        estadosBrasileiros.put("Bahia", "BA");
        estadosBrasileiros.put("Ceará", "CE");
        estadosBrasileiros.put("Espírito Santo", "ES");
        estadosBrasileiros.put("Goiás", "GO");
        estadosBrasileiros.put("Maranhão", "MA");
        estadosBrasileiros.put("Mato Grosso", "MT");
        estadosBrasileiros.put("Mato Grosso do Sul", "MS");
        estadosBrasileiros.put("Minas Gerais", "MG");
        estadosBrasileiros.put("Pará", "PA");
        estadosBrasileiros.put("Paraíba", "PB");
        estadosBrasileiros.put("Paraná", "PR");
        estadosBrasileiros.put("Piauí", "PI");
        estadosBrasileiros.put("Rio de Janeiro", "RJ");
        estadosBrasileiros.put("Rondônia", "RO");
        estadosBrasileiros.put("Roraima", "RR");
        estadosBrasileiros.put("Santa Catarina", "SC");
        estadosBrasileiros.put("São Paulo", "SP");
        estadosBrasileiros.put("Sergipe", "SE");
        estadosBrasileiros.put("Tocantins", "TO");

        // Remova o estado de Minas Gerais
        estadosBrasileiros.remove("MG");

        // Adicione o Distrito Federal
        estadosBrasileiros.put("Distrito Federal", "DF");

        // Verifique o tamanho do mapa
        System.out.println(estadosBrasileiros.size());

        // Remova o estado de Mato Grosso do Sul usando o nome
        estadosBrasileiros.remove("Mato Grosso do Sul");

        // Navegue em todos os registros do map, monstrando no console no seguinte formato: NOME (SIGLA)
        for (String estado : estadosBrasileiros.keySet()){
            System.out.println( estado + " (" + estadosBrasileiros.get(estado) + ")");
        }

        // Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)
        System.out.println(estadosBrasileiros.containsValue("SC"));

        // Verifique se o estado de Maranhão existe no map buscando por seu nome
        System.out.println(estadosBrasileiros.containsKey("Maranhão"));

    }
}
