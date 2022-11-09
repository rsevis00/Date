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
        if (date2get.day == this.day){
            System.out.println("Los dias coinciden.");
        }
        else
         System.out.println("Los dias son diferentes.");
    }
    public boolean isSameMonth(Date date2){
        if (date2get.month == this.month){
            System.out.println("Los meses coinciden.");
        }
        else
         System.out.println("Los meses son diferentes.");
    }
    public boolean isSameYear(Date date2){
        if (date2get.year == this.year){
            System.out.println("Los años coinciden.");
        }
        else
         System.out.println("Los años son diferentes.");
    }
    public boolean isSame (Date date2){
        if (this.date2 == this.date1){
            System.out.println("Ambas fechas son iguales.");
        }
        else 
         System.out.println("Las fechas difieren.");
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