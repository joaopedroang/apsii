package com.pizzaria.pizza;

import com.pizzaria.factory.FabricaIngredientesPizza;

public class PizzaVegetariana extends Pizza {

    public PizzaVegetariana(String nome, FabricaIngredientesPizza fabrica) {
        super(nome, fabrica);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + getNome());
        massa = fabrica.criarMassa();
        molho = fabrica.criarMolho();
        queijo = fabrica.criarQueijo();
        vegetais = fabrica.criarVegetais();
    }
}