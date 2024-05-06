import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean step = true;
        DB db = new DB();
        db.add();

        List<User> filteredUsers = db.filtreleme(20000);
        if (filteredUsers.isEmpty()) {
            System.out.println("Filtreleme sonucunda hiçbir kullanıcı bulunamadı.");
        } else {
            for (User user : filteredUsers) {
                System.out.println(user.getName() + " " + user.getSurName() + " - Kredi Limiti: " + user.getKrediLimit());
            }
        }
    }

}

