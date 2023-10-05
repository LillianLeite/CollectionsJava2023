package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Criar lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");

        //Criar um predicate que verifica se a palavra tem mais de 5 letras
        Predicate<String> maisDeCincoCaractere = palavra -> palavra.length() > 5;

        //Usae Stream para filtrar as palavras com mais de 5 caracteres e, em seguida
        // imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(maisDeCincoCaractere)
                .forEach(System.out::println);
    }
}
