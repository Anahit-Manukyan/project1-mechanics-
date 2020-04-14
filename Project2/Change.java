public class  Change{
	public static int g = 10; // rounded

	public int M1;
    public int M2;
    public int M3;
    public int F;

	public static int forceMax = 300; 
    public static int forceMin = -300; // all forces are [-300, 300]N 
 
    public static double Mmin = 0; 
    public static double Mmax = 100;
    public static double frMax = 0.5; // the maximum value of friction
    public static double frMin = 0; // the minunum value of mu

    public double fric1; //friction
    public double fric2;
    public double fric3;

    public Change(int M1,int M2,int M3, double fric1,double fric2,double fric3, int F)
    {
    	// here we consider the cases, where the values of variables above does not satisfy to the requirements 
    	// as a result the program stops working 

    	// consider if the masses are heavy or light
    	if(M3 <= Mmax && M3> Mmin)
            this.M3 = M3;
        else {
        	System.out.println("Incorrect value");
            return;
        }

    	if(M2 <= Mmax && M2> Mmin)
            this.M2 = M2;
        else {
        	System.out.println("Incorrect value");
            return;
        }

        if(M1 <= Mmax && M1> Mmin)
            this.M1 = M1;
        else {
        	System.out.println("Incorrect value");
            return;
        }

        // consider if mu belongs to the given range

        if(fric1 <= frictionMax && fric1 >= frMin)
            this.fric1 = fric1;
        else {
        	System.out.println("Incorrect value");
            return;
        }

        if(fric2 <= frictionMax && fric2 >= frMin)
            this.fric2 = fric2;
        else {
        	System.out.println("Incorrect value");
            return;
        }

        if(fric3 <= frictionMax && fric3 >= frMin)
            this.fric3 = fric3;
        else {
        	System.out.println("Incorrect value");
            return;
        }

        // consider if the force is in the range 
        if(F <= forceMax && F >= forceMin)
            this.F = F;
        else {
            System.out.println("Incorrect value");
        }

    }
}






