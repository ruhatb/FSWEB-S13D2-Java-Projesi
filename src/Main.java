public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPalindrome(33));
        System.out.println(isPalindrome(153));
        System.out.println(isPalindrome(121));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(45));

        System.out.println(numberToWords(45));
        System.out.println(numberToWords(645));
    }

//Palindrome
    public static boolean isPalindrome(int sayi) {
        sayi = Math.abs(sayi);
       String sayiString =  Integer.toString(sayi);
       char[] charSayi = sayiString.toCharArray();

       int ilkIndex = 0;
       int sonIndex = charSayi.length-1;

       while (ilkIndex < sonIndex){
           if(charSayi[ilkIndex] != charSayi[sonIndex]) {
               return false;
           }
        ilkIndex++;
           sonIndex--;
       }

      return  true;
    }

    //PerfectNumber

    public static boolean isPerfectNumber(int sayi) {
        if (sayi < 0){
            return false;
        }
        int div = 0;
        for(int i = 1; i <= sayi-1; i++){
           if(sayi % i == 0) {
               div += i;
           }
           }
           return div == sayi;
    }
//NumberToWords

    public static String numberToWords(int sayi) {
        if (sayi < 0 && sayi > 1000) {
            return "Invalid value.";
        }
     String[] birler = { "", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"};
        String[] onlar = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"};

        String result = "";

        if (sayi == 0){
            return "sıfır";

        }
        if ( sayi >= 100){
            result += birler[sayi/100] + "yüz";
            sayi %= 100;
        }

        if ( sayi >= 10 && sayi < 99){
            result += onlar[sayi/10] + "";
            sayi %= 10;
        }

        if (sayi > 0) {
            result += birler[sayi];
        }
     return  result.trim();
    }

}