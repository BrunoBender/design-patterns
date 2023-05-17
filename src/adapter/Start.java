package adapter;

import adapter.adapters.HdmiToVgaAdapter;
import adapter.devices.Computador;
import adapter.devices.MonitorAntigo;
import adapter.devices.TV;
import adapter.interfaces.Vga;

public class Start {
    public static void main(String[] args) {
        Computador pc = new Computador();

        MonitorAntigo monitorAntigo = new MonitorAntigo();
        TV tv = new TV();

        pc.connectPort(new HdmiToVgaAdapter(monitorAntigo));
        pc.sendImageAndSound("Cat running", "miaaaau");
        pc.connectPort(tv);
        pc.sendImageAndSound("Child plaing", "maaae");
    }
}
