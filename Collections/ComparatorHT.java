package Collections;

import java.util.*;

public class ComparatorHT {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter no. of Players ");
        int n=scanner.nextInt();
        scanner.nextLine();

        Player[] players = new Player[n];
        for(int i=0;i<n;i++)
        {
            String name = scanner.next();
            int score= scanner.nextInt();
            players[i]= new Player(name, score);
        }
        scanner.close();
        Arrays.sort(players,new Checker());

        for(Player player:players)
            System.out.println(player.getName()+" "+player.getScore());
    }
}

class Player{
    private final String name;
    private final int score;

    Player(String name,int score)
    {
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getScore() != o2.getScore())
            return o2.getScore() - o1.getScore();
         else
            return o1.getName().compareTo(o1.getName());
    }
}
