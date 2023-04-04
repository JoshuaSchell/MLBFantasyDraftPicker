import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class FantasyCalculator {

    // GUI -------------------------------------------------------------------------------------------------------------
    JFrame window;
    Container con;
    JPanel textPanel, inputPanel, teamPanel;
    JLabel textLabel, teamLabel;
    JTextField textField;
    JButton enterButton;
    InputHandler guiHandler = new InputHandler();
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);


    public  HashMap<Integer, Batter> projectedPlayerValue = new HashMap<>();
    public  HashMap<Integer, Batter> players = new HashMap<>();
    public  LeagueCreator league = new LeagueCreator();
    public  ArrayList<Batter> batters = league.getBattersList();
    public  ArrayList<StartingPitcher> starters = league.getStarterList();
    public  ArrayList<ReliefPitcher> relievers = league.getReliefList();
    public Batter firstBase, secondBase, shortStop, thirdBase, leftField, center, rightField, catcher, dh;

    public Integer calculatePlayerValue() {

        return 0;
    }

    public static void main(String[] args) {
        new FantasyCalculator();
    }

    public FantasyCalculator() {
        for(int i = 0; i < batters.size(); i++)
            players.put(i + 1, batters.get(i));
        window = new JFrame();
        window.setSize(1500, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.lightGray);
        window.setLayout(null);
        con = window.getContentPane();

        textPanel = new JPanel();
        textPanel.setBounds(5, 5, 800, 895);
        textPanel.setBackground(Color.white);
        textLabel = new JLabel("Commands: ");
        textLabel.setForeground(Color.black);
        textLabel.setFont(normalFont);
        textPanel.add(textLabel);
        con.add(textPanel);

        teamPanel = new JPanel();
        teamPanel.setBounds(810, 5, 670, 950);
        teamPanel.setBackground(Color.white);
        teamLabel = new JLabel(draftedTeam());
        teamLabel.setForeground(Color.black);
        teamLabel.setFont(normalFont);
        teamPanel.add(teamLabel);
        con.add(teamPanel);

        inputPanel = new JPanel();
        inputPanel.setBounds(5, 905, 800, 50);
        inputPanel.setBackground(Color.black);
        inputPanel.setLayout(new GridLayout(1, 2));

        textField = new JTextField();
        inputPanel.add(textField);

        enterButton = new JButton("Commit");
        enterButton.setForeground(Color.black);
        enterButton.addActionListener(guiHandler);
        inputPanel.add(enterButton);
        con.add(inputPanel);

        window.setVisible(true);
    }

    public String draftedTeam() {
        StringBuilder team = new StringBuilder();
        String c, first, second, ss, third, left, cen, right, dH;
        if(catcher == null)
            c = " ";
        else
            c = catcher.getName();
        if(firstBase == null)
            first = " ";
        else
            first = firstBase.getName();
        if(secondBase == null)
            second = " ";
        else
            second = secondBase.getName();
        if(shortStop == null)
            ss = " ";
        else
            ss = shortStop.getName();
        if(thirdBase == null)
            third = " ";
        else
            third = thirdBase.getName();
        if(leftField == null)
            left = " ";
        else
            left = leftField.getName();
        if(center == null)
            cen = " ";
        else
            cen = center.getName();
        if(rightField == null)
            right = " ";
        else
            right = rightField.getName();
        if(dh == null)
            dH = " ";
        else
            dH = dh.getName();

        team.append("<html>").append("Drafted Team: ").append("<br>").append("<br>")
                .append("Catcher: ").append(c).append("<br>").append("<br>")
                .append("FirstBase: ").append(first).append("<br>").append("<br>")
                .append("SecondBase: ").append(second).append("<br>").append("<br>")
                .append("ShortStop: ").append(ss).append("<br>").append("<br>")
                .append("ThirdBase: ").append(third).append("<br>").append("<br>")
                .append("LeftField: ").append(left).append("<br>").append("<br>")
                .append("CenterField: ").append(cen).append("<br>").append("<br>")
                .append("RightField: ").append(right).append("<br>").append("<br>")
                .append("DH: ").append(dH).append("<html>");
        return team.toString();
    }

    public void addPlayers(StringBuilder topPlayers, int start, int end) {
        if(end > batters.size())
            end = batters.size() - 1;
        for(int i = start; i < end; i++) {
            topPlayers.append("<html>").append(i + 1).append(". ").append(batters.get(i).getName()).append(" | ")
                    .append(batters.get(i).getAVG()).append(" Average | ")
                    .append(batters.get(i).getHR()).append(" HRs | ")
                    .append(batters.get(i).getSB()).append(" SBs | ")
                    .append(batters.get(i).getRBI()).append(" RBIs | ")
                    .append(batters.get(i).getRUNS()).append(" Runs | ")
                    .append(batters.get(i).getPosition()).append("<br>");
        }
        topPlayers.append("<html>");
        textLabel.setText(topPlayers.toString());
    }

    public class InputHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] text = textField.getText().split(" ");
            switch (text[0]) {
                // gets the top available players
                case "top" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    addPlayers(topPlayers, 0, Integer.parseInt(text[1]));
                    textLabel.setText(topPlayers.toString());
                }
                // removing specific player
                case "rp" -> {
                    String name = text[1] + " " + text[2];
                    for(int i = 0; i < batters.size(); i++) {
                        if(batters.get(i).getName().equals(name) && batters.get(i).getPosition().equals(text[3])) {
                            batters.remove(i);
                            StringBuilder topPlayers = new StringBuilder();
                            addPlayers(topPlayers, 0, 37);
                            textLabel.setText(topPlayers.toString());
                            break;
                        }
                    }
                }
                // removing player based on value
                case "rn" -> {
                    batters.remove(Integer.parseInt(text[1]) - 1);
                    StringBuilder topPlayers = new StringBuilder();
                    addPlayers(topPlayers, 0, 37);
                    textLabel.setText(topPlayers.toString());
                }
                case "1st" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < batters.size() - 1; i++) {
                        if (count == Integer.parseInt(text[1]))
                            break;
                        if (batters.get(i).getPosition().equals("1ST")) {
                            addPlayers(topPlayers, i, i + 1);
                            count++;
                        }
                    }
                }
                case "2nd" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < batters.size() - 1; i++) {
                        if (count == Integer.parseInt(text[1]))
                            break;
                        if (batters.get(i).getPosition().equals("2ND")) {
                            addPlayers(topPlayers, i, i + 1);
                            count++;
                        }
                    }
                }
                case "ss" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < batters.size() - 1; i++) {
                        if (count == Integer.parseInt(text[1]))
                            break;
                        if (batters.get(i).getPosition().equals("SS")) {
                            addPlayers(topPlayers, i, i + 1);
                            count++;
                        }
                    }
                }
                case "3rd" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < batters.size() - 1; i++) {
                        if (count == Integer.parseInt(text[1]))
                            break;
                        if (batters.get(i).getPosition().equals("3RD")) {
                            addPlayers(topPlayers, i, i + 1);
                            count++;
                        }
                    }
                }
                case "of" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < batters.size() - 1; i++) {
                        if (count == Integer.parseInt(text[1]))
                            break;
                        if (batters.get(i).getPosition().equals("OF")) {
                            addPlayers(topPlayers, i, i + 1);
                            count++;
                        }
                    }
                    textLabel.setText(topPlayers.toString());
                }
                case "c" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < batters.size() - 1; i++) {
                        if (count == Integer.parseInt(text[1]))
                            break;
                        if (batters.get(i).getPosition().equals("C")) {
                            addPlayers(topPlayers, i, i + 1);
                            count++;
                        }
                    }
                    textLabel.setText(topPlayers.toString());
                }
                case "dh" -> {
                    StringBuilder topPlayers = new StringBuilder();
                    int count = 0;
                    for (int i = 0; i < batters.size() - 1; i++) {
                        if (count == Integer.parseInt(text[1]))
                            break;
                        if (batters.get(i).getPosition().equals("DH")) {
                            addPlayers(topPlayers, i, i + 1);
                            count++;
                        }
                    }
                    textLabel.setText(topPlayers.toString());
                }
                case "draft" -> {
                    String player = text[1] + " " + text[2];
                    for(int i = 0; i < batters.size() - 1; i++) {
                        if(batters.get(i).getName().equals(player)) {
                            draftToTeam(i);
                            break;
                        }
                    }
                }
                case "draftnum" -> draftToTeam(Integer.parseInt(text[1]) - 1);
            }
        }
    }

    public void draftToTeam(int index) {
        String position = batters.get(index).getPosition();
        switch(position) {
            case("C") -> {
                if(catcher == null)
                    catcher = batters.get(index);
                else if(dh == null)
                    dh = batters.get(index);
                teamLabel.setText(draftedTeam());
            }
            case("1ST") -> {
                if(firstBase == null)
                    firstBase = batters.get(index);
                else if(dh == null)
                    dh = batters.get(index);
                teamLabel.setText(draftedTeam());
            }
            case("2ND") -> {
                if(secondBase == null)
                    secondBase = batters.get(index);
                else if(dh == null)
                    dh = batters.get(index);
                teamLabel.setText(draftedTeam());
            }
            case("SS") -> {
                if(shortStop == null)
                    shortStop = batters.get(index);
                else if(dh == null)
                    dh = batters.get(index);
                teamLabel.setText(draftedTeam());
            }
            case("3RD") -> {
                if(thirdBase == null)
                    thirdBase = batters.get(index);
                else if(dh == null)
                    dh = batters.get(index);
                teamLabel.setText(draftedTeam());
            }
            case("OF") -> {
                if(leftField == null)
                    leftField = batters.get(index);
                else if(center == null)
                    center = batters.get(index);
                else if(rightField == null)
                    rightField = batters.get(index);
                else if(dh == null)
                    dh = batters.get(index);
                teamLabel.setText(draftedTeam());
            }
            case("DH") -> {
                dh = batters.get(index);
                teamLabel.setText(draftedTeam());
            }
        }
        batters.remove(batters.get(index));
        StringBuilder topPlayers = new StringBuilder();
        addPlayers(topPlayers, 0,37);
        textLabel.setText(topPlayers.toString());
    }
}
