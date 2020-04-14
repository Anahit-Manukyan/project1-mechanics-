public class Main {

    public static int g = 10; 

        public static void main(String[] RTL)
        {
            Change system = new Change(10,20,30,40,50,60,77,99,31,125,0.1,0.5,22,0.55);

            // we assign the mu-s to the friction, so that they belong to the range
            double mu1 = system.fric1; 
            double mu2 = system.fric2;
            double mu3 = system.fric3;

            // we do the same for the masses and Force
            double M1= system.M1;
            double M2 = system.M2;
            double M3 = system.M3;
            double F = system.F;
            
            // the values are: 
            System.out.println("M1 = " + M1);
            System.out.println("M2 = " + M2);
            System.out.println("M3 = " + M3);
            System.out.println("mu1 = " + mu1);
            System.out.println("mu2 = " + mu2);
            System.out.println("mu3 = " + mu3);
            System.out.println("F = " + F);


            // run the function different times (here i is the t in F(t))
            for (int i = 1; i<=100; i+=10)
            {
                System.out.println("For t = "+ i);
                position(M1, M2, M3, mu1, mu2, mu3, F, i);

            }


        }
        public static void position(double M1,double M2,double M3, double mu1,double mu2,double mu3, double F, double t)
        {
            double a1;
            double a2;
            double a3;
            double T;
            double x1, x2, x3,y3;

            T = ((1+mu3)/(M1+M3)*(-mu1*g*(M1+M2)-F)+g*(1-mu2))/(1/(M1+M3)*(1+mu1+mu3+mu1*mu3)+1.0/M2+1.0/M3);

            // we use the formulas 
            a1 = (-F-mu1*(M1*g+M2*g+T)-T)/(M1+M3); 
            a2 = (T+mu2*M2*g)/M2;
            a3 = (T - M3*g - mu3*M3*a1) / M3;

            x1 = a1*t*t/2;
            System.out.println(x1 + ": the x position of M1");
            // y coordinate of M1 does not change since it moves only horizontally
            
            x2 = a2*t*t/2;
            System.out.println(x2 + ": the x position of M2");
            // y coordinate of M2 does not change since it moves only horizontally

            x3 = x1;
            System.out.println(x3 + ": the x position of M3");

            y3 =  a3*t*t/2;
            System.out.println(y3 + ": the y position of M3");

        }
}




