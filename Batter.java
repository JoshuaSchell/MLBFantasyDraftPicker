public class Batter implements Player {

    private String name;
    private String position;
    private int HR, SB, RUNS, RBI, POS;
    private double AVG;

    public Batter(String name, double AVG, int HRs, int SBs, int RUNs, int RBIs, String position) {
        setName(name);
        setAVG(AVG);
        setHR(HRs);
        setSB(SBs);
        setRUNS(RUNs);
        setRBI(RBIs);
        setPosition(position);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getAVG() {
        return AVG;
    }

    public int getHR() {
        return HR;
    }

    public int getRBI() {
        return RBI;
    }

    public int getRUNS() {
        return RUNS;
    }

    public int getSB() {
        return SB;
    }

    public void setAVG(double AVG) {
        this.AVG = AVG;
    }

    public void setHR(int HR) {
        this.HR = HR;
    }

    public void setRBI(int RBI) {
        this.RBI = RBI;
    }

    public void setRUNS(int RUNS) {
        this.RUNS = RUNS;
    }

    public void setSB(int SB) {
        this.SB = SB;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void setPlayerExpectedDraftPos(int POS) {
        this.POS = POS;
    }
}
