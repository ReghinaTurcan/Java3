package stream_collections.standartVSstream;

import java.util.stream.Stream;

public class ApplicationStream {
    static int is = 0;
    static int ic = 0;
    public static void main(String[] args) {

                //Supplay using generator
        Stream.generate(()->{
                    System.out.println("gen" + is);
                if(is == 6){

                    return 20;
                }
                    return (is++ +2) * 10;
                })

               .limit(7)
                //intermediate ops
               .filter(wh -> wh > 50)
                .forEach(wh -> {
                    System.out.println(ic + " "+ wh);
                ic++;
                });

        System.out.println("DONE");

               // .forEach(System.out::println);
        }
}
