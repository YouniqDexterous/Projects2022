package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bnet {
    public static void main(String[] args) {
        String probability = "Bt Af given Mf";
//        String probability = "Bt Af Mf";
        ArrayList<String> probabilityGiven = new ArrayList<>(Arrays.asList(probability.split(" given ")));
        String numProb = probabilityGiven.get(0);
        String DenProb = (probabilityGiven.size()>1)? probabilityGiven.get(1):"";

//        double numerator,denominator;
        System.out.println(probabilityGiven.size());

        ArrayList<String> numerator = new ArrayList<String>(List.of(numProb.split(" ")));
        ArrayList<String> denominator = (!DenProb.isEmpty())? new ArrayList<String>(List.of(DenProb.split(" "))):null;

        System.out.println(numerator);
        System.out.println(denominator);

        BayesianNetwork network = new BayesianNetwork();

        network.generateCombi(numerator);

//        network.generateCombi();
    }

}
