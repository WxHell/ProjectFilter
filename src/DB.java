import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DB {
public static Scanner scanner = new Scanner(System.in);
    private List<User> users;

    public DB() {
        this.users = new ArrayList<>();
    }

    public boolean add(){
        System.out.println("Tc Kimlik Numarası: ");
        int tc = scanner.nextInt();
        scanner.nextLine();
        if (contoroller(tc)) {

            System.out.println("İsim: ");
            String name = scanner.nextLine();

            System.out.println("Soyadı: ");
            String surName = scanner.nextLine();

            System.out.println("Maaş: ");
            int maas = scanner.nextInt();
            scanner.nextLine();
            int krediLimit = 0; // Kredi limiti varsayılan olarak sıfır atanır

            if (maas > 20000 && maas < 40000) {
                krediLimit = 50000;
            } else if (maas > 40000) {
                krediLimit = 100000;
            }

            User newUser = new User(tc, name, surName, krediLimit);
            users.add(newUser);
            System.out.println("Kullanıcı başarıyla eklendi");
        } else {
            System.out.println("Bu kimlik numarasına sahip bir kullanıcı zaten var!");
        }


        return false;
    }
    private boolean contoroller(int identificationNumber){
        for (User user : users){
            if (user.getIdentificationNumber() == identificationNumber){
                return false;
            }
        }
        return true;
    }
    public void delete(){
        System.out.println("Tc Kimlik numarasını giriniz: ");
        int tc = scanner.nextInt();
        if (contoroller(tc)){
            users.removeIf(user -> user.getIdentificationNumber()==tc);
            System.out.println("Başarıyla silindi");
        }
    }
    public void write(User user){
        System.out.println(user.getId()+" "+user.getIdentificationNumber()+" "+ user.getName()+" "+user.getSurName() +
                " "+user.getKrediLimit());
    }
    public void update(User user){
        int newCreditLimit = scanner.nextInt();
        user.setKrediLimit(newCreditLimit);
    }

    public List<User> filtreleme(int krediLimit){
        return users.stream().filter(user -> user.getKrediLimit() > krediLimit ).
                collect(Collectors.toList());
    }


}
