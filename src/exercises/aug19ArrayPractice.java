package exercises;


public class aug19ArrayPractice {
    public static void main(String[] args) {
        int array[] = {1, 1, 2, 3, 5, 8};
        for (int i=0; i< array.length; i++) {
            if ( i % 2 !=0) {
                System.out.println(i);
            }
        }
       String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] sentenceSplit = sentence.split("\\.");
        for (int i=0; i< sentenceSplit.length;i++) {
            System.out.println(sentenceSplit[i]);
            //use this System.out.println(Arrays.toString(arrayName));
        }
    }
}
public class aug19ArrayListPractice {
    public static void main(String[] args) {
        int arrayList[] = {1, 1, 2, 3, 5, 8, 10, 12, 4, 33};
        int evenSum = 0;
        for (int i=0; i< arrayList.length; i++){
            if (arrayList[i] % 2 == 0) {
                evenSum = evenSum + arrayList[i];
                System.out.println(evenSum);
            }
        }
        String wordArray[] = {"Hello", "Goodbye", "lucky", "cat", "Troll"};
        for(String i : wordArray.split[i])   }
}