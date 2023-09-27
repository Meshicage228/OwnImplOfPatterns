import domain.Child;
import utils.AbstractDB;

public class SingletonMain {
    public static void main(String[] args) {

        Child vlad = Child.builder()
                .name("Vlad")
                .age(12)
                .averageGrade(7.6f)
                .build();
        Child Olga = Child.builder()
                .name("Olga")
                .age(17)
                .averageGrade(9.2f)
                .build();

        AbstractDB.getInstance().addChildToDB(vlad, Olga);
        AbstractDB.getInstance().showAllFromDB();
    }
}
