import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner usr = new Scanner(System.in);
    System.out.println();
    System.out.println("+++++|Kalkulator|+++++");

    float Nilai1, Nilai2, Hasil;
    char operator;
    System.out.print("Angka 1 : ");
    Nilai1 = usr.nextFloat();
    System.out.print("Operator : ");
    operator = usr.next().charAt(0);
    System.out.print("Angka 2 : ");
    Nilai2 = usr.nextFloat();
    System.out.println("++++++++++++++++++++++");

    switch(operator){
        case '+':
          Hasil = Nilai1 + Nilai2;
          System.out.println(Nilai1 + " " + operator + " " + Nilai2 + " = " + Hasil );
          break;
        case '-':
          Hasil = Nilai1 - Nilai2;
          System.out.println(Nilai1 + " " + operator + " " + Nilai2 + " = " + Hasil);
          break;
        case '*':
          Hasil = Nilai1 * Nilai2;
          System.out.println(Nilai1 + " " + operator + " " + Nilai2 + " = " + Hasil);
          break;
        case '/':
          Hasil = Nilai1 / Nilai2;
          System.out.println(Nilai1 + " " + operator + " " + Nilai2 + " = " + Hasil);
          break;
        default:
          System.out.println("Maaf Yang Anda Masukan Bukan Operator");
          
    }

      
  }
}