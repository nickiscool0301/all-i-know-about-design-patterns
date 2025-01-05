package Creational.AbstractFactory.concreteProduct;

import Creational.AbstractFactory.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows Button");
    }
}
