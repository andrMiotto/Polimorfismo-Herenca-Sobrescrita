package br.com.appAnimais.main;

import java.util.ArrayList;
import java.util.List;

import br.com.appAnimais.model.Animal;
import br.com.appAnimais.model.Cachorro;
import br.com.appAnimais.model.Gato;

public class Main {
    public static void main(String[] args) {
        List<Animal> pets = new ArrayList<>();
        pets.add(new Animal("Bicho Genérico"));
        pets.add(new Cachorro("Rex"));
        pets.add(new Gato("Mimi"));

        for (Animal pet : pets) {
            System.out.println(pet);
        }
    }
}

