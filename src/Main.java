import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        Random rand=new Random();
        for(int i=0;i<5;i++){
            x.add(rand.nextInt(10));
        }
        System.out.println("x list is: "+x);

        for(int i=0;i<5;i++){
            y.add(rand.nextInt(10));
        }
        System.out.println("y list is: "+y);

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("x list sorted is: "+x);
        System.out.println("y list sorted is: "+y);

        xPlusY.addAll(x);
        xPlusY.addAll(y);

        System.out.println("all values from x and y are: "+xPlusY);

        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println("common values from x and y are: "+zSet);


        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("values from x who are not in y are: "+xMinusY);

        for(int i=0;i<xPlusY.size();i++){
            if(xPlusY.get(i)<p){
                xPlusYLimitedByP.add(xPlusY.get(i));
            }
        }
        System.out.println("elements who are less than "+p+" are: "+xPlusYLimitedByP);

        }

}