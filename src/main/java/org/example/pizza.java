package org.example;

abstract class pizza {

    final void makePizza(){

      isClosed();
      makePastry();
      isSpicy();
      addSauce();
      addFilling();
      bakePizza();
    }
     void addFilling() {
        addTomato();
        addCheese();
    }
    ;
    void makePastry(){
        System.out.println("Сделали тесто");
    }
    void addSauce(){
        System.out.println("Добавили соус");
    };
    void addTomato(){
        System.out.println("Добавили помидоры");
    };
    void addCheese(){
        System.out.println("Добавили сыр");
    }
    void isClosed(){
        System.out.println("Пицца открытая");
    };
    void isSpicy(){
        System.out.println("Пицца не острая");
    };
    void addMashrooms(){};

    void addPineapple(){};
    void addSausage(){};
    void addPickles(){};

    void addOnion(){};
    void addBeacon(){};
    void addHum(){};
    void bakePizza(){
        System.out.println("Испекли пиццу Маргарита");
    }
}
