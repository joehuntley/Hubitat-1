metadata {
	definition (name: "Fibaro FGBS-222 Child Analog Input", namespace: "christi999", author: "", importUrl: "https://raw.githubusercontent.com/muchu999/Hubitat/Test-Packages/Fibaro%20FBGS-222%20Smart%20Implant/Fibaro%20FBGS-222%20Child%20Analog%20Input.groovy") {
		capability "Refresh"
		capability "Voltage Measurement"
		capability "Sensor"
     
	}
}

void refresh() {
	parent.childRefresh(device.deviceNetworkId)
}


