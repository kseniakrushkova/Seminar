package JCF;

public class TablesString {
    private String nameDiscipline;
    private int hard;
    private String rating;

    public String getNameDiscipline() {
        return nameDiscipline;
    }

    public void setNameDiscipline(String nameDiscipline) {
        this.nameDiscipline = nameDiscipline;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public TablesString(String nameDiscipline, int hard, String rating) {
        this.nameDiscipline = nameDiscipline;
        this.hard = hard;
        this.rating = rating;
    }
}
