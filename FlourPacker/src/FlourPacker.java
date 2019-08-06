public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        bigCount *= 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigCount == 0 && smallCount == 0) {
            return false;
            // we use goal remainder 5 because we can't true up to the target flour amount if
            // our remainder is too high to fill in and we cant divide the full 5 kilo bags
        } else if (bigCount + smallCount < goal || goal % 5 > smallCount) {
            return false;
        }
        return true;
    }
}
