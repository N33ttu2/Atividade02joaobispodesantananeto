package Quest_03;

public class instanceAviao {
    public static void main(String[] args) {
		Aviao Gol = new Aviao(0, 0, null);
		
		Gol.setAltitude(10);
		Gol.setVelocidade(900);
		
		System.out.println("Altitude: " + Gol.getAltitude() + "KM");
		System.out.println("Velocidade: " + Gol.getVelocidade() + "KM/h");
		
		Gol.reduzirAlt(1);
		Gol.reduzirVel(100);
		
        System.out.println("");
		System.out.println("Altitude: " + Gol.getAltitude() + "KM");
		System.out.println("Velocidade: " + Gol.getVelocidade() + "KM/h");
		

	}

}

    

