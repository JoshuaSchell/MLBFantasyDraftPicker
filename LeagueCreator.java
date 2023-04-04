import java.util.ArrayList;
import java.util.List;

public class LeagueCreator {

    public ArrayList<Batter> battersList = new ArrayList<>();
    public ArrayList<StartingPitcher> starterList = new ArrayList<>();
    public ArrayList<ReliefPitcher> reliefList = new ArrayList<>();

    public LeagueCreator() {
        battersList.add(new Batter("Trea Turner", 0.283, 21, 23, 94, 76, "SS"));
        battersList.add(new Batter("Aaron Judge", 0.278, 44, 10, 111, 106, "OF"));
        battersList.add(new Batter("Ronald Acuna Jr.", 0.273, 31, 35, 109, 81, "OF"));
        battersList.add(new Batter("Jose Ramirez", 0.269, 30, 20, 91, 98, "3RD"));
        battersList.add(new Batter("Julio Rodriguez", 0.273, 32, 25, 99, 85, "OF"));
        battersList.add(new Batter("Kyle Tucker", 0.289, 33, 19, 88, 97, "OF"));
        battersList.add(new Batter("Juan Soto", 0.283, 33, 9, 113, 95, "OF"));
        battersList.add(new Batter("Yordan Alvarez", 0.291, 36, 2, 91, 105, "DH"));
        battersList.add(new Batter("Mookie Betts", 0.272, 31, 15, 107, 85, "OF"));
        battersList.add(new Batter("Valdimir Guerrero Jr.", 0.292, 39, 6, 99, 111, "1ST"));
        battersList.add(new Batter("Freedie Freeman", 0.300, 25, 9, 100, 89, "1ST"));
        battersList.add(new Batter("Shohei Ohtani DH", 0.262, 35, 16, 94, 96, "DH"));
        starterList.add(new StartingPitcher("Corbin Burnes", 13, 239, 1.10, 3.16));
        battersList.add(new Batter("Bobby Witt Jr.", 0.260, 26, 27, 89, 84, "3RD"));
        battersList.add(new Batter("Bo Bichette", 0.281, 26, 15, 93, 90, "SS"));
        starterList.add(new StartingPitcher("Gerrit Cole", 14, 249, 1.06, 3.20));
        battersList.add(new Batter("Manny Machado", 0.268, 30, 8, 89, 98, "3RD"));
        battersList.add(new Batter("Rafael Devers", 0.281, 32, 4, 92, 100, "3RD"));
        battersList.add(new Batter("Pete Alonso", 0.261, 39, 3, 92, 110, "1ST"));
        battersList.add(new Batter("Mike Trout", 0.261, 39, 3, 105, 99, "OF"));
        battersList.add(new Batter("Fernando Tatis Jr.", 0.282, 35, 19, 89, 91, "SS"));
        battersList.add(new Batter("Austin Riley", 0.275, 35, 2, 90, 104, "3RD"));
        starterList.add(new StartingPitcher("Sandy Alcantara", 12, 200, 1.2, 3.56));
        battersList.add(new Batter("Paul Goldschmidt", 0.273, 29, 6, 91, 95, "1ST"));
        battersList.add(new Batter("Marcus Semien", 0.254, 26, 19, 92, 74, "2ND"));
        starterList.add(new StartingPitcher("Brandon Woodruff", 11, 197, 1.13, 3.47));
        battersList.add(new Batter("Michael Harris II", 0.275, 22, 20, 84, 78, "OF"));
        starterList.add(new StartingPitcher("Shane McClanahan", 13, 214, 1.11, 3.02));
        battersList.add(new Batter("Nolan Arenado", 0.269, 29, 4, 85, 99, "3RD"));
        battersList.add(new Batter("Francisco Lindor", 0.251, 24, 13, 82, 86, "SS"));
        starterList.add(new StartingPitcher("Jacob deGrom", 12, 235, 0.95, 2.65));
        starterList.add(new StartingPitcher("Aaron Nola", 13, 217, 1.12, 3.50));
        starterList.add(new StartingPitcher("Spencer Strider", 11, 208, 1.12, 3.10));
        starterList.add(new StartingPitcher("Dylan Cease", 12, 226, 1.22, 3.72));
        starterList.add(new StartingPitcher("Justin Verlander", 12, 203, 1.06, 3.36));
        battersList.add(new Batter("Randy Arozarena", 0.256, 22, 26, 82, 83, "OF"));
        starterList.add(new StartingPitcher("Shohei Ohtani SP", 12, 217, 1.11, 3.16));
        battersList.add(new Batter("J.T. Realmuto", 0.256, 20, 12, 66, 72, "C"));
        reliefList.add(new ReliefPitcher("Emmanuel Clase", 35, 79, 1.11, 2.77));
        starterList.add(new StartingPitcher("Max Scherzer", 13, 229, 1.05, 3.33));
        battersList.add(new Batter("Matt Olson", 0.260, 34, 2, 89, 99, "1ST"));
        battersList.add(new Batter("Luis Robert Jr.", 0.282, 25, 13, 78, 86, "OF"));
        battersList.add(new Batter("Ozzie Albies", 0.265, 20, 13, 69, 72, "2ND"));
        starterList.add(new StartingPitcher("Zack Wheeler", 12, 189, 1.16, 3.45));
        battersList.add(new Batter("Cedric Mullins II", 0.253, 20, 30, 90, 66, "OF"));
        starterList.add(new StartingPitcher("Shane Bieber", 13, 209, 1.16, 3.48));
        battersList.add(new Batter("Jazz Chisholm Jr.", 0.246, 27, 25, 76, 80, "2ND"));
        battersList.add(new Batter("Kyle Schwarber", 0.234, 39, 7, 95, 90, "OF"));
        reliefList.add(new ReliefPitcher("Josh Hader", 32, 97, 1.06, 2.90));
        starterList.add(new StartingPitcher("Alek Manoah", 12, 195, 1.22, 4.03));
        reliefList.add(new ReliefPitcher("Jordan Romano", 32, 78, 1.18, 3.39));
        battersList.add(new Batter("Corey Seager", 0.282, 27, 3, 88, 82, "SS"));
        battersList.add(new Batter("Will Smith", 0.252, 26, 2, 74, 82, "C"));
        battersList.add(new Batter("Daulton Varsho", 0.237, 26, 13, 71, 76, "C"));
        reliefList.add(new ReliefPitcher("Ryan Pressly", 30, 72, 1.14, 3.11));
        starterList.add(new StartingPitcher("Julio Urias", 12, 183, 1.23, 4.04));
        reliefList.add(new ReliefPitcher("Devin Williams", 27, 84, 1.21, 3.12));
        starterList.add(new StartingPitcher("Kevin Gausman", 12, 196, 1.11, 3.45));
        battersList.add(new Batter("Adolis Garcia", 0.233, 27, 17, 74, 87, "OF"));
        starterList.add(new StartingPitcher("Luis Castillo", 12, 205, 1.20, 3.35));
    }

    public ArrayList<Batter> getBattersList() {
        return battersList;
    }

    public ArrayList<ReliefPitcher> getReliefList() {
        return reliefList;
    }

    public ArrayList<StartingPitcher> getStarterList() {
        return starterList;
    }
}
