package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarDealershipTest {



    @Test
    public void testGetInventoryCount(){
        CarDealership carDealership = new CarDealership();
        assertEquals(0, carDealership.getInventoryCount());
    }

    @Test
    public void testAddCarSuccess(){
        CarDealership carDealership = new CarDealership();
        double startingBudget = carDealership.getBudget();
        double startingInventory = carDealership.getInventory().size();

        Car toyotaCamry = new Sedan("toyota", "camry", 12000, false);
        String addCarResult = carDealership.addCar(toyotaCamry);

        assertEquals("The car has been added to the inventory", addCarResult);

        double budgetAfterPurchase = startingBudget - toyotaCamry.getPrice();
        assertEquals(budgetAfterPurchase, carDealership.getBudget());

        assertEquals(startingInventory + 1, carDealership.getInventory().size());
    }

    @Test
    public void testAddCarTooExpensive(){
        CarDealership carDealership = new CarDealership();
        Car toyotaCamry = new Sedan("toyota", "camry", (int) (carDealership.getBudget()+1), true);

        assertEquals("Not enough money in the budget", carDealership.addCar(toyotaCamry));

    }

    @Test
    public void testSellCar(){
        CarDealership carDealership = new CarDealership();
        double startingMoneyMade = carDealership.getMoneyMade();
        double startingInventory = carDealership.getInventory().size();

        Car toyotaCamry = new Sedan("toyota", "camry", 12000, false);
        carDealership.addCar(toyotaCamry);

//        assertEquals("The car has been added to the inventory", addCarResult);

        carDealership.sellCar(toyotaCamry);
        double moneyMadeAfterSale = startingMoneyMade + toyotaCamry.getPrice() * carDealership.getDealerMarkUp();
        assertEquals(moneyMadeAfterSale, carDealership.getMoneyMade());

        assertEquals(startingInventory, carDealership.getInventory().size());
    }






}
