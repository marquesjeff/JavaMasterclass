public class FlourPacker25 {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigBags = Math.min(bigCount, goal / 5);

        int remaining = goal - (bigBags * 5);

        return remaining <= smallCount;
    }



}

