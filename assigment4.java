public class assigment4 {
    public static void main(String[] args) {

        String[][] athleteSportsBranch = {
                { "Badminton", "Athlete1", "Athlete2", "Athlete3", "Athlete4", "Athlete5" },
                { "Table Tennis", "Athlete1", "Athlete2", "Athlete3", "Athlete4", "Athlete5" },
                { "Basketball", "Athlete1", "Athlete2", "Athlete3", "Athlete4", "Athlete5" },
                { "Volleyball", "Athlete1", "Athlete2", "Athlete3", "Athlete4", "Athlete5" }
        };

        for (int i = 0; i < athleteSportsBranch.length; i++) {
            System.out.println("Sports Branch: " + athleteSportsBranch[i][0]);
            for (int j = 1; j < athleteSportsBranch[i].length; j++) {
                System.out.println(" - " + athleteSportsBranch[i][j]);
            }
            System.out.println();
        }
    }
}
