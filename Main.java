public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        Product product = director.construct(builder);
        System.out.println(product);
    }
}
