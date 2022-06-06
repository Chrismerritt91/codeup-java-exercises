public class JavaSyntaxLectureFollow {
    public static void main(String[] args) {

        int weight;
        String breed;


        weight = 10;
        breed = "Cavalier King Charles Spaniel";

        String name = "Grinch";

        int cutenessFactor;
        cutenessFactor = 10;

//        System.out.println(name + " is a " + weight + "lb " + breed);

//        if(cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " is one ugly dog, but I still love it.");
//        }

        byte smol = 12;
//        System.out.println(smol);

        long big = 9000000000L;
//        System.out.println(big);

//        big = smol;
//        System.out.println(big);

        smol = (byte) big;
        System.out.println(smol);

        float imaFloat;
        double imaDouble = 9.012345678901;
        System.out.println(imaDouble);
        imaFloat = (float) imaDouble;
        System.out.println(imaFloat);
    }
}
