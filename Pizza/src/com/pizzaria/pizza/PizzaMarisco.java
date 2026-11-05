package com.pizzaria.pizza;

import com.pizzaria.factory.FabricaIngredientesPizza;

public class PizzaMarisco extends Pizza {

    public PizzaMarisco(String nome, FabricaIngredientesPizza fabrica) {
        super(nome, fabrica);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + getNome());
        massa = fabrica.criarMassa();
        molho = fabrica.criarMolho();
        queijo = fabrica.criarQueijo();
        marisco = fabrica.criarMarisco();
    }
}