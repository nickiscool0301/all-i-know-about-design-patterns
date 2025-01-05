package Creational.AbstractFactory.concreteFactory;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.Checkbox;
import Creational.AbstractFactory.GUIFactory;
import Creational.AbstractFactory.concreteProduct.MacOSButton;
import Creational.AbstractFactory.concreteProduct.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
