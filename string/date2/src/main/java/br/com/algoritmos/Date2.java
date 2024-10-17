package br.com.algoritmos;

public class Date2 {

    private String day;
    private String month;
    private String year;

    public Date2() {
    }

    public Date2(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date2 formatDate2(Integer day, Integer month, Integer year) {
        String dayFormat = String.valueOf(day).length() == 1 ? "0" + day : String.valueOf(day);
        String monthFormat = String.valueOf(month).length() == 1 ? "0" + month : String.valueOf(month);
        String yearFormat = String.valueOf(year);

        this.day = dayFormat;
        this.month = monthFormat;
        this.year = yearFormat;

        return this;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date2{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
