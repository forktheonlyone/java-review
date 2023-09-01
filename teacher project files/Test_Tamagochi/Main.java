public class Main {

    public static void main(String[] args) {



/*
        ScanManager.Initialize();

        MainUpdate Main = new MainUpdate();
        Main.Initialize();

        double delayTime = 3000; // 1000 분의 1초
        long deltaTime = System.currentTimeMillis();

        while(true){
            if(deltaTime + delayTime < System.currentTimeMillis())
            {
                deltaTime = System.currentTimeMillis();

                Main.MainMenu();
                Main.Update();
            }
        }
        */
/*
        Animal animal = new Animal();
        animal.makeSound();

        Dogtest dogtest = new Dogtest();
        dogtest.makeSound();

        Cattest cattest = new Cattest();
        cattest.makeSound();
*/
/*
        Pet pet = new Pet();
        pet.sound();

        Doggy doggy = new Doggy();
        doggy.Initialize();
        doggy.sound();
    }
 */
        Animal animal = new Dog();
        animal.makeSound();
        animal.play();
        animal.sleep();
        animal.eat();
        animal.special();
    }
}