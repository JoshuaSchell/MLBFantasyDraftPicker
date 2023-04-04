import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FantasyCalculator {

    public static HashMap<String, Integer> projectedPlayerValue = new HashMap<>();
    public static LeagueCreator league = new LeagueCreator();
    public static ArrayList<Batter> batters = league.getBattersList();
    public static ArrayList<StartingPitcher> starters = league.getStarterList();;
    public static ArrayList<ReliefPitcher> relievers = league.getReliefList();

    public Integer calculatePlayerValue() {

        return 0;
    }

    public void createMapEntry(String player) {
        projectedPlayerValue.put(player, this.calculatePlayerValue());
    }

    public static int totalHomers() {
        int homers = 0;
        int count = 0;
        for(Batter batter : batters) {
            homers += batter.getHR();
            count++;
        }
        return homers;
    }

    public static void main(String[] args) {

        System.out.println(totalHomers());
    }


}
