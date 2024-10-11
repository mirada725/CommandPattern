// concrete receiver for a living room light
public class LivingRoomLight implements Light {

    @Override
    public void on() {
        System.out.println("Switch on() Kitchen Light");
    }

    @Override
    public void off() {
        System.out.println("Switch off() Kitchen Light");
    }
}
