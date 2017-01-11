package posicion;

public class TestPosicion {

	public static void main(String[] args) {
		Posicion posicion = new Posicion();
		System.out.println("Inicialmente:" + posicion.toString());
		
		Posicion p1 = new Posicion(1,2);
		Posicion p2 = new Posicion(p1);
		
		System.out.println("Creamos una posicion (p1) en x=1 e y=2: " + p1.toString());
		System.out.println("Creamos una posicion (p2 copia de p1)" + p2.toString());
		p1.incrementarX();
		p1.incrementarY();
		System.out.println("Incrementamos p1 x e y: " + p1.toString());
		System.out.println("Vemos que los valores de p2 no son incrementados: " + p2.toString());
		p1.decrementarX();
		p1.decrementarY();
		System.out.println("Decrementamos p1 x e y: " + p1.toString());
		p1.setXY(10, 20);
		System.out.println("Establecemos en p1 (setXY) el valor de x=10 e y=20: " + p1.toString());
		p1.setX(2);
		p1.setY(3);
		System.out.println("Establecemos en p1 (setX, setY) el valor de p1 x=2 e y=3: " + p1.toString());
	}

}
