package pl.blazej.szczypka;

public class LionsMethods {
        public static void main(String[] args) {
            LionsMethods countStrings = new LionsMethods();
            String tab[] = new String[]{"a", "bb", "b", "ccc"};
            countStrings.wordsCount(tab, 2);
            countStrings.wordsFront(tab, 4);
            countStrings.greenTicket(5,6,6);
        }

        public int wordsCount(String[] words, int len) {
            int counter = 0;
            for(int i = 0; i<words.length; i++){
                if(words[i].length() == len){
                    counter++;
                }
            }
            return counter;
        }

        public String[] wordsFront(String[] words, int n) {
            String newtab[] = new String[n];
            for(int i = 0; i<n; i++){
                newtab[i] = words[i];
            }
            return newtab;
        }

        public int greenTicket(int a, int b, int c) {
            int countOccurrence = 0;
            if (a == b && a == c) {
                countOccurrence = 20;
            } else if (a == b || a == c || b == c) {
                countOccurrence = 10;
            } else {
                countOccurrence = 0;
            }
            return countOccurrence;
        }
    }
