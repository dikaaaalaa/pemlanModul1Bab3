public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        

        // memanggil constructor dengan parameter String
        Lingkaran Lstring= new Lingkaran("5","10");
        Lstring.displayMessage();
    }
}
