package person2;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		//コンストラクタ①を使ったインスタンス化
		
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		//コンストラクタ②を使ったインスタンス化
		
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		//コンストラクタ③を使ったインスタンス化
		
		Person person = new Person(25);
		System.out.println(person.name);
		System.out.println(person.age);
		//コンストラクタ④を使ったインスタンス化
		
		Person hanako = new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		//コンストラクタ⑤を使ったインスタンス化
	}

}
