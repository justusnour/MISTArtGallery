
public class Artist {
	
	
	//artist attributes
	public String name;
	public String location;
	public int age;
	
	
	//getName
	public String getName() {
		return name;
	}
	//setName
	public void setName(String name) {
		this.name = name;
	}
	
	//getLocation
	public String getLocation() {
		return location;
	}
	//setLocation
	public void setLocation(String location) {
		this.location = location;
	}
	
	//getAge
	public int getAge() {
		return age;
	}
	//setAge
	public void setAge(int age) {
		this.age = age;
	}
	
	//print profile method
	public void profile() {
		System.out.println("Artist Profile:");
		System.out.println("------------------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Location: " + location);
		System.out.println("------------------");
	}
	
	
	
}
