public class StartingPitcher implements Player {

    private String name;
    private int WINS, K;
    private double WHIP, ERA;

    public StartingPitcher(String name, int Wins, int Ks, double WHIP, double ERA) {
        setName(name);
        setERA(ERA);
        setK(Ks);
        setWINS(Wins);
        setWHIP(WHIP);
    }

    public double getERA() {
        return ERA;
    }

    public int getK() {
        return K;
    }

    public int getWINS() {
        return WINS;
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

    public void setWHIP(double WHIP) {
        this.WHIP = WHIP;
    }

    public void setWINS(int WINS) {
        this.WINS = WINS;
    }
}
