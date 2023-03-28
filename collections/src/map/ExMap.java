import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExMap {
    public static void main(String[] args) {

        System.out.println("Dicionário que relaciona os modelos de carros e consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                put("Gol", 14.4);
                put("Celta", 15.4);
                put("Ford Ka", 10.0);
                put("Onix", 12.7);
            }
        };
        System.out.println(carrosPopulares);

        System.out.println("\nSubstituindo os dados do gol por 15,2km/L: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConferindo se o modelo Tucson está na lista: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("\nConferindo o consumo do Onix: " + carrosPopulares.get("Onix"));

        System.out.print("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        double consumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEco = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumo))
                modeloEco = entry.getKey();
            System.out.println("\nModelo mais econômico: " + modeloEco + " - " + consumo);
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nSoma dos consumos: " + soma);

    }
}