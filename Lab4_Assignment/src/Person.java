/**
 * 
 * @author Thejaswini S
 * Desc : This class has name and age of person with getters and setters
 * 
 *
 */
public class Person {
	/**
	 * person attributes
	 */
	private String name;
	private float age;
	
	/**
	 * setter method for name
	 * @param name of the person
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 * getter method for name
	 */
	public String getName() 
	{
		return name;
	}
	/**
	 * setter method for age
	 * @param age of person
	 */
	public void setAge(float age)
	{
		this.age=age;
	}
	/**
	 * getter method for age
	 * @param age of person
	 */
	public float getAge()
	{
		return age;
	}
	

}
