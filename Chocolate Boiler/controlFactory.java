public class controlFactory {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        
        chocolateBoiler.mingle();
        chocolateBoiler.empty();
    }
}