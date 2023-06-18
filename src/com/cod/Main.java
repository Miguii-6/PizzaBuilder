package com.cod;

public class Main {

    public static void main(String[] args) {
        Pizzas piz1 = new BuilderPizzas().build();
        System.out.println(piz1.toString());

        Pizzas pizPinha = new BuilderPizzas().setPinha(true).build();
        System.out.println(pizPinha.toString()+("Para la gente sin criterio"));

        Pizzas pizEncadenada = new BuilderPizzas()
                .setBacon(false)
                .setSize(3)
                .setTipoMasa(0)
                .build();
        System.out.println(pizEncadenada.toString());



    }
}
