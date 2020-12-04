class Main {
    public static void main(String[] args) {
      Component leftArm = new Object("Left arm");
      Component rightArm = new Object("Right arm");
      Component arms = new Object("Both arms");
      Component cyl1 = new Cylinder(4, 5);
      Component cyl2 = new Cylinder(4, 5);
      Component sph1 = new Sphere(2);
      Component sph2 = new Sphere(2);
      leftArm.add(cyl1);
      leftArm.add(sph1);
      rightArm.add(cyl2);
      rightArm.add(sph2);
      arms.add(leftArm);
      arms.add(rightArm);
      
      arms.render();
    }
  }