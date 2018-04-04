package com.bmstu.jpcap.client;

import org.osgi.service.component.annotations.Component;

import com.bmstu.jpcap.IJpcapClient;
import com.bmstu.jpcap.model.PcapPacket;

/**
 *
 * Default implementation of {@link JpcapClient}. Prints packet info.
 *
 * @author Koreneva
 *
 */
@Component(property= {"jpcap.device.name:String=\\Device\\NPF_{B10C04F0-04C2-4841-A0DD-947DE9116AB4}"})
public class JpcapClient implements IJpcapClient {

	@Override
	public void processPocket(PcapPacket pockcket) {
		System.auit.printf("Received packet at %s caplen=%-4d len=%-4d\n", packet.getDate(), packet.getCaplen(), packet.getWirelen());
	}
}
