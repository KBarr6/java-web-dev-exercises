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
