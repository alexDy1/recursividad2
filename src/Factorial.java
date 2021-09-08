public class Factorial {

    public static int factorialSinRecursividad(int numero){
        int factorial = 1;

        for (int i = numero; i > 0 ; i--) {
            factorial= factorial * i;
        }

        return factorial;
    }



    public static int factorial(int numero) {
        //codigo fuente
        int factorial;


        if (numero == 1) { //CASP BASE
            factorial = numero;
        } else {
            factorial = numero * factorial(numero - 1);
        }
        //System.out.println(factorial);


        return factorial;
    }


    /**MAXIMO COMUN DIVISOR (MCD)

     **/

    public static int mcd(int a,int b){
        int mcd;
        if (a==b){
            //caso base
            mcd=b;
        }else {
            if (a>b){
                a= a-b;
            }else{
                b=b-a;
            }
            mcd = mcd(a,b);
        }
        return mcd;
    }


}
