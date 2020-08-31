import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class Main {
    static void findDuplicates(int num[], int liczba) {
        // Tworzymy pustą tablicę z wynikiem
        //int duplikatesNumbers[]; - nie mogę skorzystać z tablicy, bo muszę odrazu znać jej rozmiar - liczbę jej elementów.
        //A tablice nie są dynamiczne - czyli nie mogę do niej dodawać kolejnych - nowych elementów.//
        //System.out.println(num);
        //System.out.println(liczba);
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < num.length; i++) {
            int counter = 0;
            //if (num[i] == null){
            //    break;
            //}
            System.out.println("Analizujemy liczbę: " + num[i]);
            for (int j = 0; j < num.length; j++) {
                boolean wynik = num[i] == num[j];
                if (wynik) {
                    counter++;
                }
                System.out.println(num[j] + " wartość " + " " + wynik);
            }
            System.out.println("Ilość powtórzeń " + counter);
            if (counter == liczba) {

                // dodaj ten element do tablicy wynikowej

                System.out.println(">>>>>>>>>>>>>>>>>>");
                System.out.println("Wynikowa liczby z ilością powtórzeń 2: " + num[i]);

            }

            //for (int k = 0; k < duplikatesNumbers.length; k++) {
            //duplikatesNumbers[k] = i + duplikatesNumbers[k];
            //System.out.println(Arrays.toString(duplikatesNumbers));

            if (counter == liczba) {
                list.add(num[i]);
            }

            System.out.println(list);

            System.out.println("-----------");
        }
        Set<Integer> list2 = new HashSet();
        list2.addAll(list);

        System.out.println('\n'+ "Wynik: " + list2);
    }


    public static void main(String[] args) {

        int numbers[] = new int[]{-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6};

//        for (int i = 0; i<number.length; i++) {
//            System.out.println(number[i]);
//        }
        // findDuplicates(asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6), 2);

        // findDuplicates(number, 2);
        findDuplicates(numbers, 2);
    }
}


