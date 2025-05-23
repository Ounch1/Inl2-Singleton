public class Main {
    public static void main(String[] args) {
        System.out.println("ENUM SINGLETON: ");
        EnumRootUser enumUsr = EnumRootUser.INSTANCE;
        System.out.println(enumUsr);

        System.out.println("INSTANCE SINGLETON: ");
        StaticInstanceRootUser staticUsr = StaticInstanceRootUser.getInstance();
        System.out.println(staticUsr);

        System.out.println("LAZY SINGLETON: ");
        LazyRootUser lazyUsr = LazyRootUser.getInstance();
        System.out.println(lazyUsr);
    }
}
