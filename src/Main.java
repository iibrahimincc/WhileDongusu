public class Main {
    public static void main(String[] args) {

        // for döngüsü ile aynı görevi yapar fakat koşulu , arttırmayı , kaçtan başlayacağını teker teker biz tanımlarız.
        int i = 1 ;
        while (i<11) {
            System.out.println(i);
            i+= 2;
        }
        System.out.println("While Döngüsü Bitti");
    }
}