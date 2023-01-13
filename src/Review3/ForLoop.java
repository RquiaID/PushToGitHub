package Review3;

public class ForLoop {
    public static void main(String[] args) {
        //1. Initialization
        //2. condition
        //3. if true=>code goes inside the loop body
        // goes back, increment
        // repeat

        for(int i=1; i<=5; i++){

            System.out.println("Hello"+i);

             // first initialization of variable  happens first then we are checking the condition then whenever
             // the condition is true java has a permission to get to the block of code based on condition
            // then increment happens

        }

        System.out.println("---------------------------");
        for(int a=0; a<8; a+=4){

            System.out.println("Bye");
        }

        System.out.println("----------------------------");
            //ini     condition is false
        for(int i=2 ; i>10; i++){

            System.out.println(i);
        }
        System.out.println("--------------");
        for (int j=3; j<10;j--){
            System.out.println(j);
        }

        System.out.println("End");
    }
}
