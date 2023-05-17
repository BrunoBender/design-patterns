package adapter.devices;

import adapter.interfaces.Vga;

public class MonitorAntigo implements Vga {
    @Override
    public void setImagem(String imagem) {
        System.out.println(">>> This is your video: "+ imagem);
    }
}
