public class Main {

    public static void main(String[] args){
        project_car car = new project_car(); // calling the other classes
        project_road road = new project_road();
    }

    public static int calc_accelerattion(project_car car, project_road road){
    	double  positive_acc = project_car.getPositiveAcceleration();
        double  negative_acc = project_car.getNegativeAcceleration();
        double  sp = car.getSpeed();
        double  dur = project_road.getDuration();

        double  d = car.getDist();
        double  intersection = project_road.getIntersection();

        double first_part, second_part;
        first_part = (sp * dur) + (positive_acc * dur/2 * dur);
        second_part = (sp * dur) - (negative_acc * dur/2 * dur);

        System.out.println(dur + ", " + intersection);
        System.out.println(" ");

        // print the speed, initial distance, positive and negative accelerations
        System.out.println(sp + ", " + d + ", " + positive_acc + ", " + negative_acc);

        // the distance calculated by the positive accelration
        System.out.println(first_part);

 		System.out.println(" ");

        // the distance calculated by the negative accelration
        System.out.println(second_part);
       

        if(d + intersection <= first_part){
            return 1;
        } else if(second_part <= d){
            return 0;
        } else { 
            return -1;
        }
    }
}








