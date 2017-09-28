package AbstractFactory;

public class FabricaAbstrata {
	public EspeciesFactory getEspeciesFactory(String type) {
		if ("mamifero".equals(type)) {
			return new MamiferoFactory();
		} else {
			return new ReptilFactory();
		}
	}
}
