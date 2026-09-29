public class Main {

    public static void main(String[] args) {

        int counter = 5;
        int finish = 20;
        int evensFound = 0;
        int oddsFound = 0;
        while(counter <= finish){
            
            counter++;

            if(!isEvenNumber(counter)){
                oddsFound++;
                continue;
            }

            System.out.println(counter);
            evensFound++;

            if(evensFound == 5){
                break;
            }
        }
        System.out.println("A total of " + evensFound + " even numbers were found.");
        System.out.println("A total of " + oddsFound + " odd numbers were found.");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
