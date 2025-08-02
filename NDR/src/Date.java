package NDR.src;
public class Date {
    private int years;
    private int month;
    private int day;
    //private int years,month,day;

    //Constructor (method that same name of class)
    public Date(int years,int month,int day){
        this.years = years;
        this.month = month;
        this.day   = day;
    }

    //Setter ไว้กำหนดค่าให้กับ attribute
    //Getter ไว้กำหนดค่าให้กับ object
    public int getYear(){
        return this.years;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    //Setter ไว้กำหนดค่าให้กับ attribute
    public void setYear(int year){
        this.years = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    //toString() เป็น method ที่เรียกใช้ด้เลยผ่าน object
    public String toString(){
        return String.format("%02d/%02d/%04d",month,day,years);
    }

    public void setDate(int years , int month , int day){
        this.years = years;
        this.month = month;
        this.day = day;
    }
    
}
