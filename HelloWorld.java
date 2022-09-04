import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,kim,fiz,tr,muz;
        int total=0;
        int count = 0;

        System.out.println("Mat Notunuz:");
        mat = input.nextInt();
        System.out.println("Fizik Notunuz:");
        fiz = input.nextInt();
        System.out.println("Kimya Notunuz:");
        kim = input.nextInt();
        System.out.println("Türkçe Notunuz:");
        tr = input.nextInt();
        System.out.println("Müzik Notunuz:");
        muz = input.nextInt();

        if(mat<=100 && mat >=0){
            total+=mat;
            count++;
        }
        if(fiz<=100 && fiz >=0){
            total+=fiz;
            count++;
        }
        if(kim<=100 && kim >=0){
            total+=kim;
            count++;
        }
        if(tr<=100 && tr >=0){
            total+=tr;
            count++;
        }
        if(muz<=100 && muz >=0){
            total+=muz;
            count++;
        }
        int average = total/count;
        if(average>55){
            System.out.println("Geçtiniz Ortalamanız: " + average);
        }
        else{
            System.out.println("Maalesef Kaldınız Ortalamanız: " + average);
        }

    }
}