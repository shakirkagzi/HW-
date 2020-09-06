package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("Memory Size: " + memorySize);
            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("Screen SIze: " + screenSize);
            }
        };

        laptop.monitorSize(16);
        laptop.monitorSize(15);

        //please implement anonymous function for Phone interface
        Phone phone = n->System.out.println("Cellular Network: " + n);
        phone.cellularNetwork("T-Mobile");

    }
}