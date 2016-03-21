package member;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Member> coba = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        coba.add(m1);
        coba.get(0).setNama("Wunsel Arto Negoro");
        coba.get(0).setTeam("DJAKARTA");
        coba.get(0).setUmur("18");
        coba.get(0).setPenampilan(80);
        coba.get(0).setSuara(90);
        coba.get(0).setAttitude(90);

        coba.add(m2);
        coba.get(1).setNama("Albert Bill Alroy");
        coba.get(1).setTeam("KALI(MANTAN)");
        coba.get(1).setUmur("19");
        coba.get(1).setPenampilan(40);
        coba.get(1).setSuara(50);
        coba.get(1).setAttitude(60);

        coba.add(m3);
        coba.get(2).setNama("Charles");
        coba.get(2).setTeam("SUROBOYO");
        coba.get(2).setUmur("15");
        coba.get(2).setPenampilan(60);
        coba.get(2).setSuara(60);
        coba.get(2).setAttitude(70);
        
        
            System.out.println("=======================Data Member==========================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nama             : " + coba.get(i).getNama());
            System.out.println("Team             : " + coba.get(i).getTeam());
            System.out.println("Umur             : " + coba.get(i).getUmur());
            System.out.println("Nilai Rata-rata  : " + coba.get(i).getNilai());
            System.out.println("============================================================");
        }
    }
}
