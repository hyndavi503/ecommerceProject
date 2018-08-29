package maven.demo.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Mobile  extends Product
{
private int ram;
private int rom;
private int frontCam;
private int backCam;
private String processor;

public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getRom() {
	return rom;
}
public void setRom(int rom) {
	this.rom = rom;
}
public int getFrontCam() {
	return frontCam;
}
public void setFrontCam(int frontCam) {
	this.frontCam = frontCam;
}
public int getBackCam() {
	return backCam;
}
public void setBackCam(int backCam) {
	this.backCam = backCam;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
@Override
public String toString() {
	return "Mobile [ram=" + ram + ", rom=" + rom + ", frontCam=" + frontCam + ", backCam=" + backCam + ", processor="
			+ processor + "]";
}

}
