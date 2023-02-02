public abstract class Person implements Comparable<Person>, Payable{
    private String name;
    private String surname;
    private int id;
    private static int id_gen = 1;

    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare((int) this.getPaymentAmount(), (int) o.getPaymentAmount());
    }

    @Override
    public abstract double getPaymentAmount();

    public abstract String getPosition();
}