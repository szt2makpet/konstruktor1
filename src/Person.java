public class Person {
    String keresztnev;
    String vezeteknev;
    int szulev = 0;
    int szulhonap = 0;
    int szulnap = 0;

    public Person(String keresztnev, String vezeteknev, int szulev, int szulhonap, int szulnap) {
        this.keresztnev = keresztnev;
        this.vezeteknev = vezeteknev;
        this.szulev = szulev;
        this.szulhonap = szulhonap;
        this.szulnap = szulnap;
    }

    public Person(String keresztnev, String vezeteknev) {
        this.keresztnev = keresztnev;
        this.vezeteknev = vezeteknev;
    }

    public void printSzemely(){
        System.out.printf("Név: %S %S %d %d %d", keresztnev , vezeteknev , szulev, szulhonap, szulnap);

    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public int getSzulev() {
        return szulev;
    }

    public void setSzulev(int szulev) {

        this.szulev = szulev;
    }

    public int getSzulhonap() {
        return szulhonap;
    }

    public void setSzulhonap(int szulhonap) {
        this.szulhonap = szulhonap;
    }

    public int getSzulnap() {
        return szulnap;
    }

    public void setSzulnap(int szulnap) {
        this.szulnap = szulnap;
    }
}
/*
    1.  Person classlól:
a firstName és lastName van csak megadva
firstName, lastName, birthYear, birthMonth, birthDay
írasd ki a példány a printPerson metódussal
állítsd ne a  birthYear, birthMonth, birthDay adatokat, ahol hiányoznak
módosítsd az adatokat
*/
