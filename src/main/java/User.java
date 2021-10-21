public class User {
    int id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;


    public User() {
    }

    public User(int id, String name, String username, String email, String phone, String webSite) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = webSite;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\n' +
                ", username='" + username + '\n' +
                ", email='" + email + '\n' +
                ", phone='" + phone + '\n' +
                ", webSite='" + website + '\n' +
                '}'+
                address + "\n" +
                company + "\n" +
                '}';
    }
}
