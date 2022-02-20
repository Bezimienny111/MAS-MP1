package MP_1;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		//Ekstensja  == Klasa urządzenia 25 linijka
		//Ekstensja trwałość == Urządzenia metody save/load m
		//Atrybut złożony == klasa licencja w urządzeniu 21 linijka
		//Atrybut opcjonalny == umowa w klasie serwisant == linijka 10
		//Atrybut powtarzalnmy == umowy w klasie serwisant == linijka 11
		
		
		
		
		JobContact um = new JobContact(new SimpleDateFormat(),new SimpleDateFormat(),3000.0f );
		JobContact um2 = new JobContact(new SimpleDateFormat(),new SimpleDateFormat(),9000.0f );
		JobContact um3 = new JobContact(new SimpleDateFormat(),new SimpleDateFormat(),8000.0f );
		JobContact um4 = new JobContact(new SimpleDateFormat(),new SimpleDateFormat(),5000.0f );
		JobContact atrPoch = new JobContact(new SimpleDateFormat(),new SimpleDateFormat(),64000.0f );
		
		System.out.println("atrubut Klasowy");
		System.out.println(JobContact.getStawkaIProg());
		
		System.out.println("atrybut pochodny");
		System.out.println(atrPoch.getNetSalary()); ;// atrybut pochodny
		System.out.println("metoda klasowa");
		Device.printTyp(Type.PRINTER);// metoda klasowa
		Device.printTyp(Type.LAPTOP);// metoda klasowa
		//System.out.println(um.getNetSalary());
		Device u1 = new Device(Type.LAPTOP,"514158","Dell","Lattidue");
		Device u2 = new Device(Type.LAPTOP,"514158","Dell","Lattidue",new Licence("Windows","54214fae-dsafa"));
		System.out.println("licencja jako atrybut złożony");
		Device u3 = new Device(Type.PC,"514158","Dell","Lattidue",new Licence("Windows","54214fae-dsafa")); // licencja jako atrybut złożony
		Device u4 = new Device(Type.PC,"514158","Dell","Lattidue",new Licence("Windows","54214fae-dsafa"));  // licencja jako atrybut złożony
		Device u5 = new Device(Type.OHTER,"514158","Dell","Lattidue",new Licence("Windows","54214fae-dsafa"));
		
		
		// -------------------------------- 
		// Ekstensja trwałość 
		// -------------------------------- 
		Device.SaveToFile();// Ekstensja trwałość 
		
		System.out.println(u1);
		System.out.println();
		System.out.println(u2);
		//System.out.println();
		System.out.println(u3);
		System.out.println();
		//System.out.println(u4);
		//System.out.println();
		//System.out.println(u5);
		
		
		
		
		System.out.println("------------------------------------------------");
		System.out.print("Drukarki: ");
		Device.printTyp(Type.PRINTER);// matoda klasowa
		System.out.println("");
		System.out.println("Laptopy: ");
		Device.printTyp(Type.LAPTOP);// matoda klasowa
		System.out.println("------------------------------------------------");
		
		System.out.print("Po zapisie: ");
		System.out.println(Device.getDevices());// Ekstensja trwałość 
		System.out.println();// Ekstensja trwałość 
		Device.deleteDevice(u4);// Ekstensja trwałość 
		
		System.out.print("Po usunięciu: ");
		System.out.println(Device.getDevices());// Ekstensja trwałość 
		System.out.println();// Ekstensja trwałość 
		System.out.print("Po wczytaniu: ");
		Device.LoadFromFile();// Ekstensja trwałość 
		
		System.out.println(Device.getDevices());// Ekstensja trwałość 
		System.out.println("------------------------------------------------");
		
		
		
		
		
		
		Device.printTyp(Type.PRINTER);// matoda klasowa
		Device.printTyp(Type.LAPTOP);// matoda klasowa
		
				
		
		
		System.out.println("---------------");
		ServiceWorker s1 = new ServiceWorker("Robert", "Kowalski"); //atrybut opcjonalny
		ServiceWorker s2 = new ServiceWorker("Michał", "Michałowski", um);//atrybut opcjonalny
		ServiceWorker s3 = new ServiceWorker("Tomasz", "Tomasik", um); // atrybut powtarzalny
		System.out.println(s1);
		System.out.println("---------------");
		System.out.println(s2);
		System.out.println("---------------");
		System.out.println(s3);
		System.out.println("---------------");
		s3.manageContract(um4);// atrybut powtarzalny
		System.out.println(s1);
		System.out.println("---------------");
		System.out.println(s2);
		System.out.println("---------------");
		System.out.println(s3);
		System.out.println("---------------");
		s3.manageContract(um3);// atrybut powtarzalny
		System.out.println(s1);
		System.out.println("---------------");
		System.out.println(s2);
		System.out.println("---------------");
		System.out.println(s3);
		System.out.println("---------------");
		s3.manageContract(um2);// atrybut złożony
		System.out.println(s1);
		System.out.println("---------------");
		System.out.println(s2);
		System.out.println("---------------");
		System.out.println(s3);
		System.out.println("---------------");
		
		//Przesłanianie 
		JobContact Przec1 = new JobContact(new SimpleDateFormat(),new SimpleDateFormat(),5000.0f );
		InternshipContract Przec2 = new InternshipContract(new SimpleDateFormat(),new SimpleDateFormat(),5000.0f );
		System.out.println(Przec1.getNetSalary());
		System.out.println(Przec2.getNetSalary());
		
		//Przeciążanie 
		Licence licPrzec = new Licence("Word","45542gdfgd");
		System.out.println(licPrzec);
		licPrzec.edit("Office");
		System.out.println(licPrzec);
		licPrzec.edit("Windows","4554dfg-454hdf-fsgs");
		System.out.println(licPrzec);
		
		
	//	Client testOne = new Client("Rob","4251");
	//	Device u1 = new Device(Type.LAPTOP,"1","Dell","Lattidue");
	//	System.out.println(testOne);
	//	testOne.addDevice(u1);
	//	System.out.println(testOne);
		//testOne.addDevice(u1);
	//	Client testTwo = new Client("Rob","4251");
	//	testTwo.addDevice(u1);
	//	Device u2 = new Device(Type.LAPTOP,"5","Dell","Lattidue",new Licence("Windows","54214fae-dsafa"));
		//System.out.println(u2);
		//u2.setOwner(testOne);
	//	System.out.println(u2);
	//	System.out.println(testOne.getAllDevices());
		//u2.setOwner(testTwo);
		//u2.setOwner(testTwo);
	//	u2.addAccessorieToDevice("Mysz", false);
	//	u2.addAccessorieToDevice("Zasilacz", true);
	//	System.out.println(testOne.getAllDevices());
	//	System.out.println();
	//	System.out.println(u2);
	//	testOne.addDevice(u2);
		//System.out.println(testOne.getAllDevices());
	//	System.out.println(u1.toString());
	//	testOne.removeDevices();
	//	System.out.println();
//		System.out.println(testOne.getAllDevices());
	//	System.out.println(u2.toString());
		
		
//		Team teamOne = new Team("Printers");
//		Team teamTwo = new Team("PC");
//		System.out.println(teamTwo);
//		System.out.println();
//		System.out.println(teamOne);
//		
//		
//		ServiceWorker s1 = new ServiceWorker("Robert", "Kowalski"); //atrybut opcjonalny
//		ServiceWorker s2 = new ServiceWorker("Michał", "Michałowski");//atrybut opcjonalny
//		ServiceWorker s3 = new ServiceWorker("Tomasz", "Tomasik"); // atrybut powtarzalny
//		
//		teamOne.addWorker(s2);
//		teamOne.addWorker(s1);
//		teamTwo.addWorker(s3);
//		
//		System.out.println(teamTwo);
//		System.out.println();
//		System.out.println(teamOne);
//		
//		teamTwo.removerWorker(s3);
//	//	s2.deleteFromTeam("PC");
//		s2.deleteFromTeam("Printers");
//		System.out.println(teamTwo);
//		System.out.println();
//		System.out.println(teamOne);
	
	}

}
