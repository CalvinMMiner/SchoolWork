import java.sql.Date;

class Employee 
{
	private String name;
	private double salary;
	private Date hireDay;
	public boolean equals(Object otherObject) 
	{
		if (this == otherObject) return true;
		if (otherObject == null) return false;
		if (getClass() != otherObject.getClass())return false;
		Employee other = (Employee)otherObject;
		return name.equals(other.name)&& salary == other.salary&& hireDay.equals(other.hireDay);
	}
}