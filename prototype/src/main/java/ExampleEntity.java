import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class ExampleEntity implements Cloneable {
    private String name;
    private int age;

    public ExampleEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
