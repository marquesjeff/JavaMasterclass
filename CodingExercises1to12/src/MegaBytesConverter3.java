public class MegaBytesConverter3 {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mega = kiloBytes / 1024;
        int remainderKiloBytes = kiloBytes % 1024;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " +
                    mega + " MB and " + remainderKiloBytes +
                    " KB");
        }
    }
}
