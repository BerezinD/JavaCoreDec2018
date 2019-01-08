public class Task01_02 {

    public static void main(String[] args) {
        Task01_02.printTable(Task01_02.function(0.0,0.0,0.0));
    }

    //only before 1 million correct
    public static void printTable(double[][] array){
        System.out.println("\u250C-------------\u252C-------------\u2510");
        System.out.println("\u2502      x      \u2502     F(x)    \u2502");
        System.out.println("\u251C-------------\u253C-------------\u2524");
        for (double[] argument : array) {
            System.out.print("\u2502");

            for (double result : argument) {
                    System.out.printf("%10.4f%4s", result, "\u2502");
            }

            System.out.println(); //add new line
        }
        System.out.print  ("\u2514-------------\u2534-------------\u2518");
    }

    public static double[][] function(double start, double end, double step){
        if (end < start) return  function(end,start,step);
        if (step == 0.0) return new double[][] {{start,Math.tan(2.0*start)-3.0}};

        int amount = (int)((end - start)/step)+1;
        int counter = 0;
        double argument = start;
        double[][] result = new double[amount][2];

        while (argument <= end){
            result[counter][0] = argument;
            result[counter][1] = Math.tan(2.0*argument)-3.0;
            counter++;
            argument += step;
        }
        return result;
    }
}
