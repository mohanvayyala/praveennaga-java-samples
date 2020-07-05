package com.praveennaga.designpatterns.singleton;

public class SingletonTest {
	
	/*static void useSingleton(){
		Singleton s= Singleton.getInstance();
		System.out.println(s.hashCode());
	}*/

	public static void main(String[] args) throws Exception {
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		System.out.println(s1==s2); //true as hashcodes are same
		
		//Reflection
		
		/*Class classz=Class.forName("com.praveennaga.singletondesign.Singleton");
        Constructor<Singleton> constr=classz.getDeclaredConstructor();
        constr.setAccessible(true);
        Singleton s3=constr.newInstance();
        System.out.println(s2==s3); //false as hashcodes are different but // Runtime error will arise after fixing issue.
        */        
        //Serialization
        /*ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("./s2.ser"));
        oos.writeObject(s2);        
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("./s2.ser"));
        Singleton s4= (Singleton)ois.readObject();        
        System.out.println(s2==s4); //false as hashcodes are different
       */        
       //Cloning
        Singleton s5=(Singleton) s2.Clone();
        System.out.println(s2==s5); //false as hashcodes are different
        
       // In Multithreaded environment hashcodes  are different
        
        /*ExecutorService service=Executors.newFixedThreadPool(2);
        service.submit(SingletonTest:: useSingleton());
        service.submit(SingletonTest:: useSingleton());
        service.shutdown();*/
        
        // Multiple classloaders violates singleton
	}

}
