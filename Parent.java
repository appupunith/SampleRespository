class Parent {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("This is child class");
    }
}

class Main {
    public static void main(String[] args) {
        // 1 - method of parent class by object of parent class
        Parent parentObj = new Parent();
        parentObj.parentMethod();
        
        // 2 - method of child class by object of child class
        Child childObj = new Child();
        childObj.childMethod();
        
        // 3 - method of parent class by object of child class
        childObj.parentMethod();
    }
}


