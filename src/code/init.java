package code;

import java.util.Scanner;

public class init {

    private class initial_value {
        Scanner inputan = new Scanner(System.in);
        float a = 0,
                b = 0,
                u_choice,
                u_number1,
                u_number2,
                hasil=0;
    }

    void proses() {
        initial_value value = new initial_value();

        System.out.println("Masukkan angka pertama: ");
        value.u_number1 = value.inputan.nextFloat();
        System.out.println("Masukkan angka kedua: ");
        value.u_number2 = value.inputan.nextFloat();

        System.out.println("\nSilahkan pilih salah satu menu dibawah ini:\r\n" +
                "1.Penjumlahan        3.Perkalian       5.Keluar\r\n" +
                "2.Pengurangan        4.Pembagian\r\n");
        value.u_choice = value.inputan.nextInt();

        if ((value.u_choice > 5) || (value.u_choice < 1) || (value.u_choice != (int)value.u_choice)) {
            System.out.println("pilihan tidak sesuai, silahkan ulangi lagi");
        }

        if (value.u_choice == 1) {
            value.hasil = value.u_number1 + value.u_number2;
            System.out.println("Hasil: "+(int)value.hasil);
        } if (value.u_choice == 2) {
            value.hasil = value.u_number1 - value.u_number2;
            System.out.println("Hasil: "+(int)value.hasil);
        } if (value.u_choice == 3) {
            value.hasil = value.u_number1 * value.u_number2;
            System.out.println("Hasil: "+(int)value.hasil);
        } if (value.u_choice == 4) {
            value.hasil = value.u_number1 / value.u_number2;
            System.out.println("Hasil: "+(int)value.hasil);
        } if (value.u_choice == 5) {
            System.exit(0);
        }

    }

}
