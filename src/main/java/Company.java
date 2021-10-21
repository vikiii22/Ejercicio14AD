public class Company {
    String name;
    String catchPhrase;
    String bs;

    public Company() {
    }

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\n' +
                ", catchPhrase='" + catchPhrase + '\n' +
                ", bs='" + bs + '\n' +
                '}';
    }
}
