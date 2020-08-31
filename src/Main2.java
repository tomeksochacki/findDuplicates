import java.util.*;

class Main2 {
    public static void main(String[] args) {

        int numbers [] = new int[]{-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6};

        LinkedList <Integer> list1 = new LinkedList();
        for (int i = 0; i < numbers.length; i++){
        list1.add(numbers[i]);
        }

        //tu lista jest uzupełniona wartościami z tablivy numbers
        System.out.println(list1);
        //tu podmieniam obiekt o indeksie 1 na nulla
        list1.set(1,null);
        System.out.println(list1);
        findDuplicates(list1,2);
    }

    public static void findDuplicates(LinkedList<Integer> list1, int numberOfRepetitions){
        //System.out.println("This is method");
        LinkedList <Integer> list2 = new LinkedList();

        for (int i = 0; i<list1.size(); i++){
            int counter = 0;
            if (list1.get(i) == null){
                continue;
            }
            System.out.println("Check for value: " + list1.get(i));
            for (int j = 0; j<list1.size(); j++){
                boolean request = (list1.get(i) == list1.get(j));
                if (request == true){
                    counter++;
                }
                System.out.println(list1.get(j) + " value" + " " + request + " counter: " + counter );
            }
            System.out.println("------------");
            if (counter == numberOfRepetitions){
                    list2.add(list1.get(i));
                    System.out.println(list2);
                }
            }
        HashSet<Integer> hashSet = new HashSet();
        hashSet.addAll(list2);
        System.out.println('\n' + "Final result :  " + hashSet);
        }

    }


