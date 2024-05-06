public class User {
    private String name,surName;
    private int krediLimit,id,identificationNumber;

    private static int idNext = 1;
   public User(){
        this.id=idNext++;
   }
    public User(int identificationNumber, String name, String surName,int krediLimit) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.surName = surName;
        this.krediLimit = krediLimit;
        this.id=idNext++;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int getId() {
        return id;
    }

    public int getKrediLimit() {
        return krediLimit;
    }

    public void setKrediLimit(int krediLimit) {
        this.krediLimit = krediLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
