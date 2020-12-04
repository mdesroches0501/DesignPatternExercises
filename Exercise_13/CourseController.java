public class CourseController {
  private Course model;
  private CourseView view;

  public CourseController(Course model, CourseView view) {
    this.model = model;
    this.view = view;
  }

  public void setCourseName(String name) {
    model.setName(name);
  }
  
  public String getCourseName() {
    return model.getName();
  }

  public void setCourseNumber(String courseNo) {
    model.setNumber(courseNo);
  }

   public String getCourseNumber() {
    return model.getNumber();
  }

  public void setCourseDescription(String description)
  {
    model.setDescription(description);
  }

  public String getCourseDescription()
  {
    return model.getDescription();
  }

  public void updateView()
  {
    view.printCourseDetails(model.getName(), model.getNumber(), model.getDescription());
  }
}