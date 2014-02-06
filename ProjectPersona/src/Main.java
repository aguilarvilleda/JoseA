class B{
	int x;//variable de la clase B
	
	void funcion(){//declaramos una funcion dentro de la clase B
		System.out.println("Hola");//Se imprime los valores de la funcion;
	}
	
	B(){//creamos un constructor
		System.out.println("mundo");//se imprime los valores del constructor
	}
	
	B(int num){
		System.out.println("Parametro "+num);
	}
}

public class Main {

	int a;//variable de la clase Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B miObjeto = new B();//Instanciamos la clase B con el nombre MiObjeto
		miObjeto.x = 10;//Asignamos un valor al atributo de la clase B

		B miOtroObjeto = new B();
		miOtroObjeto.x = 20;
		
		System.out.println(miObjeto.x);//Se imprime el valor de los atributos de la clase B
		System.out.println(miOtroObjeto.x);
		
		B obj = new B();//Instanciamos la clase B
		obj.funcion();//Llamamos la funcion de la clase B
		
		B obj2 = new B(16);//Instanciamos la clase B con parametros en el constructor
		obj2.funcion();
		
	}
	public static int funcion(){
		return 1;
	}

}
