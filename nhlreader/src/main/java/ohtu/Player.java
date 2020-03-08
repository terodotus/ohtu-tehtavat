
package ohtu;

public class Player {
    private String name;
    private String joukkue;
    private int maalienMaara;
    private int syotot;
    private int pisteet;
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getPisteet() {
        return pisteet;
    }

    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    public String getJoukkue() {
        return joukkue;
    }

    public void setJoukkue(String joukkue) {
        this.joukkue = joukkue;
    }

    public int getMaalienMaara() {
        return maalienMaara;
    }

    public void setMaalienMaara(int maalienMaara) {
        this.maalienMaara = maalienMaara;
    }

    public int getSyotot() {
        return syotot;
    }

    public void setSyotot(int syotot) {
        this.syotot = syotot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
      
}
