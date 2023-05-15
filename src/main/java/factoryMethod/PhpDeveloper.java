package factoryMethod;

import java.sql.SQLOutput;

public class PhpDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Пишет на php.");
    }
}
