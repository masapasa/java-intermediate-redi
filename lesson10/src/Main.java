import devices.Device;
import devices.Phone;
import devices.Tablet;
import plans.BasicPlan;
import plans.Plan;
import plans.PremiumPlan;
import plans.StandardPlan;

public class Main {
    public static void main(String[] args) {

        Plan bas = new BasicPlan();
        Plan stand = new StandardPlan();
        Plan prem = new PremiumPlan();

        User alina = new User("alina@mail.com", bas);
        User yana = new User("yana@mail.com", stand);
        User tom = new User("tom@mail.com", prem);

        Device phone = new Phone("IPhoneX", 5.5);
        Device tablet = new Tablet("IPad", 9.4);

        Movie movie = new Movie("Die hard 2");

        alina.watch(phone, movie);

    }
}
