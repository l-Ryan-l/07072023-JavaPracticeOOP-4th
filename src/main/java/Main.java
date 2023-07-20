public class Main {
    public static void main(String[] args) {
        Box<Fruit> boxOne = new Box<>();

        boxOne.addFruit(new Apple(5));
        boxOne.addFruit(new GoldenApple(2));
        boxOne.addFruit(new Apple(6));

        System.out.println("The first box is: " + boxOne);

        System.out.println("Moved everything from first box to the second");
        Box<Fruit> boxTwo = boxOne.pourToAnotherBox();

        System.out.println("The first box: " + boxOne);
        System.out.println("The second box: " + boxTwo);

    }
}
