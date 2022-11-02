package practice26102022;

public class ForLoopHerhangiBirSoru {
    //Bir String' i tersine çevirmek için kod yazınız. Örnek;" Mark" ==> kraM

    public static void main(String[] args) {

        String s ="Mark";
        String r= "";

        for(int i =s.length()-1; i>-1;i--){
            r =r +s.substring(i,i+1);
        }
        System.out.println(r);

        //2.yol
        String t ="Mark";
        StringBuilder sb = new StringBuilder(t);
        System.out.println(sb.reverse());


    }
}
