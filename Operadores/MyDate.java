/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

class MyDate {

    private int day;

    private int month;

    private int year;

    // Write the missing constructor here
    public MyDate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        this.day = day;

    }

    public int getMonth() {

        return month;

    }

    public void setMonth(int month) {

        this.month = month;

    }

    public int getYear() {

        return year;

    }

    public void setYear(int year) {

        this.year = year;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this)//si el objeto es igual al mismo 
        {
            return true;
        }

        if (obj == null && this == null) {
            return true;
        }

        if (obj == null) {
            return false;
        }
       
        if (obj instanceof MyDate) {
            MyDate c = (MyDate) obj;
            return (this.day == c.day && this.month == c.month && this.year == c.year);
        } else {
            return false;

        }
    }

   
}
