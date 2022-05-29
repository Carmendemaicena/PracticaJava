package cat.institutmvm.application.utils;

public class Others {
    private String spices, habitat;
    int abundancia;
    public Others(String spices, String habitat){
        this.setSpices(spices);
        this.setHabitat(habitat);
    }
    public String getSpices() {return spices;}
    public void setSpices(String spices) {this.spices = spices;}
    public String getHabitat() {return habitat;}
    public void setHabitat(String habitat) {this.habitat = habitat;}
}
