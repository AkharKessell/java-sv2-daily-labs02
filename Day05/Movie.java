package Day05;

public class Movie {

    private String title;
    private int yearOfProduction;
    private double avgRate;
    private int sumOfRatings;
    private int sumOfVoters;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }
    public double MovieRate(int rate){
        this.sumOfRatings += rate;
        this.sumOfVoters += 1;

        this.avgRate = (sumOfRatings*1.0)/sumOfVoters;

        return avgRate;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getAvgRate() {
        return avgRate;
    }
}
