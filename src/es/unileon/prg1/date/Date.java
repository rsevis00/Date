package es.unileon.prg1.date;

public class Date{
    private int day;
    private int month;
    private int year;
       
    public Date(int day, int month, int year) throws DateException {
        if (year < 1) {
            throw new DateException("Date error: Year " + year + " not valid");
        }
        this.year=year;
        if (month < 1 || month > 12 ) {
            throw new DateException("Date error: Month " + month + " not valid");
        }
        this.month=month;
        if ( day < 1 || day > this.daysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " not valid");			
		}
        this.day=day;
    }
    
    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 2017;
        
    }

    public Date(Date today) {
        this.day = 1;
        this.month = 1;
        this.year = 2017;
        
    }
    
    public Date today() throws DateException {
        Date today = new Date(1,1,2017);
        return today;
    }

    public Date tomorrow() throws DateException {
        Date tomorrow = new Date();
        try {
            
            if (this.getDay() == this.daysOfMonth() && this.getMonth() != 12){
                tomorrow.setDay(1);
                tomorrow.setMonth(this.getMonth() + 1);
            } else if (this.getMonth() == 12 && this.getDay() == 31){
                tomorrow.setDay(1);
                tomorrow.setMonth(1);
                tomorrow.setYear(this.getYear()+1);
            } else {
                tomorrow.setDay(this.getDay()+1);
            tomorrow.setMonth(this.getMonth());
            tomorrow.setYear(this.getYear());
            }
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }
        return tomorrow;
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }


    public int setDay(int n) throws DateException {
        this.day = n;
		if ( day < 1 || day > this.daysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");			
		}
        return this.day;
    	}

    public int setMonth (int n) throws DateException {
		this.month = n;
        if ( month < 1 || month > 12) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");
		}
        if ( day > this.daysOfMonth()) {
            throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");
        }
		return this.month;
	}
	
	public int setYear (int n) throws DateException {
		this.year = n;
        if (year < 1) {
            throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");
        }
        return this.year;
	}

    public boolean isSameDay(Date aDay){
        boolean valor;
        if (aDay.getDay() == this.day){
            valor = true;
        }
        else
         valor = false;
        return valor;
    }


    public boolean isSameMonth(Date date){
        boolean valor2;
        if (date.getMonth() == this.month){
            valor2 = true;
        }
        else
         valor2 = false;
        return valor2;
    }
    public boolean isSameYear(Date date){
        boolean valor3;
        if (date.getYear() == this.year){
            valor3 = true;
        }
        else {
         valor3 = false;
        }
        return valor3;
    }

    public boolean isSame (Date date){
        boolean valor;
        if (this.day == date.getDay() && this.month == date.getMonth() && this.year == date.getYear()){
            valor = true;
        }
        else {
         valor = false;
        }
        return valor;
    }

    public int daysOfMonth (){
        int getdaysofdaysOfMonth = 0;
        switch(this.getMonth()){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                getdaysofdaysOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                getdaysofdaysOfMonth = 30;
                break;
            case 2: 
                getdaysofdaysOfMonth = 28;
                break;
        } 
        
        return getdaysofdaysOfMonth;
    }
    public boolean isDayRight (){
        return this.day <= this.daysOfMonth();
    }    
    public String getMonthName (){
        String getMonthName = "";
        switch (this.month){
            case 1:
                getMonthName = "January";
                break;
            case 2:
                getMonthName = "February";
                break;
            case 3:
                getMonthName = "March";
                break;
            case 4:
                getMonthName = "April";
                break;
            case 5:
                getMonthName = "May";
                break;
            case 6:
                getMonthName = "June";
                break;
            case 7:
                getMonthName = "July";
                break;
            case 8:
                getMonthName = "August";
                break;
            case 9:
                getMonthName = "September";
                break;
            case 10:
                getMonthName = "October";
                break;
            case 11:
                getMonthName = "November";
                break;
            case 12:
                getMonthName = "December";
                break;
        }
        return getMonthName;
    }
    public String getSeasonName (){
        String season = "";
        switch (this.month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
        }
        return season;
    }

    public String getDaysLeftOfMonth(){
        StringBuffer salida = new StringBuffer();
        while (this.day < this.daysOfMonth()){
            this.day++;
            salida.append(this + " ");
        }
        return salida.toString();
    }
    public String toString(){
       StringBuffer salida = new StringBuffer();
       salida.append(this.day+"/"+this.month+"/"+this.year);
       return salida.toString();
    }
    public String getMonthsLeft(){
        String monthsleft = "";
        int monthsleft2 = 12 - this.month;      
        switch (monthsleft2){
            case 1:
                monthsleft = "December ";
                break;
            case 2:
                monthsleft = "November December ";
                break;
            case 3:
                monthsleft = "October November December ";
                break;
            case 4:
                monthsleft = "September October November December ";
                break;
            case 5:
                monthsleft = "August September October November December ";
                break;
            case 6:
                monthsleft = "July August September October November December ";
                break;
            case 7:
                monthsleft = "June July August September October November December ";
                break;
            case 8:
                monthsleft = "May June July August September October November December ";
                break;
            case 9:
                monthsleft = "April May June July August September October November December ";
                break;
            case 10:
                monthsleft = "March April May June July August September October November December ";
                break;
            case 11:
                monthsleft = "February March April May June July August September October November December ";
                break;
        }
        return monthsleft;
    }
    public String getMonthsSameDays(){
        String monthSameDays = "";
        switch (this.daysOfMonth()){
            case 30:
                monthSameDays = "April June September November ";
                break;
            case 31:
                monthSameDays = "January March May July August October December ";
                break;
            default:
                monthSameDays = "February ";
                break;
        }
        return monthSameDays;
    }
    public int daysPast(){
        int daypass = this.day -1;
        while ( this.month > 1){
            this.month = this.month - 1;
            daypass = daypass + this.daysOfMonth();
        }
        return daypass;
    }

    public int numRandomTriesEqualDate(){
        double randomDay = 0;
        double randomMonth = 0;
        int attempts;
        attempts = 0;
        while ( randomDay != this.day && randomMonth != this.month){
            randomDay = Math.random()*30+1;
            randomDay = (int) randomDay;
            randomMonth = Math.random()*12+1;
            randomMonth = (int) randomMonth;
            attempts = attempts + 1;
        }
        System.out.println(attempts);
      

        return attempts;
    }

    public int getDaysPass(){
        int daypass = this.day -1;
        while ( this.month > 1){
            daypass = daypass + this.daysOfMonth();
            this.month = this.month - 1;
        }
        return daypass;
    }
    
    public String dayOfWeek(int i){
        String namedayweek = "";
        int daypass = this.daysPast();
        int dayweek = daypass%7;
        switch (dayweek){
            case 0:
                namedayweek = "Monday";
                break;
            case 1:
                namedayweek = "Tuesday";
                break;
            case 2:
                namedayweek = "Wednesday";
                break;
            case 3:
                namedayweek = "Thursday";
                break;
            case 4:
                namedayweek = "Friday";
                break;
            case 5:
                namedayweek = "Saturday";
                break;
            case 6:
                namedayweek = "Sunday";
                break;
        }
        return namedayweek;
    }

}