import java.util.Scanner;

public class Main {
    public  static  void main(String[]args){
        int a,b,c;
        PTB2 ptb2 = new PTB2();
        a = nhapVaoSoNguyen("Nhap vao A");
        b = nhapVaoSoNguyen("Nhap vao B");
        c = nhapVaoSoNguyen("Nhap vao C");
        ptb2.xuLyBaiToan(a,b,c);
    }


    public static int nhapVaoSoNguyen(String string) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println(string);
        x = scanner.nextInt();
        return x;
    }



}
