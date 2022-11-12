public class Date{
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        int get.day(){
            return this.day;
        }
        int get.month(){
            return this.month;
        }
        int get.year(){
            return this.year;
        }
    }
     public boolean isSameDay(Date date2){
        boolean valor1;
        if (date2.getday == this.day){
            valor1 = true;
        }
        else
         valor1 = false;
        return valor1;
    }
    public boolean isSameMonth(Date date2){
        boolean valor2;
        if (date2.getMonth == this.month){
            valor2 = true;
        }
        else
         valor2 = false;
        return valor2;
    }
    public boolean isSameYear(Date date2){
        boolean valor3;
        if (date2.getYear == this.year){
            valor3 = true;
        }
        else
         valor3 = false;
        return valor3;
    }
    public boolean isSame (Date date2){
        boolean valor3;
        if (this.date2 == this.date1){
            valor4 = true;
        }
        else 
         valor4 = false;
        return valor4;
    }
    public int monthDays (){
        int monthdays = 0;
        swicth(this.getMonth()){
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
        String NameMonth;
        swicth (this.month){
            case 1:
                nameMonth = "Enero";
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
        String season;
        swicth (this.month){
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
    void getDaysUntilEndMonth(){
        for (int i=this.day; i<=this.monthDays(); i++){
            System.out.println(i + "/" + this.month + "/" + this.year);
        }
    }
    public String getDateString(){
        String dateString = Integer.toString(Date);
    }
    public void getMonthsUntilEndYear(){
        for (int i=this.month; i<=12; i++){
            System.out.println(i.getseason());
        }
    }
    public void getSameDaysMonths(){
        String monthSameDays;
        swicth (this.monthDays){
            case 30:
                monthSameDays = "Abril, Junio, Septiembre, Noviembre";
                break;
            case 31:
                monthSameDays = "Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
                break;
            default:
                monthSameDays = "No hay ninguno";
                break;
        }
        return monthSameDays;
    }
    public int getDaysFromDate (){
        int totalDays = this.
    }
    public void getDaysSinceStartYear(){
        for (int i=this.day, j=this.month; j>0; i++, j--){
            System.out.println(i);  
        } 
    }
    //Build a method that counts the number of attempts needed to generate a random date equals to a given date (only inside the same year)
    public int attemptsRandomDateEqual(){
        double randomDay = Math.random()*30+1
        double randomMonth = Math.random()*12+1
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

}