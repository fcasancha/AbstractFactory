package AbstractFactory;

public class Cliente {
	public static void main(String[] args) {
		FabricaAbstrata fabrica = new FabricaAbstrata();

		EspeciesFactory especie = fabrica.getEspeciesFactory("reptil");
		Animal a1 = especie.getAnimal("tiranossauro");
		System.out.println("Som: " + a1.reproduzSom());
		Animal a2 = especie.getAnimal("cobra");
		System.out.println("Som: " + a2.reproduzSom());

		
	}
}
