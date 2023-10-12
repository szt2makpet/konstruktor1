public class Main {
    public static void main(String[] args) {
        Person szemely = new Person("Sajt32","Trapista");


        szemely.setSzulev(2000);
        szemely.setSzulhonap(01);
        szemely.setSzulnap(01);


        szemely.setKeresztnev("Nem sajt");
        System.out.println("sajt:" + szemely.keresztnev);
    }
}