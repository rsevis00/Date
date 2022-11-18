package es.unileon.prg1.date;

public class Date{
    private int day;
    private int month;
    private int year;
    private Object aDay;
    private Object today;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        
    }

    public Date(Date today) {
    }

    public Date() throws DateException {
        if (year < 1) {
            throw new DateException("Date error: Year " + year + " not valid");
        }
        this.year = year;
        if (month < 1 || month > 12 ) {
            throw new DateException("Date error: Month " + month + " not valid");
        }
        this.month = month;
        if ( day < 1 || day > this.daysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " not valid");			
		}
		this.day = day;
    }

    public Date tomorrow() {
        return null;
    }

    public void setDay(int day) throws DateException {
		if ( day < 1 || day > this.daysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");			
		}
		this.day = day;
       
    	}

    public void setMonth (int month) throws DateException {
		if ( month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
	}
	
	public void setYear (int year) {
		this.year = year;
	}

    public boolean isSameDay(Date tomorrow){
        boolean valor1;
        if (tomorrow.getDay() == this.day){
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

    public boolean isSameMonth(Date aDay){
        boolean valor2;
        if (aDay.getMonth() == this.month){
            valor2 = true;
        }
        else
         valor2 = false;
        return valor2;
    }
    public boolean isSameYear(Date aDay){
        boolean valor3;
        if (aDay.getYear() == this.year){
            valor3 = true;
        }
        else
         valor3 = false;
        return valor3;
    }

    public boolean isSame (Date aDay){
        boolean valor4;
        if (this.aDay == this.today){
            valor4 = true;
        }
        else 
         valor4 = false;
        return valor4;
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
                getMonthName = "Enero";
                break;
            case 2:
                getMonthName = "Febrero";
                break;
            case 3:
                getMonthName = "Marzo";
                break;
            case 4:
                getMonthName = "Abril";
                break;
            case 5:
                getMonthName = "Mayo";
                break;
            case 6:
                getMonthName = "Junio";
                break;
            case 7:
                getMonthName = "Julio";
                break;
            case 8:
                getMonthName = "Agosto";
                break;
            case 9:
                getMonthName = "Septiembre";
                break;
            case 10:
                getMonthName = "Octubre";
                break;
            case 11:
                getMonthName = "Noviembre";
                break;
            case 12:
                getMonthName = "Diciembre";
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

    public String getDaysLeftOfMonth(){
        String daysleft = "";
        for (int i=this.day; i<=this.daysOfMonth(); i++){
            System.out.println((i + "/" + this.month + "/" + this.year).toString());
        }
        return daysleft;
    }
    public String toString(){
       StringBuffer salida = new StringBuffer();
       salida.append(this.day+"/"+this.month+"/"+this.year);
       return salida.toString();
    }
    public int getMonthsLeft(){
        if (this.isDayRight()){
            return 12-this.month;
        }
        System.out.println("Ecriba un mes valido entre 1 y 12");
        return 0;
        
      
    }
    public String getMonthsSameDays(){
        String monthSameDays = "";
        switch (this.daysOfMonth()){
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
    public int daysPast(){
        int daypass = 0;
        for (int i=this.day, j=this.month; j>0; i++, j--){
           daypass = daypass + 1;
        } 
        return daypass;
    }
    //Build a method that counts the number of attempts needed to generate a random date equals to a given date (only inside the same year)
    public int numRandomTriesEqualDate(){
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

        return attempts;
    }

    //For a given date and knowing the day of the week of the first day of the year of that date, return the day of the week of the given date.
    public int getDaysPass(){
        int daypass = this.day;
        while ( this.month > 1){
            daypass = daypass + this.daysOfMonth();
            this.month = this.month - 1;
        }
        return daypass;
    }
    
    public String dayOfWeek(int i){
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