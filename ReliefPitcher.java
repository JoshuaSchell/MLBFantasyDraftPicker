public class ReliefPitcher implements Player{

    private String name;
    private int K, SV;
    private double WHIP, ERA;

    public ReliefPitcher(String name, int SVs, int Ks, double WHIP, double ERA) {
        setName(name);
        setERA(ERA);
        setK(Ks);
        setSV(SVs);
        setWHIP(WHIP);
    }

    public double getERA() {
        return ERA;
    }

    public int getK() {
        return K;
    }

    public int getSV() {
        return SV;
    }

    public double getWHIP() {
        return WHIP;
    }

    public String getName() {
        return name;
    }

    public void setERA(double ERA) {
        this.ERA = ERA;
    }

    public void setK(int k) {
        K = k;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSV(int SV) {
        this.SV = SV;
    }

    public void setWHIP(double WHIP) {
        this.WHIP = WHIP;
    }
}
