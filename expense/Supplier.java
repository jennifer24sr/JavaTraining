package expense;
public class Supplier {

        String name;
        String mailId;
        int userId;
        String img;
        String colour;

    public Supplier(String name, String mailId, int userId, String img, String colour) {
        this.name = name;
        this.mailId = mailId;
        this.userId = userId;
        this.img = img;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", mailId='" + getMailId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", img='" + getImg() + "'" +
            ", colour='" + getColour() + "'" +
            "}";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return this.mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
