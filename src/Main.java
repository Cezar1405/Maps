import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Defina una clase de prueba con un método main() donde usted:
        -crear un HashMap que mapee los números del 1 al 5 con sus respectivos nombres en inglés
        -crear un HashMap que mapee los números impares del 1 al 9 con sus respectivos nombres italiano
        -fusionar (sin usar merge()) el segundo hashmap en el primero
        (los valores de las claves duplicadas se sobrescriben en el primer HashMap)
        -imprime el firstHashMap modificado
        -imprimir en pantalla el valor de los keys 5, 6, 7, 8 y 9
        -si no hay asignación para una key específica, imprima Sin valor asociado
         */
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        //for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
        //    System.out.println("El numero: " + entry.getKey() + " se escribe en ingles: " + entry.getValue());
        //}

        //System.out.println();

        HashMap<Integer, String> impares = new HashMap<>();
        impares.put(1, "Uno");
        impares.put(3, "Tre");
        impares.put(5, "Cinque");
        impares.put(7, "Sette");
        impares.put(9, "Nove");

        //for (Map.Entry<Integer, String> entry : impares.entrySet()){
        //    System.out.println("El numero: "+entry.getKey()+" se escribe en italiano: "+entry.getValue());
        //}
        //for (Integer i : impares.keySet()) {
        //    System.out.println("numero: " + i + " se escribe en italiano: " + impares.get(i));
        //}
        //System.out.println();
        //Fusionando
        numbers.putAll(impares);
        for (Integer i : numbers.keySet()){
            System.out.println("Key "+i+": "+numbers.get(i));
        }
        System.out.println();
        //Imprimir en pantalla el valor de los keys: 5,6,7,8,9
        System.out.println("Key 5: " +numbers.getOrDefault(5, "sin valor asociado."));
        System.out.println("Key 6: " +numbers.getOrDefault(6, "sin valor asociado."));
        System.out.println("Key 7: " +numbers.getOrDefault(7, "sin valor asociado."));
        System.out.println("Key 8: " +numbers.getOrDefault(8, "sin valor asociado."));
        System.out.println("Key 9: " +numbers.getOrDefault(9, "sin valor asociado."));
    }
}