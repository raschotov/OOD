package designpatterns.structual.bridge.remotes;
import designpatterns.structual.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote{

	public AdvancedRemote(Device device) {
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
