package Homework1;

public class SalesPerson {
    private String lastName;
    private String firstName;
    private double ytdSales;

public SalesPerson(String lastIn, String firstIn){
lastName = lastIn;
firstName = firstIn;
ytdSales = 0;
}

public void recordSale(double saleAmount){
ytdSales += saleAmount;
}

public String toString() {
return lastName + ", " + firstName + " YTD Sales: " + ytdSales;
}

public String getName(){
return lastName + ", " + firstName;
}

public void setLastname(String lastName) {
this.lastName = lastName;
}


public void setFirstName(String firstName) {
this.firstName = firstName;
}


public double getYtdSales() {
return ytdSales;
}

public void setYtdSales(double ytdSales) {
this.ytdSales = ytdSales;
}
}
