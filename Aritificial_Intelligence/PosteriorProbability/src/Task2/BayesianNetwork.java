package Task2;

import java.util.ArrayList;

public class BayesianNetwork {

//    Bt, Af -> Bt, Af, E, J, M
    public ArrayList<String> generateCombi(ArrayList<String> possible){
        ArrayList<String> result=new ArrayList<String>(10);
        if(possible.contains("Bt"))
            result.add(0,"true");
        else if(possible.contains("Bf"))
            result.add(0,"false");
        else
            result.add(null);
        if(possible.contains("Et"))
            result.add(1,"true");
        else if(possible.contains("Ef"))
            result.add(1,"false");
        else
            result.add(null);
        if(possible.contains("At"))
            result.add(2,"true");
        else if(possible.contains("Af"))
            result.add(2,"false");
        else
            result.add(2,null);

        if(possible.contains("Jt"))
            result.add(3,"true");
        else if(possible.contains("Jf"))
            result.add(3,"false");
        else
            result.add(3,null);

        if(possible.contains("Mt"))
            result.add(4,"true");
        else if(possible.contains("Mf"))
            result.add(4,"false");
        else
            result.add(4,null);

        //System.out.println(result);
        return result;


    }


    public void computeProbability(boolean b,boolean e,boolean a,boolean j,boolean m){

    }
}
