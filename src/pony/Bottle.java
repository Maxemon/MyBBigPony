package pony;

/**
 * Created by Кукуша on 10.03.2015.
 */
public class Bottle {
    private final double volume;
    private double fill;

    public Bottle(double volume) {
        this.volume = volume;
        this.fill = 0;
    }
    public void addfill(double fill){
        if (fill<0) {
            return;
        }
        this.fill += fill;
        if (this.fill>volume){
            this.fill=volume;
        }

    }
    public void removefill(double fill){

        if (fill<0){
            return;
        }
        this.fill -= fill;
        if (this.fill<0){
            this.fill=0;
        }
    }
    public double getFill (){
        return this.fill;
    }
    public double getVolume()
    {
        return this.volume;
    }



}
