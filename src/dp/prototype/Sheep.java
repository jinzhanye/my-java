package dp.prototype;

import java.util.Date;

public class Sheep implements Cloneable {
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
//        深克隆
//        Sheep s = (Sheep) obj;
//        s.birthday = (Date) this.birthday.clone();
        return obj;
    }

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
