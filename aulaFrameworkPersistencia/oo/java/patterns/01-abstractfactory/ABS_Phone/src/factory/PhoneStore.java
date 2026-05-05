package factory;

import classes.Apple;
import classes.NullPhone;
import classes.OnePlus;
import classes.Phone;
import classes.Samsung;
import java.util.Objects;

public class PhoneStore {

    private PhoneStore() {
    }

    public static Phone getPhone(String brand, String model) {
        if (Objects.equals(brand, "Apple")) {
            return Apple.getPhone(model);
        } else if (Objects.equals(brand, "OnePlus")) {
            return OnePlus.getPhone(model);
        } else if (Objects.equals(brand, "Samsung")) {
            return Samsung.getPhone(model);
        }
        return new NullPhone();
    }
}
