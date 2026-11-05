package com.pizzaria.pizza;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.pizzaria.factory.FabricaIngredientesPizza;
import com.pizzaria.ingredient.Ingrediente;
import com.pizzaria.ingredient.Marisco;
import com.pizzaria.ingredient.Massa;
import com.pizzaria.ingredient.Molho;
import com.pizzaria.ingredient.Pepperoni;
import com.pizzaria.ingredient.Queijo;
import com.pizzaria.ingredient.Vegetal;

public abstract class Pizza {
    private final String nome;
    protected final FabricaIngredientesPizza fabrica;

    protected Massa massa;
    protected Molho molho;
    protected Queijo queijo;
    protected List<Vegetal> vegetais = List.of();
    protected Pepperoni pepperoni;
    protected Marisco marisco;

    protected Pizza(String nome, FabricaIngredientesPizza fabrica) {
        this.nome = Objects.requireNonNull(nome, "nome");
        this.fabrica = Objects.requireNonNull(fabrica, "fabrica");
    }

    public abstract void preparar();

    public void assar() {
        System.out.println("Assar por 25 minutos a 180°C");
    }

    public void cortar() {
        System.out.println("Cortar em fatias diagonais");
    }

    public void embalar() {
        System.out.println("Colocar na caixa oficial da pizzaria");
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("---- ").append(nome).append(" ----\n");
        adicionar(sb, massa);
        adicionar(sb, molho);
        adicionar(sb, queijo);
        if (!vegetais.isEmpty()) {
            sb.append(vegetais.stream()
                    .map(Ingrediente::getNome)
                    .collect(Collectors.joining(", ")))
              .append('\n');
        }
        adicionar(sb, marisco);
        adicionar(sb, pepperoni);
        return sb.toString();
    }

    private static void adicionar(StringBuilder sb, Ingrediente ingrediente) {
        if (ingrediente != null) {
            sb.append(ingrediente.getNome()).append('\n');
        }
    }
}