public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        ExampleEntity exampleEntity = new ExampleEntity("Entity", 42);

        ExampleEntity exampleEntityNew = (ExampleEntity) exampleEntity.clone();

        exampleEntityNew.setAge(67);

        System.out.println(exampleEntity);
        System.out.println(exampleEntityNew);
    }
}
