import java.lang.Thread;

class Animal {
    protected String name;
    protected Animal next;

    public Animal(String n) {
        name = n;
        next = null;
    }

    public void Link2(Animal nextNode) {
        next = nextNode;
    }

    public Animal Move2NextNode() {
        return next;
    }

    public void Sound() {
    }
}

class Cat extends Animal {
    public Cat(String n) {
        super(n);
    }

    public void Sound() {
        System.out.println("Now " + name + " is speaking: Meow......");
    }
}

class Duck extends Animal {
    public Duck(String n) {
        super(n);
    }

    public void Sound() {
        System.out.println("Now " + name + " is speaking: Quack......");
    }
}

class Dog extends Animal {
    public Dog(String n) {
        super(n);
    }

    public void Sound() {
        System.out.println("Now " + name + " is speaking: Woof......");
    }
}

class WhoIsSpeaking {
    public static void NowSpeak(Cat cat, Duck duck, Dog dog) {
        cat.Link2(duck);
        duck.Link2(dog);
        dog.Link2(cat);

        Animal curr = cat;

        try {
            for (;;) {
                curr.Sound();
                curr = curr.Move2NextNode();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class myClass {
    public static void main(String args[]) {
        Cat kitty = new Cat("kitty");
        Duck donald = new Duck("donald");
        Dog goofy = new Dog("goofy");

        WhoIsSpeaking.NowSpeak(kitty, donald, goofy);
    }
}