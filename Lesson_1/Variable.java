class Variable {
    public static void main(String[] args) {
        byte numCore = 8;
        short cpu = 3400;
        int memory = 8000;
        long longNum = 1253657L;
        float pi = 3.14F;
        double cpu2 = 3.40;
        char symbol = '#';
        boolean b = true;

        System.out.println("Num_core = " + numCore);
        System.out.println("CPU = " + cpu + " MHz");
        System.out.println("Memory = " + memory + " MHz" );
        System.out.println("Processor = " + cpu2 + " GHz");
        System.out.println("---------------------");
        System.out.println("Long var = " + longNum);
        System.out.println("Pi = " + pi);
        System.out.println("Char = " + symbol);
        System.out.println("Boolean var = " + b);
    }
}