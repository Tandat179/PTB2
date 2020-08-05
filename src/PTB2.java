public class PTB2 {
    public static void xuLyBaiToan(int a,int b,int c){
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("Phuong Trinh Vo So Nghiem");
                }
                else {
                    System.out.println("Phuong Trinh Vo Nghiem");
                }

            }
            else {
                System.out.println("Phuong Trinh Co Mot Nghiem La:" + (-c / b));
            }
        }
        else {
            double x1,x2,delta;
            delta = Math.pow(b,2)-(4*a*c);
            if (delta<0){
                System.out.println("Phuong Trinh Vo Nghiem");
            }
            else {
                if (delta > 0){
                    x1 = (-b+Math.sqrt(delta))/(2*a);
                    x2 = (b+Math.sqrt(delta))/(2*a);
                    System.out.println("Phuong Trinh Co 2 Nghiem Phan Biet X1 // X2 La:"+x1+"//"+x2);
                }
                else {
                    System.out.println("Phuong Trinh Co Nghiem Kep La:"+(-b/(2*a)));
                }
            }
        }
    }
}
