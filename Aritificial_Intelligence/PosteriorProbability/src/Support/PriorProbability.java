/*
 * Yogesh, Kalapala
 * yxk9640
 * 1001879640
 *  */

package Support;

public  class PriorProbability {
    //h1
    public static double Cherry_h1(){ return 1.0F; }
    public static double Lime_h1(){ return 0.0F; }
    //h2
    public static double Cherry_h2(){ return 0.75F; }
    public static double Lime_h2(){ return 0.25F; }
    //h3
    public static double Cherry_h3(){ return 0.5F; }
    public static double Lime_h3(){ return 0.5F; }
    //h4
    public static double Cherry_h4(){ return 0.25F; }
    public static double Lime_h4(){ return 0.75F; }
    //h5
    public static double Cherry_h5(){ return 0.0F; }
    public static double Lime_h5(){ return 1.0F; }

    public static double p0_h1(){return (double) 0.1;}
    public static double p0_h2(){return (double) 0.2;}
    public static double p0_h3(){return (double) 0.4;}
    public static double p0_h4(){return (double) 0.2;}
    public static double p0_h5(){return (double) 0.1;}
}


//-----------------  Processing using above information ----------------------
//        Prob_C_given_Q =
//                (
//                  PriorProbability.Cherry_h1() * PriorProbability.p0_h1()
//                    + PriorProbability.Cherry_h2() * PriorProbability.p0_h2()
//                    +PriorProbability.Cherry_h3() * PriorProbability.p0_h3()
//                    +PriorProbability.Cherry_h4() * PriorProbability.p0_h4()
//                    +PriorProbability.Cherry_h5() * PriorProbability.p0_h5()
//                );
//
//        Prob_L_given_Q =
//                (
//                        PriorProbability.Lime_h1() * PriorProbability.p0_h1()
//                                + PriorProbability.Lime_h2() * PriorProbability.p0_h2()
//                                +PriorProbability.Lime_h3() * PriorProbability.p0_h3()
//                                +PriorProbability.Lime_h4() * PriorProbability.p0_h4()
//                                +PriorProbability.Lime_h5() * PriorProbability.p0_h5()
//                );
//-----------------  Processing using above information End----------------------
