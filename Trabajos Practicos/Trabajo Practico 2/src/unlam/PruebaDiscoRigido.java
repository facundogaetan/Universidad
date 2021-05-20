package unlam;

public class PruebaDiscoRigido {

	public static void main(String[] args) {
		DiscoRigido discos = new DiscoRigido();
		
		System.out.println(discos.cuantosDVD(10));
		System.out.println(discos.cuantosDVD(20));
		System.out.println(discos.cuantosDVD(32));
		System.out.println(discos.cuantosDVD(48));
		
		System.out.println(discos.cuantosBD(10));
		System.out.println(discos.cuantosBD(20));
		System.out.println(discos.cuantosBD(32));
		System.out.println(discos.cuantosBD(48));
	}
}
