public class Main {
    public static void main(String[] args) {

        char letter = 'J';
        switch (letter){
            case 'A':
                System.out.println("Letter: " + letter + " NATO word: Able");
                break;
            case 'B':
                System.out.println("Letter: " + letter + " NATO word: Baker");
                break;
            case 'C':
                System.out.println("Letter: " + letter + " NATO word: Charlie");
                break;
            case 'D':
                System.out.println("Letter: " + letter + " NATO word: Dog");
                break;
            case 'E':
                System.out.println("Letter: " + letter + " NATO word: Easy");
                break;
            default:
                System.out.println("Letter: " + letter + " NATO word: Not Found");
                break;
        }

    }
}
