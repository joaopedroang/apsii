package com.pizzaria.factory;

import java.util.List;

import com.pizzaria.ingredient.AzeitonaPreta;
import com.pizzaria.ingredient.Berinjela;
import com.pizzaria.ingredient.Espinafre;
import com.pizzaria.ingredient.Marisco;
import com.pizzaria.ingredient.MariscoCongelado;
import com.pizzaria.ingredient.Massa;
import com.pizzaria.ingredient.MassaGrossa;
import com.pizzaria.ingredient.Molho;
import com.pizzaria.ingredient.MolhoTomateItaliano;
import com.pizzaria.ingredient.Pepperoni;
import com.pizzaria.ingredient.PepperoniFatiado;
import com.pizzaria.ingredient.Queijo;
import com.pizzaria.ingredient.QueijoMussarela;
import com.pizzaria.ingredient.Vegetal;

public class FabricaIngredientesChicago implements FabricaIngredientesPizza {

    @Override
    public Massa criarMassa() {
        return new MassaGrossa();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoTomateItaliano();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public List<Vegetal> criarVegetais() {
        return List.of(new AzeitonaPreta(), new Espinafre(), new Berinjela());
    }

    @Override
    public Pepperoni criarPepperoni() {
        return new PepperoniFatiado();
    }

    @Override
    public Marisco criarMarisco() {
        return new MariscoCongelado();
    }
}