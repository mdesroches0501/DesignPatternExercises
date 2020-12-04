class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to your courses...");
    Course course = new Course("Design Patterns", "CS330", "A fun class for you to learn");
    CourseView courseView = new CourseView();

    CourseController courseController = new CourseController(course, courseView);
    courseController.updateView();

    courseController.setCourseDescription("It will teach you to do thing like this");
    courseController.updateView();
  }
}