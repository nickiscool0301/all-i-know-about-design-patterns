package Creational.AbstractFactory.concreteProduct;

import Creational.AbstractFactory.Button;

public class MacOSButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering a MacOS Button");
    }
}
