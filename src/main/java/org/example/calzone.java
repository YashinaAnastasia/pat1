package org.example;

public class calzone extends pizza{

    @Override
    void addFilling(){
        addHum();
        addSausage();
        addCheese();
    }

    @Override
    void addSausage(){
        System.out.println("Добавили колбасу");
    }
    @Override
    void isClosed(){
        System.out.println("Пицца закрытая");
    }
    @Override
    void bakePizza() {
        System.out.println("Испекли пиццу Кальцоне");
    }

}
