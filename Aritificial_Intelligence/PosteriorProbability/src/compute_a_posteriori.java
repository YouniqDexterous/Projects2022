/*
* Yogesh, Kalapala
* yxk9640
* 1001879640
*  */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class compute_a_posteriori {
    static double Prob_C_given_Q=0.0;
    static double Prob_L_given_Q=0.0;

    static double[] Prior_cherry = new double[]{1,0.75,0.5,0.25,0};
    static double[] Prior_lime = new double[]{0,0.25,0.5,0.75,1};
    static double[] Prior_Observation = new double[]{0.1,0.2,0.4,0.2,0.1};


    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        if (args[0].equals("observations")){
            System.out.print("No observations are made...Try again..with L|C combinations");
//            System.out.print("No observations are made...Try again..with L|C combinations"+PriorProbability.C_give_Q()+" "+PriorProbability.L_given_Q());
        }
        else {
            FileWriter outputfile = new FileWriter("/Users/yogesh/Desktop/output.txt");
            PrintWriter output = new PrintWriter(outputfile);
            String Observation =args[0];
            output.print("Observation sequence Q: "+Observation+"\nLength of Q:  "+Observation.length()+"\n");
            char[] ObservationArray = Observation.toCharArray();
            int iteration = 1,IterationLength = Observation.length();
            double[] tempObservation = new double[5];

            for ( int i = 0; i < Prior_Observation.length; i++ ){
                Prob_C_given_Q += Prior_cherry[i]*Prior_Observation[i];
            }
            for ( int i = 0; i < Prior_Observation.length; i++ ){
                Prob_L_given_Q += Prior_lime[i]*Prior_Observation[i];
                tempObservation[i]=Prior_Observation[i];
            }
            // At Observation-0 Q0 we directly calculate the probability using prior probability values
//            output.printf("%.5f At Observation 0\n",Prob_C_given_Q);
//            output.printf("%.5f At Observation 0\n",Prob_L_given_Q);

            while ( iteration <= IterationLength ){
                output.print("\n\nAfter Observation "+iteration+" = "+ObservationArray[iteration-1]+":\n\n");

                //when we see an obserbation and then we update them
                if (ObservationArray[iteration-1]=='C' || ObservationArray[iteration-1]=='c'){
                    for (int i = 0; i < tempObservation.length; i++){
                        tempObservation[i] = (tempObservation[i] * Prior_cherry[i])/Prob_C_given_Q;//Compute the table
                        output.print("P(h"+i+1+" | Q) = "+ tempObservation[i]+"\n");
                    }
                    Prob_C_given_Q=0;
                    for ( int i = 0; i < Prior_Observation.length; i++ ){
                        Prob_C_given_Q += Prior_cherry[i]*tempObservation[i];
                    }
                    Prob_L_given_Q = 1 - Prob_C_given_Q;
                    output.print("\n");
                    output.printf("\nProbability that the next candy we pick will be C, given Q: %f \n",Prob_C_given_Q);
                    output.printf("Probability that the next candy we pick will be L, given Q: %f \n",Prob_L_given_Q);
                    output.print("\n");
                }
                else {
                    if (ObservationArray[iteration-1]=='L' || ObservationArray[iteration-1]=='l'){
                        for (int i = 0; i < tempObservation.length; i++){
                            tempObservation[i] = (tempObservation[i] * Prior_lime[i])/Prob_L_given_Q;
                            output.print("P(h"+i+1+" | Q) = "+ tempObservation[i]+"\n");
                        }
                        Prob_L_given_Q=0;
                        for ( int i = 0; i < Prior_Observation.length; i++ ){
                            Prob_L_given_Q += Prior_lime[i]*tempObservation[i];
                        }
                        Prob_C_given_Q = 1 - Prob_L_given_Q;
//                        output.print();
                        output.printf("\nProbability that the next candy we pick will be C, given Q: %f \n",Prob_C_given_Q);
                        output.printf("Probability that the next candy we pick will be L, given Q: %f \n",Prob_L_given_Q);
//                        output.print();
                    }
                }
                iteration++;
            }
            output.flush();
            output.close();

        }
    }
}






