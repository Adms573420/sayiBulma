public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 5, 9, 8, 7, 2, 10};
        int arananSayi = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == arananSayi) {
                varMi = true;
                break;
            }

        }
        if(varMi){
            System.out.println("Sayi mevcuttur.");
        }else{
            System.out.println("Sayi mevcut Degildir.");
        }

    }
}
