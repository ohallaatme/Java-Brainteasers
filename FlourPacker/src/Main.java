public class Main {
    public static void main(String[] args) {

        // tests

        // false
        System.out.println(FlourPacker.canPack(1,0, 4));

        // true
        System.out.println(FlourPacker.canPack(1, 0, 5));

        // true
        System.out.println(FlourPacker.canPack(0, 5, 4));

        // true
        System.out.println(FlourPacker.canPack(2, 2, 1));

        // false
        System.out.println(FlourPacker.canPack(0, 0, 12));
    }
}

