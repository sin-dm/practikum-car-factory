package factory;

import factory.building.MainWorkshop;
import factory.building.Workshop;
import factory.product.CommonCar;
import factory.product.SportCar;
import factory.product.Transport;
import factory.product.Vehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

    public static void main(String[] args) {
        String[] productionQueue = new String[4];
        productionQueue[0] = "common";
        productionQueue[1] = "sport";
        productionQueue[2] = "common";
        productionQueue[3] = "sport";
        Workshop workshop = new MainWorkshop();
        ((MainWorkshop) workshop).doSomething();
        Transport[] transport = workshop.produce(productionQueue);

        for (Transport tr : transport) {
            tr.startEngine();
            tr.ride();
            tr.stopEngine();
            tr.getEngine();
//            System.out.println(((SportCar) tr).alarmSystem);
            tr.setTransmission("test");
        }
    }

    public void testVehicle() {
        //Vehicle car = new SportCar();
        //car = new CommonCar();

    }
}
