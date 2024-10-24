
public class Main {
    public static void main(String[] args) {

 //1)
 int a=5;
 int b=7;
 int c=2;
 double k=a+b+c;
        System.out.println(k/3);
  //2)
      int x=8;
      String z= (x%2==1)? "კენტია": "ლუწია";
        System.out.println(z);

//3)
        int q=16;
        int m=11;
        int max=(m>q) ? m:q;
        System.out.println(max);
//4)
        int p=5178;
        int Num=p%10+(p/10)%10+(p/100)%10+p/1000;
        System.out.println(Num);
 //5)

        int al=30;
        int be=60;
        int ga=90;
        if(al+be+ga==180){
            System.out.println("სამკუთხედი აიგება");
        }
        else{
            System.out.println("ვერ აიგება სამკუთედი");
        }

    }
}
