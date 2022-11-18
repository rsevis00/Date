package es.unileon.prg1.date;

public class Date{
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        
    }
     public boolean isSameDay(Date date2){
        boolean valor1;
        if (date2.getDay() == this.day){
            valor1 = true;
        }
        else
         valor1 = false;
        return valor1;
    }

    int getDay(){
        return this.day;
    }
    int getMonth(){
        return this.month;
    }
    int getYear(){
        return this.year;
    }

    public boolean isSameMonth(Date date2){
        boolean valor2;
        if (date2.getMonth() == this.month){
            valor2 = true;
        }
        else
         valor2 = false;
        return valor2;
    }
    public boolean isSameYear(Date date2){
        boolean valor3;
        if (date2.getYear() == this.year){
            valor3 = true;
        }
        else
         valor3 = false;
        return valor3;
    }
    public int monthDays (){
        int monthdays = 0;
        switch(this.getMonth()){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                monthdays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                monthdays = 30;
                break;
            case 2: 
                monthdays = 28;
                break;
        } 
        
        return monthdays;
    }
    public boolean isDayRight (){
        return this.day <= this.monthDays();
    }    
    public String nameMonth (){
        String NameMonth = "";
        switch (this.month){
            case 1:
                NameMonth = "Enero";
                break;
            case 2:
                NameMonth = "Febrero";
                break;
            case 3:
                NameMonth = "Marzo";
                break;
            case 4:
                NameMonth = "Abril";
                break;
            case 5:
                NameMonth = "Mayo";
                break;
            case 6:
                NameMonth = "Junio";
                break;
            case 7:
                NameMonth = "Julio";
                break;
            case 8:
                NameMonth = "Agosto";
                break;
            case 9:
                NameMonth = "Septiembre";
                break;
            case 10:
                NameMonth = "Octubre";
                break;
            case 11:
                NameMonth = "Noviembre";
                break;
            case 12:
                NameMonth = "Diciembre";
                break;
        }
        return NameMonth;
    }
    public String getSeason (){
        String season = "";
        switch (this.month){
            case 12:
            case 1:
            case 2:
                season = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                season = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                season = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                season = "Otoño";
                break;
        }
        return season;
    }
    public void getDaysUntilEndMonth(){
        for (int i=this.day; i<=this.monthDays(); i++){
            System.out.println(i + "/" + this.month + "/" + this.year);
        }
    }
    public String toString(){
       StringBuffer salida = new StringBuffer();
       salida.append(this.day+"/"+this.month+"/"+this.year);
       return salida.toString();
    }
    public int getMonthsUntilEndYear(){
        if (this.isDayRight()){
            return 12-this.month;
        }
        System.out.println("Ecriba un mes valido entre 1 y 12");
        return 0;
        
      
    }
    public String getSameDaysMonths(){
        String monthSameDays = "";
        switch (this.monthDays()){
            case 30:
                monthSameDays = "Abril, Junio, Septiembre, Noviembre";
                break;
            case 31:
                monthSameDays = "Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
                break;
            default:
                monthSameDays = "Febrero";
                break;
        }
        return monthSameDays;
    }
    public void getDaysSinceStartYear(){
        for (int i=this.day, j=this.month; j>0; i++, j--){
            System.out.println(i);  
        } 
    }
    //Build a method that counts the number of attempts needed to generate a random date equals to a given date (only inside the same year)
    public void attemptsRandomDateEqual(){
        double randomDay = Math.random()*30+1;
        double randomMonth = Math.random()*12+1;
        int attempts;
        attempts = 0;
        while ( randomDay != this.day && randomMonth != this.month){
            attempts = attempts + 1;
        }
        System.out.println(attempts);
        do {
            attempts = attempts + 1;
        } while (randomDay != this.day && randomMonth != this.month);
        System.out.println(attempts);
    }
    //For a given date and knowing the day of the week of the first day of the year of that date, return the day of the week of the given date.
    public int getDaysPass(){
        int daypass = this.day;
        while ( this.month > 1){
            daypass = daypass + this.monthDays();
            this.month = this.month - 1;
        }
        return daypass;
    }
    public String getWeekDay(){
        String namedayweek = "";
        int modulodays = this.getDaysPass()/7;
        int dayweek = this.getDaysPass() - (modulodays * 7);
        switch (dayweek){
            case 1:
                namedayweek = "Lunes";
                break;
            case 2:
                namedayweek = "Martes";
                break;
            case 3:
                namedayweek = "Miércoles";
                break;
            case 4:
                namedayweek = "Jueves";
                break;
            case 5:
                namedayweek = "Viernes";
                break;
            case 6:
                namedayweek = "Sabado";
                break;
            case 7:
                namedayweek = "Domingo";
                break;
        }
        return namedayweek;
    }

}