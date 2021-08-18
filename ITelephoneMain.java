public class ITelephoneMain{
   public static void main(String[] args){
      ITelephone ericsPhone;
      ericsPhone = new DeskPhone(123456);
      ericsPhone.powerOn();
      ericsPhone.callPhone(123456);
      ericsPhone.answer();
      
      //ITelephone ericsPhone; dont need to define again even to make a mobile phone object
      ericsPhone = new MobilePhone(24565);
      ericsPhone.powerOn();
      ericsPhone.callPhone(24565);
      ericsPhone.answer();
   }
}