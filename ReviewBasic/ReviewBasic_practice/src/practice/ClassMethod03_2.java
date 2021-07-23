package practice;

public class ClassMethod03_2 {
	
	public static void main(String[] args) {
        Human03_2 yamada = new Human03_2();

        System.out.println("私の名前は、" + yamada.name + "です。");
        String profile = yamada.getProfile();
        System.out.println(profile + "です。");

        yamada.greet("田辺");
        yamada.greet(null);
    }

}
