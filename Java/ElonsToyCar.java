public class ElonsToyCar {
    private int distanceDriven = 0;
    private int batteryPercentage = 100;


    //This method allows the automatic creation of objects
    //It returns a 'ElonsToyCar' type because it is return an object
    public static ElonsToyCar buy(){
        return new ElonsToyCar();
    }

    public int distanceDisplay(){
        return this.distanceDriven;
    }

    public String batteryDisplay(){
        
    	if (this.batteryPercentage == 0) {
    		return "Battery empty";
    	}
        else{
            return this.batteryPercentage + "%";
        }
    }

    public void drive(){
        if(this.batteryPercentage != 0){
            this.distanceDriven += 20;
            this.batteryPercentage --;
        }
    }    
}
