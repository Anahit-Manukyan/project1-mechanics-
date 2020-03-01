public class project_car {
    public double positive_acc, negative_acc, init_dist, speed;

    public double createRand(double minimum, double maximum){
        if(maximum <= minimum){
            System.out.println("The arguments are not correct");
        }
        double rand = (maximum - minimum) * Math.random() + minimum;
        return rand;
    }


    public Car(){
        positive_acc = 1.5; 
        negative_acc = 1.5;
        init_dist = 35;
        speed = 12.75;   
    }



    public double getPositiveAcceleration(){
        return positive_acc;
    }

    public double getNegativeAcceleration(){
        return negative_acc;
    }

    public void setNegativeAcceleration(double dist){
        negative_acc = dist;
    }

    public void setPositiveAcceleration(double dist){
        positive_acc = dist;
    }

    public double getSpeed(){
    	return speed;
    }

    public double getDist(){
        return init_dist;
    }

    public void setSpeed(double dist){
        speed = dist;
    }

    public void setDist(double dist){
        init_dist = dist;
    }

}








