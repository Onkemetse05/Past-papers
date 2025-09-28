package pkg2024ta.q2;

public abstract class RoadAccidents implements IRoadAccidents{
    private String vehicleType;
    private String city;
    private int accidentTotal;
    
    public RoadAccidents(String vehicleType, String city, int accidentTotal){
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }
    
    @Override
    public String getAccidentVehicleType(){
        return vehicleType;
    }
    
    @Override
    public String getCity(){
        return city;
    }
    
    @Override
    public int getAccidentTotal(){
        return accidentTotal;
    }
    

}
