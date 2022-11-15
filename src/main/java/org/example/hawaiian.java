package org.example;

public class hawaiian extends pizza {

    @Override
    void addFilling(){
        addHum();
        addPineapple();
        addCheese();
    }

    @Override
    void addHum(){
        System.out.println("Добавили ветчину");
    }
    @Override
    void addPineapple(){
        System.out.println("Добавили ананас");
    }

    @Override
    void bakePizza() {
        System.out.println("Испекли пиццу Гавайская");
    }
}
