package member;
public class Member {
    private String Nama;
    private String Team;
    private String Umur;
    private int Penampilan;
    private int Suara;
    private int Attitude;
    private int Nilai;

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public String getUmur() {
        return Umur;
    }

    public void setUmur(String Umur) {
        this.Umur = Umur;
    }

    public int getPenampilan() {
        return Penampilan;
    }

    public void setPenampilan(int Penampilan) {
        this.Penampilan = Penampilan;
    }

    public int getSuara() {
        return Suara;
    }

    public void setSuara(int Suara) {
        this.Suara = Suara;
    }

    public int getAttitude() {
        return Attitude;
    }

    public void setAttitude(int Attitude) {
        this.Attitude = Attitude;
    }

    public int getNilai() {
        return (Penampilan+Suara+Attitude)/3;
    }
    
}
