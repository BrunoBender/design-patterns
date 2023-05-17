package adapter.adapters;

import adapter.interfaces.Hdmi;
import adapter.interfaces.Vga;

public class HdmiToVgaAdapter implements Hdmi {
    private Vga vga;

    public HdmiToVgaAdapter(Vga vga){
        System.out.println("Connecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImagem(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work with sound");
    }
}
