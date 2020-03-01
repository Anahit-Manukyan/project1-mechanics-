public class project_road {
    public double lightDur, intersectionDist;

    public Road(){
        lightDur = 3.75; // the value is between 2 and 5
        intersectionDist = 9.55; // the value is between between 5 and 20
    }


    public double getIntersection(){ // we are getting the intersection and then setting the initial values to make later calculations
        return intersectionDist;
    }
    public void setIntersection(double intersect){
        intersectionDist = intersect;
    }

    public double getDuration(){
        return lightDur;
    }
    public void setDuration(double dur){
        lightDur = dur;
    }



    public double randomize(double minimum, double maximum){ // working with random variables as an experiment
        if(maximum <= minimum){
            System.out.print("The arguments are not correct");
        }
        double rand = (maximum - minimum) * Math.random() + minimum;
        return rand;
    }
}

