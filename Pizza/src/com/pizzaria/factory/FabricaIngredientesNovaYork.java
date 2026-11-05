package com.pizzaria.factory;

import java.util.List;

import com.pizzaria.ingredient.Alho;
import com.pizzaria.ingredient.Cebola;
import com.pizzaria.ingredient.Cogumelo;
import com.pizzaria.ingredient.Marisco;
import com.pizzaria.ingredient.MariscoFresco;
import com.pizzaria.ingredient.Massa;
import com.pizzaria.ingredient.MassaFina;
import com.pizzaria.ingredient.Molho;
import com.pizzaria.ingredient.MolhoMarinara;
import com.pizzaria.ingredient.Pepperoni;
import com.pizzaria.ingredient.PepperoniFatiado;
import com.pizzaria.ingredient.PimentaoVermelho;
import com.pizzaria.ingredient.Queijo;
import com.pizzaria.ingredient.QueijoReggiano;
import com.pizzaria.ingredient.Vegetal;

public class FabricaIngredientesNovaYork implements FabricaIngredientesPizza {

    @Override
    public Massa criarMassa() {
        return new MassaFina();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoMarinara();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoReggiano();
    }

    @Override
    public List<Vegetal> criarVegetais() {
        return List.of(new Alho(), new Cebola(), new Cogumelo(), new PimentaoVermelho());
    }

    @Override
    public Pepperoni criarPepperoni() {
        return new PepperoniFatiado();
    }

    @Override
    public Marisco criarMarisco() {
        return new MariscoFresco();
    }
}