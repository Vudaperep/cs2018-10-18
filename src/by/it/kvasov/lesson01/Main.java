package by.it.kvasov.lesson01;

public class Main {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>16) binary=binary.substring(binary.length()-16);
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.printf("%8s %4d %n",binary, i);
            String Octal = Integer.toOctalString(i);
            if (Octal.length()>16) Octal=Octal.substring(Octal.length()-16);
            Octal = String.format("%8s", Octal).replace(" ", "0");
            System.out.printf("%8s %4d %n",Octal, i);
            String Hex = Integer.toHexString(i);
            if (Hex.length()>16) Hex=Hex.substring(Hex.length()-16);
            Hex = String.format("%8s", Hex).replace(" ", "0");
            System.out.printf("%8s %4d %n",Hex, i);


        }
    }
}
