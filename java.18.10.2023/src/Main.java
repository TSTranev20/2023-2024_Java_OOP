import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int times = Integer.parseInt(scan.nextLine());


        for(int i = 0; i < times; i++)
        {
            String strL = scan.nextLine();

            String[] arr = split(strL);
            String model = scan.next();
            int n = Integer.parseInt(scan.next());
            Car car = new Car(brand, model, n);
            System.out.println(car.Info());
        }


    }

   public static class Car
    {
        private String brand, model;
        private int n;

        public Car(String brand, String model, int n)
        {
            if(model == null) {
                this.brand = brand;
                this.model = "unknown";
                this.n = -1;
            }
            else {
                this.brand = brand;
                this.model = model;
                this.n = n;
            }
        }

        public void setBrand(String brand)
        {
            this.brand = brand;
        }

        public void setModel(String model)
        {
            this.model = model;
        }

        public void setN(int n)
        {
            this.n = n;
        }
        public String Info()
        {
            String inf = "The car is: " + brand + " " + model + " - " + n + " HP.";
            return (inf);
        }
    }
}