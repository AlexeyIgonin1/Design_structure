package factoryMethod;

public class Program {
    public static void main(String[] args) {
//        Developer developer = new JavaDeveloper();
//        developer.writeCode();

        //************************************************************************

//        DeveloperFactory developerFactory = new CppDeveloperFactory();
//        Developer developer = developerFactory.createDeveloper();
//        developer.writeCode();

        //************************************************************************

        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }


    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("Cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }
        else {
            throw new RuntimeException (specialty + " Такой специальности нет");
        }
    }

}


