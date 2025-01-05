package Creational.AbstractFactory.concreteProduct;

import Creational.AbstractFactory.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox");
    }
}
