public class DiffBreakContinue{
    public static void main(String args[]){
       // Break statement (execution stops when value of i becomes 4.)
       System.out.println("Break Statement\n");
       for(int i=1;i<=5;i++){
          if(i==4)
          break;
          System.out.println(i);
       }
       // Continue statement (execution skipped when value of i becomes 1.)
       System.out.println("Continue Statement\n");
       for(int i=1;i<=5;i++){
          if(i==1)
          continue;
          System.out.println(i);
       }
    }
 }