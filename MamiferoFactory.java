package AbstractFactory;

public class MamiferoFactory extends EspeciesFactory{
	@Override
	public Animal getAnimal(String type) {
		if ("cachorro".equals(type)) {
			return new Cachorro();
		} else {
			return new Gato();
		}
	}
}
