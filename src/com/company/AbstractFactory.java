package com.company;

public class AbstractFactory {
    public static void main(String[] args) {
        Factory factory = new AbstractFactoryTry().createFactory("WoodFactory");
        WoodComponent window = factory.createWood("Window");
        window.build();
    }
}

interface WoodComponent {
    void build();
}

class WoodWindows implements WoodComponent {
    @Override
    public void build() {
        System.out.println("build wood window");
    }
}

class WoodDoors implements WoodComponent {
    @Override
    public void build() {
        System.out.println("build wood door");
    }
}

class WoodWalls implements WoodComponent {
    @Override
    public void build() {
        System.out.println("build wood wall");
    }
}

class WoodFactory implements Factory {
    public WoodComponent createWood(String typeOfComponent) {
        switch (typeOfComponent) {
            case "Window":
                return new WoodWindows();
            case "Wall":
                return new WoodWalls();
            case "Door":
                return new WoodDoors();
            default:
                return null;
        }
    }

    @Override
    public BrickComponent createBrick(String typeOfComponent) {
        return null;
    }
}

interface BrickComponent {
    void build();
}

class BrickWindows implements BrickComponent {
    @Override
    public void build() {
        System.out.println("build brick window");
    }
}

class BrickDoors implements BrickComponent {
    @Override
    public void build() {
        System.out.println("build brick door");
    }
}

class BrickWalls implements BrickComponent {
    @Override
    public void build() {
        System.out.println("build brock wall");
    }
}

class BrickFactory implements Factory {
    public BrickComponent createBrick(String typeOfComponent) {
        switch (typeOfComponent) {
            case "Window":
                return new BrickWindows();
            case "Wall":
                return new BrickDoors();
            case "Door":
                return new BrickWalls();
            default:
                return null;
        }
    }

    @Override
    public WoodComponent createWood(String typeOfComponent) {
        return null;
    }
}

interface Factory {
    WoodComponent createWood(String typeOfComponent);
    BrickComponent createBrick(String typeOfComponent);
}

class AbstractFactoryTry {
    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "WoodFactory":
                return new WoodFactory();
            case "BrickFactory":
                return new BrickFactory();
            default:
                return null;
        }
    }



























































}