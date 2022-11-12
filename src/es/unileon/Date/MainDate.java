class MainDate{
    public static void main(Sting [] args){
        Date date1 = new Date (2,11,2022);
        Date date2 = new Date (1,11,2022);

        System.out.println(date1.isSameMonth(date2));
        System.out.println(date1.isSame(date2));
        
    }
}