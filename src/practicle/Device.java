/*Create a Program where we can compare java objects:

Criteria: we have a class called Device with parameters [ id, name, ..., price] [... means you have to add more fields]
You have compared 2 objects using Comparable and make a name compare with Comparator
*/
package practicle;
import java.util.HashSet;
import java.util.Set;
class Device  {	
	int  id;	
	int price;
	String name;
	
	Device(int id , int price, String name){
		
		this.id = id;
		this.price = price;
		this.name= name;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return false;
		}		
	if(obj == null || this.getClass() !=obj.getClass()) {
		return false;
	}	
	Device d = (Device) obj;
	return this.name.equals(d.name) && this.id == d.id && this.name == d.name;		
	}	
@Override
public int hashCode() {
	return this.name.length()%10;
}
}
 class CompareObject{
	
public static void main(String[] args) {
	Device d1 = new Device(1, 500 , "R");
	Device d2 = new Device(2, 6000 , "S");
	Device d3 = new Device(3, 7000 , "T");

	if(d1.hashCode() == d2.hashCode()) {
		System.out.println(d1.equals(d2));
		
	}else {
		System.out.println("not equal");
	}
	
	Set<Device> s = new HashSet<>();
	s.add(d1);
	s.add(d3);
	
	System.out.println(s);

}	
	
}


