import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        for(int i = 0; i < n; i++)
        {
            String type = scan.next();
            int age = Integer.parseInt(scan.next());
            double height = Double.parseDouble(scan.next());
            int branch = Integer.parseInt(scan.next());
            int leaves = Integer.parseInt(scan.next());

            Tree obj = new Tree(type, age, height, branch, leaves);


            obj.grow();
            obj.shedLeaves();
            obj.shedLeaves();
            System.out.println();
            System.out.print(obj.getTreeInfo());
            obj = null;
        }
    }
    static class Tree
    {
        private String typeTree;
        private int age;
        private double height;
        private int branch;
        private int leaves;

        Tree(String type, int age, double height, int branch, int leaves)
        {
            this.typeTree = type;
            this.age = age;
            this.height = height;
            this.branch = branch;
            this.leaves = leaves;
        }
        void grow()
        {
            age++;
            if(age % 2 == 0)
            {
                height++;
                branch++;
                leaves+=20;
            }
            else
            {
                height+=2;
                branch+=2;
                leaves+=40;
            }
        }
        void shedLeaves()
        {
            leaves-=20;
        }
        String getTreeInfo()
        {
            return (typeTree + " " + age + " " + height + " " + branch + " "+ leaves + "\n");
        }
    }
}