package com.pizzaria.pizza;

import com.pizzaria.factory.FabricaIngredientesPizza;

public class PizzaQueijo extends Pizza {

    public PizzaQueijo(String nome, FabricaIngredientesPizza fabrica) {
        super(nome, fabrica);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + getNome());
        massa = fabrica.criarMassa();
        molho = fabrica.criarMolho();
        queijo = fabrica.criarQueijo();
    }
}