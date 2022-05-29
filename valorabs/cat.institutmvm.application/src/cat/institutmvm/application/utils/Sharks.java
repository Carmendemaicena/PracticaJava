package cat.institutmvm.application.utils;

import java.time.LocalTime;

public class Sharks {
    private String spices,habitat,wind_direction,bait,sex;
    private int depth,min,wind,cloudiness,boats,num_hook;
    private double temperature;
    private int parasits,hook;
    private LocalTime hour;
    public Sharks(String spices,String habitat,int depth,int min,int cloudiness,int wind,String wind_direction,
                  LocalTime hour,int boats,double temperature,String bait, String sex,int parasits,int hook,int num_hook){
        this.setSpices(spices);
        this.setHabitat(habitat);
        this.setDepth(depth);
        this.setMin(min);
        this.setCloudiness(cloudiness);
        this.setWind(wind);
        this.setWind_direction(wind_direction);
        this.setHour(hour);
        this.setBoats(boats);
        this.setTemperature(temperature);
        this.setBait(bait);
        this.setSex(sex);
        this.setParasits(parasits);
        this.setHook(hook);
        this.setNum_hook(num_hook);
    }

    public String getSpices() {return spices;}

    public void setSpices(String spices) {this.spices = spices;}

    public String getHabitat() {return habitat;}

    public void setHabitat(String habitat) {this.habitat = habitat;}

    public String getWind_direction() {return wind_direction;}

    public void setWind_direction(String wind_direction) {this.wind_direction = wind_direction;}

    public String getBait() {return bait;}

    public void setBait(String bait) {this.bait = bait;}

    public String getSex() {return sex;}

    public void setSex(String sex) {this.sex = sex;}

    public int getDepth() {return depth;}

    public void setDepth(int depth) {this.depth = depth;}

    public int getMin() {return min;}

    public void setMin(int min) {this.min = min;}

    public int getWind() {return wind;}

    public void setWind(int wind) {this.wind = wind;}

    public int getCloudiness() {return cloudiness;}

    public void setCloudiness(int cloudiness) {this.cloudiness = cloudiness;}

    public int getBoats() {return boats;}

    public void setBoats(int boats) {this.boats = boats;}

    public int getNum_hook() {return num_hook;}

    public void setNum_hook(int num_hook) {this.num_hook = num_hook;}

    public double getTemperature() {return temperature;}

    public void setTemperature(double temperature) {this.temperature = temperature;}

    public int getParasits() {return parasits;}

    public void setParasits(int parasits) {this.parasits = parasits;}

    public int getHook() {return hook;}

    public void setHook(int hook) {this.hook = hook;}

    public LocalTime getHour() {return hour;}

    public void setHour(LocalTime hour) {this.hour = hour;}
}
