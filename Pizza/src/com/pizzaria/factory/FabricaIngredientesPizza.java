package com.pizzaria.factory;

import java.util.List;

import com.pizzaria.ingredient.Marisco;
import com.pizzaria.ingredient.Massa;
import com.pizzaria.ingredient.Molho;
import com.pizzaria.ingredient.Pepperoni;
import com.pizzaria.ingredient.Queijo;
import com.pizzaria.ingredient.Vegetal;

public interface FabricaIngredientesPizza {
    Massa criarMassa();
    
    Molho criarMolho();

    Queijo criarQueijo();

    List<Vegetal> criarVegetais();

    Pepperoni criarPepperoni();

    Marisco criarMarisco();
}