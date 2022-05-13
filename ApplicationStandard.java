package stream_collections.standartVSstream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ApplicationStandard {

    public static void main(String[] args) {
        List<Integer> weeklyhumidity = new ArrayList<>();
        weeklyhumidity.add(80);
        weeklyhumidity.add(20);
        weeklyhumidity.add(30);
        weeklyhumidity.add(40);
        weeklyhumidity.add(50);
        weeklyhumidity.add(60);
        weeklyhumidity.add(70);
        weeklyhumidity.add(20);
        weeklyhumidity.add(80);
        weeklyhumidity.add(90);

   /*     //filter--removeIf(): parallel operations

        //concurency
        //              |-> .get(i)
        //collections               //common (i)-index
        //              |-> .remove(i)
        // 0 1 2 3 4 5 6 7
        // 30 50 60 70
        //

    */
//X1.code
//        for (int i = 0; i < weeklyhumidity.size(); i++) {
//            if(weeklyhumidity.get(i)<50) {
//                weeklyhumidity.remove(i);
//            }
//        }


        //1.Refacctor X1.code use for(each) ----bad because not verify all elements!!!
//        for (Integer wh1 : weeklyhumidity) {
//            if (wh1 <= 50) {
//                break;
//            }System.out.println(wh1);
//        }

//2. Refactor the X1.code use Loop.index (its good because is iteration)
//        Iterator<Integer> i = weeklyhumidity.iterator();
//        while (i.hasNext()) {
//            Integer s = i.next(); // must be called before you can call i.remove()
//            if (s > 50) {
//                i.remove();
//                System.out.println(s);
//            }
//        }
//3. Refactor the X1.code use Loop.index uses pozitiv condition + temporary collection
        Iterator<Integer> i = weeklyhumidity.iterator();
        List<Integer> tempList = new ArrayList<>();

        while (i.hasNext()) {
            Integer s = i.next();
            if (s >= 50) {
                tempList.add(s);
                // i.next();
            } else
                System.out.println(s);
        }

//        for (Integer wh : weeklyhumidity) {
//            System.out.println(wh);

    }
}
