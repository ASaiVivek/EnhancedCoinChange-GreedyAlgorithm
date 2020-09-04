import java.util.Scanner;
public class StoreChange{
public static int getChange(int n){
int[] coins={500,200,100,50,20,10,5,2,1};
int count=0;
for(int i=0;n>0;i++){
int x=count;
count+=n/coins[i];
if((count-x)==0){
System.out.print(coins[i]+"s : "+(count-x)+"   ");
}
else{
System.out.print("\033[0;32m"+coins[i]+"s : "+"\033[0;31m"+(count-x)+"\033[0m"+"   ");
}
n%=coins[i];
}
return count;
}

public static void main(String[] args){
System.out.print("Enter Amount >> ");
Scanner sc=new Scanner(System.in);
int amt=sc.nextInt();
System.out.println("\033[0;31m"+"| Total : "+getChange(amt)+" |"+"\033[0m");
}
}
