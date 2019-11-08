/**
* UsingLoopsQA is to QA static methods about using loops
*
* @author Anh Nguyen
* @version 1.2
*/
public class UsingLoopsQA
{
    public static void main(String[] args) {
        double targetPop = 31;
        System.out.println("\npopGrowth: target pop = "
                            + UsingLoops.popGrowth(
                            2001, 29, targetPop, 0.03));
        targetPop = 47.32;
        System.out.println("popGrowth: target pop = "
                            + UsingLoops.popGrowth(
                            2001, 29, targetPop, 0.03));
        targetPop = 58;
        System.out.println("popGrowth: target pop = "
                            + UsingLoops.popGrowth(
                            2001, 29, targetPop, 0.03));

        int n = 3;
        System.out.println("\naddMultOf3: sum = "
                            + UsingLoops.addMultOf3(n));
        n = 11;
        System.out.println("addMultOf3: sum = "
                            + UsingLoops.addMultOf3(n));
        n = 326;
        System.out.println("addMultOf3: sum = "
                            + UsingLoops.addMultOf3(n));
                           
        int rowNum1 = 1;
        int count1 = 26;
        int k= 9;
        int rowNum2 = 1;
        System.out.println("\ncalcChairs: #chairs = "
                            + UsingLoops.calcChairs(rowNum1, count1, k, rowNum2));
        rowNum1 = 47;
        count1 = 38;
        k= 5;
        rowNum2 = 412;
        System.out.println("calcChairs: #chairs = "
                            + UsingLoops.calcChairs(rowNum1, count1, k, rowNum2));
        rowNum1 = 23;
        count1 = 141;
        k= 3;
        rowNum2 = 5327;
        System.out.println("calcChairs: #chairs = "
                            + UsingLoops.calcChairs(rowNum1, count1, k, rowNum2));
            
       
        double rate = 1.0;
        double targetPercent = 1.0;
        System.out.println("\nknowledgGrowth: #months = "
                            + UsingLoops.knowledgeGrowth(rate, targetPercent));
        rate = 0.1;
        targetPercent = 0.85;
        System.out.println("knowledgGrowth: #months = "
                            + UsingLoops.knowledgeGrowth(rate, targetPercent));
        rate = 0.08;
        targetPercent = 0.95;
        System.out.println("knowledgGrowth: #months = "
                            + UsingLoops.knowledgeGrowth(rate, targetPercent));
       
                           
        int repeats = 1300;
        System.out.printf("\nestPi: pi = %13.10f\n" ,
                            UsingLoops.estPi(repeats));
        repeats = 11632;
        System.out.printf("estPi: pi = %13.10f\n" ,
                            UsingLoops.estPi(repeats));
        repeats = 89345;
        System.out.printf("estPi: pi = %13.10f\n" ,
                            UsingLoops.estPi(repeats));

        n = (int)(Math.random()*10) +1;
        System.out.println("\nstarTriangle: n = " + n);
        UsingLoops.starTriangle(n);
                           
        n = (int)(Math.random()*10) +1;
        System.out.println("\nidentMatrix: n = " + n);
        UsingLoops.identMatrix(n);                                                   
   }
}