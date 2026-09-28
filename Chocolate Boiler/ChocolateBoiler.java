public class ChocolateBoiler {

    private boolean empty;
    private boolean heatingElementOff;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        this.empty = true;
        this.heatingElementOff = true;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isOff() {
        return heatingElementOff;
    }

    public void fill() {
        if (isEmpty() && isOff()) {
            empty = false;
            System.out.println("It was filled with a mixture of chocolate and milk.");
        } else {
            System.out.println("Error: cannot fill");
        }
    }

    public void mingle() {
        if (!isEmpty() && isOff()) {
            heatingElementOff = false;
            System.out.println("Heating element on, starting mixing process.");
        } else {
            System.out.println("Error: cannot mingle");
        }
    }

    public void empty() {
        if (!isEmpty() && !isOff()) {
            empty = true;
            heatingElementOff = true;
            System.out.println("Poured mixture, heating element off.");
        } else {
            System.out.println("Error: cannot empty");
        }
    }
}
