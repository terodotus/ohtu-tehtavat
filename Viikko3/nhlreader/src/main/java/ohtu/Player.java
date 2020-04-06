
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String team;
    private int goals;
    private int assists;
    private int pisteet;
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void laskePisteet() {
        this.pisteet=this.getGoals() + this.getAssists();
    }

    public int getPisteet() {
        this.laskePisteet();
        return this.pisteet;
    }

    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName() + " team " + this.getTeam() + " goals " + this.getGoals() + " assists " + this.getAssists() + " total " + this.getPisteet();
    }

    @Override
    public int compareTo(Player o) {
        if (this.getPisteet() == o.getPisteet()) {
            return 0;
        } else if (this.getPisteet() > o.getPisteet()) {
            return 1;
        } else {
            return -1;
        }
    }
      
}
