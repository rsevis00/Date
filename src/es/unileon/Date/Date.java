public Class Date{
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
        if (this.date2 == this.date1){
            System.out.println("Ambas fechas son iguales.");
        }
        else 
         System.out.println("Las fechas difieren.");
    }
    public boolean monthDays (){
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
}