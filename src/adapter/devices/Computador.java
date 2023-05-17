package adapter.devices;

import adapter.interfaces.Hdmi;

public class Computador {
    Hdmi porta;

    public void connectPort(Hdmi porta){
        System.out.println("Connecting on HDMI port...");
        this.porta = porta;
    }

    public void sendImageAndSound(String image, String sound){
        if(porta == null){
            System.out.println("Connect a HDMI cable first");
        } else {
            porta.setImage(image);
            porta.setSound(sound);
        }
    }
}
