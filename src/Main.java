public class Main {
    public static void main(String[] args) {


        Light LivingRoomLight = new LivingRoomLight();
        Light kitchenLight = new KitchenLight();

        Command turnkitchenlightOn = new LightOnCommand(kitchenLight);
        Command getTurnkitchenlightOff = new LightOffCommand(kitchenLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnkitchenlightOn);
        remote.pressButton();
    }

}