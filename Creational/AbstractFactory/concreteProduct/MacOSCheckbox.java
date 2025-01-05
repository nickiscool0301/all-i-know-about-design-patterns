package Creational.AbstractFactory.concreteProduct;

import Creational.AbstractFactory.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a MacOS Checkbox");
    }
}


