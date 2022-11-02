package practice26102022;

public class Palindrome {
    //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
    // Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.

    public static void main(String[] args) {

        //1.Yol

        String str = "anna";
        String r ="";
        for(int i = str.length()-1;i >-1; i--){
            String c = str.substring(i,i+1);
            r = r +c;
        }
        if(str.equals(r)){
            System.out.println(str + "= Palindromdur");
        }else{
            System.out.println(str + "= Palindrom degildir");
        }

        //2.yol
        String str1 = "anna";
        String r1 ="";
        int i = str.length()-1;
        while(i >-1){
            String c1= str.substring(i,i+1);
            r1 =r1 +c1;

            i--;
        }
        if(str.equals(r1)){
            System.out.println(str1 + "= Palindromdur");
        }else{
            System.out.println(str1 + "= Palindrom degildir");
        }

        //3.yol

        String str2 = "annak";
        String r2 = "";
        int k =str2.length()-1;
        do{
            String c2= str2.substring(k,k+1);
            r2 = r2 +c2;
            k--;
        }while(k >-1);
        if(str2.equals(r2)){
            System.out.println(str2 + "= Palindromdur");
        }else{
            System.out.println(str2 + "= Palindrom degildir");
        }




    }


}

