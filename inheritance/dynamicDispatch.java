// Dynamic Dispatch in Java


class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamicDispatch {
    public static void main(String[] args) {
   	
   	Phone ph = new Phone();
   	ph.showTime();
   	ph.on();
   	
   	SmartPhone sp = new SmartPhone();
   	sp.music();
   	sp.on();
   	
   	Phone php = new SmartPhone();
   	php.showTime();
   	php.on();
   	
   	SmartPhone sph = new Phone();
   	sph.showTime();
   	sph.on();
   	
    }
}

