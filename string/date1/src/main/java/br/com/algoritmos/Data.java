package br.com.algoritmos;

public class Data{
    private Integer day;
    private Integer month;
    private Integer year;

    public Data(){}

    public Data(Integer day, Integer month, Integer year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Data extractDateData(String data){
        String[] dataSplit = data.split("/");
        this.day = Integer.parseInt(dataSplit[0]);
        this.month = Integer.parseInt(dataSplit[1]);
        this.year = Integer.parseInt(dataSplit[2]);
        return this;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Data{" + "\n" +
                "   day=" + day + ",\n" +
                "   month=" + month + ",\n" +
                "   year=" + year + "\n" +
                '}';
    }
}
