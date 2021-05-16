package Bandit;
import java.util.Random;

public class Agent_method {
    private final int numAction;
    //TODO: modify class if needed, agent only calls getAction function
    private static double[] meanvalueActiontb ;
    private static double[] variancevalueActiontb ;
    private static int[] numberActiontakentb ;
    private static int sumNumberActionTaken = 0;
    private static Random rn = new Random();
    
    protected Agent_method(int nAction) {
        this.numAction = nAction;
        variancevalueActiontb = new double[numAction];
        meanvalueActiontb = new double[numAction];
        numberActiontakentb = new int[numAction];
    }
    private void update(double pastReward, int pastActionId){
    	 numberActiontakentb[pastActionId]++;
         meanvalueActiontb[pastActionId]+= 1/numberActiontakentb[pastActionId]*(pastReward-meanvalueActiontb[pastActionId]);
    }
    protected int getAction(double pastReward, int pastActionId) {
        if (pastActionId >= 0) {
           int yourAction = 0;
            //TODO: return a number between 0 and nAction as the id of desiring action
           update(pastReward, pastActionId);
           if(sumNumberActionTaken<15*numAction){
        	   yourAction = rn.nextInt(numAction);
           }else {
           int p = rn.nextInt(10000)/10000;
           if(p > 0.1) {
        	   for(int i =0;i<numAction;i++)
        		   if(meanvalueActiontb[yourAction]<=meanvalueActiontb[i])
        			   yourAction=i;
           }else {
        	   yourAction = rn.nextInt(numAction);
           }
           }
            sumNumberActionTaken++;
            assert (yourAction >= 0 && yourAction < this.numAction) : "False action taken";
            return yourAction;   
        }
        return 0;
    }
}
