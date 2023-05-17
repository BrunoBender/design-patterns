package adapter.devices;

import adapter.interfaces.Hdmi;

public class TV implements Hdmi {
    @Override
    public void setImage(String image) {
        System.out.println(">>> This is your video: "+ image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println(">>> This is your sound: "+ sound);
    }
}
