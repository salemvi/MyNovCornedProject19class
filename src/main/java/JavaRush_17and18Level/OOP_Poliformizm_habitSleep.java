package JavaRush_17and18Level;

public class OOP_Poliformizm_habitSleep {
}
 interface habitSleep{
    String HowSleep();
}
interface Human extends habitSleep{

}
 class father implements Human{
     @Override
     public String HowSleep() {
         return "Папа спит на спине и храпит";
     }
 }
 class mother implements Human{
     @Override
     public String HowSleep() {
         return "Мама спит на боку и пинается";
     }
 }
 class bedRoom {
     public static void main(String[] args) {
         for (int i = 0; i < 10; i++) {
             habitSleep randomPerson = (habitSleep) WatchWhoSleep();
             System.out.println(randomPerson.HowSleep());

         }
     }


     public static Object WatchWhoSleep() {
         int a = 1 + (int) (Math.random() * 2);
         if (a == 1) {
             return new mother();
         }
         if (a == 2) {
             return new father();
         }
        return null;

     }
 }
