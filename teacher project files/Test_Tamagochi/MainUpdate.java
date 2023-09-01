
public class MainUpdate {
    /*
    private Pet pet;

    public void Initialize()
    {
        System.out.println("1. 강아지");
        System.out.println("2. 고양이");
        System.out.println("3. 종료");


        switch(ScanManager.Scan())
        {
            case 1:
                pet = new Dog();
                break;
            case 2:
                pet = new Cat();
                break;
        }
        pet.initialize();

    }
    */


    public void MainMenu()
    {
        System.out.println("** 매뉴 **");
        System.out.println("1. 산책");
        System.out.println("2. 먹기");
        System.out.println("3. 잠자기");
        System.out.println("0. 게임 종료");
    }

    public void Update()
    {
        switch(ScanManager.Scan())
        {
            case 0:
                System.out.println("게임이 종료됩니다.");
                return;

            case 1:
                System.out.println("산책 킁킁!!");
                pet.walk();
                break;

            case 2:
                System.out.println("맛있다 냠냠");
                pet.eat();
                break;
            default:

                break;

            case 3:
                System.out.println("잠온다 쿨쿨");
                pet.sleep();
                break;

            case 4:
                System.out.println("왈! 왈!");
                break;

            default:
                System.out.println("잘못 입력 했습니다.");
                System.out.println("다시 입력하세요");
                break;
        }
    }
}
