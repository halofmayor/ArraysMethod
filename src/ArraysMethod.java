import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArraysMethod {
    public static void main(String[] args) {
        // String[] => Fixo
        // new Arraylist<String>() => Dinamicos
        List<String> names = new ArrayList<>();

        //adicionar elementes ao array
        names.add("nome1");
        names.add("nome2");

        //como buscar um elemento pelo indice get()
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //como buscar um indice a partir dum elemento
        int index = names.indexOf("nome2");
        System.out.println(index);

        //verifica se a lista esta vazia
        System.out.println(names.isEmpty());

        //verifuca se a lista contem algum elemento
        System.out.println(names.contains("nome 14"));

        //verifica o tamanho da lista
        System.out.println(names.size());

        //limpar de vez a lista
        names.clear();
        System.out.println(names.isEmpty());
    }
}
