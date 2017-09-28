package AbstractFactory;

public class ReptilFactory extends EspeciesFactory{
	@Override
	public Animal getAnimal(String type) {
		if ("cobra".equals(type)) {
			return new Cobra();
		} else {
			return new Tiranossauro();
		}
	}
}
