public class esercizio35di3 {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        user1.stampaInformazioni();

        User user2 = User.getInstance();

        user2.setNome("Franco");
        user2.setEta(72);

        user2.stampaInformazioni();
    }
}
