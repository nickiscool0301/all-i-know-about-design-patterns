package Creational.AbstractFactory.concreteFactory;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.Checkbox;
import Creational.AbstractFactory.GUIFactory;
import Creational.AbstractFactory.concreteProduct.WindowsButton;
import Creational.AbstractFactory.concreteProduct.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
