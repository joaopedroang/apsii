package com.pizzaria.pizza;

import java.util.function.BiFunction;

import com.pizzaria.factory.FabricaIngredientesPizza;

public enum TipoPizza {
    QUEIJO("Queijo", PizzaQueijo::new),
    MARISCO("Mariscos", PizzaMarisco::new),
    VEGETARIANA("Vegetariana", PizzaVegetariana::new);

    private final String descricao;
    private final BiFunction<String, FabricaIngredientesPizza, Pizza> construtor;

    TipoPizza(String descricao, BiFunction<String, FabricaIngredientesPizza, Pizza> construtor) {
        this.descricao = descricao;
        this.construtor = construtor;
    }

    public Pizza criar(String regiao, FabricaIngredientesPizza fabrica) {
        return construtor.apply("Pizza " + descricao + " estilo " + regiao, fabrica);
    }
}