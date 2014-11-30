package om.moh.academic.codingbat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
	private String name;
	private int  score;
	private String address1;
	
	public Person() {
	}
	
	public Person(String name, int score, String address1) {
		super();
		this.name = name;
		this.score = score;
		this.address1 = address1;
	}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", score=" + score + ", address1=" + address1 + "]";
	}
	
	
}

class PersonScoreComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getScore() == o2.getScore()) {
			return 0;
		}
		if(o1.getScore() > o2.getScore()) {
			return 1;
		}
		return -1;
	}
}

class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		/*if(o1.getName().compareTo(o2.getName()) == 0) {
			return 0;
		}
		if(o1.getName().compareTo(o2.getName()) == 1) {
			return 1;
		}
		return -1;*/
		return o1.getName().compareTo(o2.getName());
	}	
}

class PersonScoreNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		int result = -1;
		if(o1.getScore() == o2.getScore()) {
			result = o1.getName().compareTo(o2.getName());
		}
		if(o1.getScore() > o2.getScore()) {
			return 1;
		}
		return result;
	}	
}

public class PersonComparator {

	List<Person> people;
	
	public PersonComparator() {
		people = new ArrayList<Person>();
	}
	
	
	
	public static void main(String[] args) {
		PersonComparator app = new PersonComparator();
		app.fillPeople();
		//app.sortByScore();
		//app.sortByName();
		//app.sortedByScoreName();
	}

	



	void printList(List list, String message) {
		System.out.println("************"+message+"******************");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	private void sortedByScoreName() {
		PersonScoreNameComparator compr = new PersonScoreNameComparator();
		Collections.sort(people, compr);
		printList(people, "sortedByScoreName()");
		
	}

	private void sortByName() {
		PersonNameComparator compr = new PersonNameComparator();
		Collections.sort(people, compr);
		printList(people, "sortByName()");
		
	}

	private void sortByScore() {
		PersonScoreComparator compr = new PersonScoreComparator();
		Collections.sort(people, compr);
		printList(people, "sortByScore()");
		
	}
	
	private void sortBy(Comparator comp, String message) {
		PersonNameComparator compr = new PersonNameComparator();
		Collections.sort(people, compr);
		printList(people, "sortBy()");
		
	}


	private void fillPeople() {
		List<Person> subList = new ArrayList<Person>();
		Person p1 = new Person("Mujeeb", 45, "aaaa");
		people.add(p1);
		Person p2 = new Person("Zia", 50, "bbb");
		people.add(p2);
		Person p3 = new Person("Ananad", 45, "ccc");
		people.add(p3);
		Person p4 = new Person("Biju", 60, "dddd");
		people.add(p4);	
		Person p5 = new Person("Arun", 75, "dddd");
		people.add(p5);	
		Person p6 = new Person("Rinu", 76, "dddd");
		people.add(p6);	
		Person p7 = new Person("Saji", 66, "dddd");
		people.add(p4);	
		Person p8 = new Person("Bala", 60, "dddd");
		people.add(p8);	
		printList(people, "Initial List");
		subList = searchPeopleByMark(people,75);
		printList(subList, "searchPeopleByMark()");
		subList = searchPeopleByLetter(people,"a");
		printList(subList, "searchPeopleByLetter()");
	}



	private List<Person> searchPeopleByMark(List<Person> mainList, int i) {
		List<Person> subList = new ArrayList<Person>();
		Iterator itr = mainList.iterator();
		while(itr.hasNext()) {
		     Person p1 = (Person) itr.next(); 
		     if(p1.getScore() >= 75) {
		    	 subList.add(p1);
		     }
		 } 
		return subList;
		
	}



	private List<Person> searchPeopleByLetter(List<Person> mainList, String letter) {
		List<Person> subList = new ArrayList<Person>();
		Iterator itr = mainList.iterator();
		while(itr.hasNext()) {
			Person p1 = (Person) itr.next();
		     if(p1.getName().toUpperCase().startsWith(letter.toUpperCase())){
		    	 subList.add(p1);
		     }
		 } 
		return subList;
	}

}
