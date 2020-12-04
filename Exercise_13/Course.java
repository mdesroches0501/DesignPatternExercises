public class Course
{
  private String name;
  private String number;
  private String description;

  public Course(String _name, String _number, String _description)
  {
    name = _name;
    number = _number;
    description = _description;
  }

  public String getName()
  {
    return name;
  }

  public String getNumber()
  {
    return number;
  }

  public String getDescription()
  {
    return description;
  }

  public void setName(String n)
  {
    name = n;
  }

  public void setNumber(String n)
  {
    number = n;
  }

  public void setDescription(String d)
  {
    description = d;
  }
}